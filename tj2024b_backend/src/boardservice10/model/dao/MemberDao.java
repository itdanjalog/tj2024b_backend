package boardservice10.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import boardservice10.model.dto.MemberDto;

public class MemberDao {
	
	private Connection conn;		// DB와 연동 결과를 조작하는 인터페이스 
	private String dburl = "jdbc:mysql://localhost:3306/boardservice10"; // 연동할 DB 서버의 URL
	private String dbuser = "root"; // 연동할 DB 서버의 계정명
	private String dbpwd = "1234"; 	// 연동할 DB 서버의 비밀번호 
	
	// + 싱글톤 
	private static MemberDao instance = new MemberDao();
	private MemberDao() {
		try {
			// 1. JDBC 클래스 드라이버 로드 , Class.forName() * 예외처리 try{}catch(){}
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. 설정한 경로/계정/비밀번호 로 DB 서버 연동 시도 하고 결과를 ( 구현체 ) 반환 
			conn = DriverManager.getConnection( dburl , dbuser , dbpwd );
		}catch (Exception e) {
			System.out.println("[DB 연동 실패]" + e );
		}
	}
	public static MemberDao getInstance() { return instance;} 
	
	// 1. 회원가입 SQL 처리 메소드 
	public boolean signup( MemberDto memberDto ) {
		try {
			// [1] SQL 작성한다.
			String sql ="insert into member( mid , mpwd , mname , mphone ) "
					+ "values( '"+memberDto.getMid()+"' , '"+memberDto.getMpwd()+"', '"+memberDto.getMname()+"', '"+memberDto.getMphone()+"' )";
			// [2] DB와 연동된 곳에 SQL 기재한다. 		- 연동된 db에 sql 기재하는 방법 : conn.prepareStatement( SQL )
			PreparedStatement ps = conn.prepareStatement(sql);
			// [3] 기재된 SQL를 실행하고 결과를 받는다. . 	- 기재된 sql를 실행하는 방법 : ps.executeUpdate()
			int count = ps.executeUpdate();
			// [4] 결과에 따른 처리 및 반환를 한다.
			if( count == 1 ) { return true; }
		}catch( SQLException e ) { System.out.println( e ); }
		return false;
	} // f end 
	
	// 3. 아이디찾기 SQL 처리 메소드
	public String findId( MemberDto memberDto ) {
		try {// [1] SQL 작성한다.		// mname = '유재석' ---> mname = ? : mname는 어떤 값이 들어갈지 정해져 있지 않다. 매개(중매)변수
			String sql = "select mid from member where mname = ? and mphone = ? ";
			// [2] DB와 연동된 곳에 SQL 기재한다. + ?매개변수 값 대입 
			PreparedStatement ps = conn.prepareStatement(sql);
				// ps.setString( 1 , "유재석" ); // ps.setString() : mname이 String타입이라서.
				ps.setString( 1 , memberDto.getMname() );
				ps.setString( 2 , memberDto.getMphone() );
			// [3] 기재된 SQL를 실행하고 결과를 받는다.
			ResultSet rs = ps.executeQuery();
			// [4] 결과에 따른 처리 및 반환를 한다.
			if( rs.next() ) { // .next() 다음레코드 이동.
				String findMid = rs.getString("mid");
				return findMid; // 찾았다. 찾은 아이디 반환 
			} // if end 
		} // try end 
		catch(SQLException e ) { System.out.println( e ); }
		return null; // 못 찾았다. null 반환
	} // f end 
	// 4. 비밀번호찾기 SQL 처리 메소드 
	public String findPwd( MemberDto memberDto ) {
		try {
			String sql = "select * from member where mid = ? and mphone = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString( 1 , memberDto.getMid() );
				ps.setString( 2 , memberDto.getMphone() );
			ResultSet rs = ps.executeQuery();
			if( rs.next() ) {
				String findPwd = rs.getString("mpwd");
				return findPwd;
			} // if end
		}catch( SQLException e ) { System.out.println( e ); }
		return null;
	} // f end 
	
} // class end 
































package boardservice10.controller;

import boardservice10.model.dao.MemberDao;
import boardservice10.model.dto.MemberDto;

public class MemberController {
	// + 싱글톤 
	private static MemberController instance = new MemberController();
	private MemberController() {}
	public static MemberController getInstance() { return instance;} 
	
	// 1. 회원가입 컨트롤러 메소드 
	public boolean signup( MemberDto memberDto ) {
		// * 다양한 유효성검사를 넣을 예정 
		boolean result = MemberDao.getInstance().signup( memberDto );
		return result;
	} // f end 
	
	// 3. 아이디찾기 컨트롤러 메소드 
	public String findId( MemberDto memberDto ) {
		// * 다양한 유효성검사를 넣을 예정
		String result = MemberDao.getInstance().findId( memberDto );
		return result;
	} // f end 
	
	// 4. 비밀번호찾기 컨트롤러 메소드 
	public String findPwd( MemberDto memberDto ) {
		// * 다양한 유효성검사를 넣을 예정
		String result = MemberDao.getInstance().findPwd( memberDto );
		return result;
	} // f end 

	// 2. 로그인 컨트롤러 메소드
	private int loginMno = 0; 
	public int getLoginMno() { return loginMno; } // BoardController 에서 호출할 예정[글쓰기]
	// 0이면 비로그인상태 , 0초과이면 로그인상태 = 번호 = 즉 로그인된 회원번호 , PK
	
	public boolean login( MemberDto memberDto ) {
		
		int result = MemberDao.getInstance().login( memberDto );
		// boolean --> int 변경한 이유 : 로그인 성공한 회원번호를 내부적으로 저장하기 위해
		// 회원번호( 1번시작하므로 ) 를 반환받아서 0이면 없는 회원번호 , 0초과이면 있는 회원번호 // 설계
		if( result > 0 ) { // 로그인 성공 
			loginMno = result; // 로그인 성공시 로그인저장변수에 로그인성공한 회원번호 저장 
			return true;
		}else { return false;} 
		
	} // f end 
	
	// 5. 로그아웃 컨트롤러 메소드 
	public void logout( ) {
		loginMno = 0;
	} // f end 
	
	 
} // class end 




























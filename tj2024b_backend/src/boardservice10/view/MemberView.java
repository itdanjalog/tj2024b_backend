package boardservice10.view;

import java.util.Scanner;

import boardservice10.controller.MemberController;
import boardservice10.model.dto.MemberDto;

public class MemberView {
	
	// + 싱글톤 
	private static MemberView instance = new MemberView();
	private MemberView() {}
	public static MemberView getInstance() { return instance;} 
	
	private Scanner scan = new Scanner(System.in);
	
	// 0. (로그인 하기전) 메인 메뉴 메소드 
	public void run( ) {
		while(true) {
			System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기 : ");
			int choose = scan.nextInt();
			if( choose == 1 ) { signup(); } 
			else if( choose == 2 ) { login(); } 
			else if( choose == 3 ) { findId(); }
			else if( choose == 4 ) { findPwd(); }
		} // w end 
	} // f end 
	
	// 1. 회원가입 화면 메소드 
	public void signup() {
		System.out.print("아이디 : ");	String mid = scan.next();
		System.out.print("비밀번호 : ");	String mpwd = scan.next();
		System.out.print("이름 : ");		String mname = scan.next();
		System.out.print("전화번호 : ");	String mphone = scan.next();
		MemberDto memberDto = new MemberDto(mid, mpwd, mname, mphone);
		boolean result = MemberController.getInstance().signup( memberDto );
		if( result ) { System.out.println("[회원가입 성공]");
		}else { System.out.println("[회원가입 실패]"); }
	} // f end 
	
	// 3. 아이디찾기 화면 메소드 
	public void findId() {
		// [1] 입력 
		System.out.print("이름 : ");		String mname = scan.next();
		System.out.print("전화번호 : ");	String mphone = scan.next();
		// [2] 객체화 // 데이터포장( view 에서 controller 이동 )
		// MemberDto memberDto = new MemberDto( mname , mphone ); 
			// 오류? new 키워드 뒤로 생성자가 오는데.. 클래스에 선언된 (매개변수가 일치한)생성자가 만 가능.
			// 방법1. 클래스에서 매개변수2개의 생성자를 만든다. // 방법2. 디폴트 생성자로 인스턴스 생성후 setter 로 값를 넣는다.
		MemberDto memberDto = new MemberDto();
		memberDto.setMname(mname);		memberDto.setMphone(mphone);
		// [3] 컨트롤러 에게 전달(request/요청/매개변수) 하고 응답(response/응답/리턴) 결과 받기 
		String result = MemberController.getInstance().findId( memberDto );
		// [4] 컨트롤러 의 결과에 따른 처리
		if( result != null ) { System.out.println("찾은 아이디 : " + result );}
		else {System.out.println("동일한 회원 정보가 없습니다.");}
	} // f end 
	
	// 4. 비밀번호찾기 화면 메소드 
	public void findPwd() {
		// [1] 입력 
		System.out.print("아이디 : ");	String mid = scan.next();
		System.out.print("전화번호 : ");	String mphone = scan.next();
		// [2] 객체화 // 데이터포장( view 에서 controller 이동 )
		MemberDto memberDto = new MemberDto(); 
		memberDto.setMid(mid);  memberDto.setMphone(mphone);
		// [3] 컨트롤러 에게 전달 하고 응답 결과 받기 
		String result = MemberController.getInstance().findPwd( memberDto );
		// [4] 컨트롤러 의 결과에 따른 처리
		if( result != null ) { System.out.println("찾은 비밀번호 : " + result );}
		else { System.out.println("동일한 회원 정보가 없습니다. "); }
	} // f end 
	

	// 2. 로그인 화면 메소드 
	public void login() {
		// 순서 : 1.입력  -> 2.객체화(선택) -> 3.컨트롤러 에게 전달 하고 응답 결과 받기 -> 4. 컨트롤러 의 결과에 따른 처리
		System.out.print("아이디 : ");	String mid = scan.next(); 
		System.out.print("비밀번호 : ");	String mpwd = scan.next();
		MemberDto memberDto = new MemberDto();
		memberDto.setMid( mid );	memberDto.setMpwd(mpwd);
		boolean result = MemberController.getInstance().login(memberDto);
		if( result ) { 
			System.out.println( "로그인 성공");
			// BoardView 메인메뉴 메소드 호출 
			BoardView.getInstance().index();
		}else {
			System.out.println( "동일한 회원정보가 없습니다.");
		}
		
	} // f end 
	
	// 5. 로그아웃 화면 메소드
	public void logout() {
		MemberController.getInstance().logout();
		System.out.println("로그아웃 되었습니다.");
	} // f end 
	
	// 6. 내정보 보기 화면 메소드 
	public int myInfo() {
		// 받는타입 받는변수 = MemberController.getInstance().myInfo( 주는곳 );
		MemberDto result = MemberController.getInstance().myInfo();
		System.out.println("======== 마이 페이지 ======== ");
		System.out.println("mid : " + result.getMid() );
		System.out.println("mname : " + result.getMname() );
		System.out.println("mphone : " + result.getMphone() );
		System.out.println("mdate : " + result.getMdate() );
		while( true ) { // 서브메뉴 
			System.out.print("1.회원수정 2.회원탈퇴 3.뒤로가기 : ");
			int choose2 = scan.nextInt();
			if( choose2 == 1 ) { }
			else if( choose2 == 2 ) { 
				int state = delete();
				if( state == 0 ) { return 0; }
			} 
			else if( choose2 == 3 ) { break; } // 메뉴에서 무한반복 탈출 // w end -> f end 
		} // w end 
		return 1;
	} //  f end 
	
	// 7. 회원탈퇴 화면 메소드 
	public int delete() {
		System.out.print("정말 회원 탈퇴 하실건까요?  0:예 1:취소 : "); // 버튼 클릭이 없으므로 키보드 입력으로 처리 해야한다.
		int choose2 = scan.nextInt();
		if( choose2 == 0 ) { 
			MemberController.getInstance().delete(); // - 탈퇴처리 컨트롤러 요청 
			return 0; // 탈퇴 했다.
		} 
		return 1; // 탈퇴 안했다.
	} // f end 
	
} // class end 




























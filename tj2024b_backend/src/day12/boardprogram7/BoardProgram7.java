package day12.boardprogram7;

import java.util.Scanner;

/*
 	자바 과제11 : 회원제 게시판
		- 초기메뉴는 로그인 과 회원가입 를 제공한다. 
		- 로그인 성공하면 게시물등록과 게시물출력 를 제공합니다.
			- 단 게시물 등록시 작성자를 현재 로그인된 회원아이디로 자동 등록 됩니다.
	
	1. 시각화 요소 구성 , console 표현하고 싶은 내용물 vs html/css 프로토타입 
	2. 메모리(저장) 구성 , 클래스 vs 엑셀 표
	3. 함수/기능 구성  , 메소드 vs 함수 구성 
	
*/

public class BoardProgram7 { // class start 
	public static void main(String[] args) { // main start 
		// 공통으로 사용되는 저장소 변수
		MemberDto[] members = new MemberDto[100];
		MemberService ms = new MemberService();
		String loginId = null;
		
		while(true) {
			System.out.print("\n 1.회원가입 2.로그인 : ");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if( choose == 1 ) {// 회원가입 함수 호출 
				ms.signUp(scan, members);
			}
			else if( choose == 2 ) {// 로그인 함수 호출 
				loginId = ms.login(scan, members);
			}
		} // w end 
	} // main end 
} // class end 




















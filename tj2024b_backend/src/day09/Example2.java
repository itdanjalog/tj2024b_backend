package day09;

import java.util.Scanner;

/*
	자바 과제9 : 회원 서비스 구현하기 
 		- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수/메소드)/객체 , 배열
 		- 회원은 최대 100명 까지 저장할수 있다.
 		- 회원클래스 와 회원서비스 클래스 정의하시오.
 		- 회원정보는 아이디 , 비밀번호 , 닉네임을 갖습니다.
 		- 회원가입함수 와 로그인함수를 구현하시오.
 			회원가입함수 : 아이디,비밀번호,닉네임 3개의 각 정보를 입력받아 객체 생성후 배열에 저장하기.
 			로그인함수 : 아이디,비밀번호를 입력받아 기존의 저장된 정보와 일치한 정보가 있으면 '로그인성공' 아니면 '로그인실패' 출력한다.
 		- 프로그램 초기 메뉴 : 1.회원가입 2.로그인
 			
	제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
	
	// 순서
	// 1. 구현하고자하는 초기 화면 구성 
	// 2. (객체)클래스 설계 , 메모리 설계 : Member클래스 , id/pw/name
	// 3. 메소드 구성 : MemberService클래스 , signup() , login()
*/
public class Example2 { // class start 
	public static void main(String[] args) { // main start 
		// [*] 배열 선언 , 회원객체 100개를 저장할수 있는 배열 선언 
		Member[] memberArray = new Member[100];
		// [*] 회원 기능 제공하는 객체 생성 
		MemberService ms = new MemberService();
		while(true) { // w start 
			System.out.print("1.회원가입 2.로그인 : ");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if( choose == 1 ) {
				ms.signup( scan , memberArray );
			}
			else if( choose == 2 ) {
				ms.login( scan , memberArray );
			}
		} // w end 
	} // main end 
} // class end 

































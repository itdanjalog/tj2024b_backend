package day06; // 현재 클래스가 위치한 패키지/폴더 명

import java.util.Scanner;

/*

	실습1 : 게시판 프로그램
		- 제목 , 내용 , 작성자 를 입력받아서 저장/출력/삭제/수정 
		- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) 
*/

// 코드 실행 : ctrl+f11
public class BoardProgram1 { // class start // 자바 모든 코드는 class안에 존재한다. 
	public static void main(String[] args) { // main start // 자바의 모든 실행 코드는 main 안에서 시작된다.
		while(true) { // [1] 반복문 , while 무한루프 // w s 
			// [2] 출력함수 , syso + 자동완성 
			System.out.println("===== 게시판 프로그램 ===== ");
			System.out.print("1.등록 2.출력 3.수정 4.삭제 : ");
			// [3] 입력함수 , 
				// 1. 입력객체 : Scanner 변수명 = new Scanner( System.in );
			Scanner scan = new Scanner( System.in );
				// 2. 입력객체 이용한 입력함수 : 변수명.nextXXX();
			int 선택메뉴 = scan.nextInt(); // - 임의 정의한 메뉴번호 선택받기 // - 입력받은 값저장 
			// [4] 연산자 , == 같다
			// [5] 조건문 , if( 조건문 ){ }  
			if(선택메뉴 == 1 ) {  System.out.println(">> 1.등록 선택했습니다.");}
			else if( 선택메뉴 == 2 ) { System.out.println(">> 2. 출력 선택했습니다."); } 
			else if( 선택메뉴 == 3 ) { System.out.println(">> 3. 수정 선택했습니다."); }  
			else if( 선택메뉴 == 4 ) { System.out.println(">> 4. 삭제 선택했습니다."); }
		} // w e 
	} // main end 
} // class end 






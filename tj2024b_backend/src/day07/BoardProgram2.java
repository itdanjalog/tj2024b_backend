package day07;

import java.util.Scanner;

/*
실습2 : 게시판 프로그램
	- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스/객체
	- 제목 , 내용 , 작성자 를 입력받아서 저장/출력 구현
	- 게시물 클래스 설계 하기.
	- 게시물 3개 저장 하기 , 게시물1개당 객체 1개 필요 , 객체1개당 3개의 멤버변수를 갖는다.
*/

// main함수 갖는 실행 클래스 
public class BoardProgram2 { // class start 
	// main + 자동완성
	public static void main(String[] args) { // main start 
		// [5] 클래스 만들기 , 객체 생성 , 게시물 객체 3개를 생성 
		Board board1 = new Board();	Board board2 = new Board(); Board board3 = new Board();	
		while(true) { 								// [1] 반복문 , while , while(true){ } 무한루프 
			System.out.print("1.등록 2.출력 : "); 		// [2] 출력함수 , println
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt(); 			// [3] 입력함수 , Scanner , 
			// [4] 조건문 , if , 코드의 흐름제어
			if( choose == 1 ) { System.out.println(">> 등록 선택했습니다.");
				System.out.println("> 제목 : "); 		String title = scan.next();
				System.out.println("> 내용 : "); 		String content = scan.next();
				System.out.println("> 작성자 : ");	String writer = scan.next();
				if( board1.title == null ) { // [6] 첫번째 객체의 내용물이 비어 있으면 대입 
					board1.title = title; board1.content = content; board1.writer = writer;
				}else if( board2.title == null  ) {
					board2.title = title; board2.content = content; board2.writer = writer;
				}else if( board3.title == null ) {
					board3.title = title; board3.content = content; board3.writer = writer;
				}
			} // if end 
			else if( choose == 2 ) { System.out.println(">> 출력 선택했습니다.");
				if( board1.title != null ) {
					System.out.println("제목:" + board1.title +" / 내용:" + board1.content + "/작성자:"+board1.writer );
				}
				if( board2.title != null ) {
					System.out.println("제목:" + board2.title +" / 내용:" + board2.content + "/작성자:"+board2.writer );
				}
				if( board3.title != null ) {
					System.out.println("제목:" + board3.title +" / 내용:" + board3.content + "/작성자:"+board3.writer );
				}
			} // elseif end 
		} // w end 
	} // main end 
} // class end 










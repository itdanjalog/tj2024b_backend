package day09; // 패키지명

import java.util.Scanner;

/*
실습4 : 게시판 프로그램 - v4
- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스/객체(매개변수/메소드) , 배열
- 제목 , 내용 , 작성자 를 입력받아서 *저장 함수* 와 *출력 함수* 구현 하기
- 게시물 클래스 설계 하기.
- 게시물 최대 100개 저장 하기 , 게시물1개당 객체 1개 필요 , 객체1개당 3개의 멤버변수를 갖는다.
*/
public class BoardProgram4 { // class start 
	public static void main(String[] args) { // main start 
		// (1) 게시물 기능(함수) 을 제공하는 서비스 객체 생성 
		BoardService bs = new BoardService();
		// (2) 게시물 객체 여러개를 저장하는 배열 생성 
		Board[] boards = new Board[100];
		while(true) { // w s
			System.out.print("1.등록 2.출력 : ");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if( choose == 1 ) {
				bs.boardAdd( scan , boards ); // (1) 객체를 통한 메소드 호출 
			}else if( choose == 2 ) {
				bs.boardPrint( boards  ); // (1) 객체를 통한 메소드 호출 
			}
		} // w end
	}// main end 
} // class end 








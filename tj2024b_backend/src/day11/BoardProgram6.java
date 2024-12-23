package day11;

import java.util.Scanner;

/*
 	실습5 : 게시판 프로그램 - v4
	- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스/객체(매개변수/메소드/생성자) , 배열
	- 제목 , 내용 , 작성자 를 입력받아서 *저장 함수* 와 *출력 함수* 구현 하기
	- 게시물 클래스 설계 하기.
		+ 모든 멤버변수는 private 키워드를 적용한다.
		+ 멤버변수는 private 이므로 외부 클래스에서 호출시 getter/setter 함수를 활용한다.
		+ 회원가입 과 로그인시 사용되는 회원객체는 생성자를 활용한다.
	- 게시물 최대 100개 저장 하기 , 게시물1개당 객체 1개 필요 , 객체1개당 3개의 멤버변수를 갖는다.

	boardService1 :  변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) 
	boardService2 : + 클래스/객체
	boardService3 : + 배열 
	boardService4 : + 메소드
	boardService5 : + 생성자
	boardService6 : + 접근제한자 + getter/setter

*/

// (1) main함수 갖는 프로그램 실행 클래스 
public class BoardProgram6 { // class start 
	public static void main(String[] args) { // main start 		
	
		BoardDto[] boards = new BoardDto[100];
		BoardService bs = new BoardService();
		
		while(true) { // while start
			System.out.print("1.등록 2.출력");
			Scanner scan = new Scanner(System.in); 
			int choose = scan.nextInt();
			
			if( choose == 1 ) {
				bs.boardAdd(scan, boards);	
			}else if( choose == 2 ) {
				bs.boardPrint(boards); 
			} // if end 
			
		} // while end
		
	} // main end
} // class end 






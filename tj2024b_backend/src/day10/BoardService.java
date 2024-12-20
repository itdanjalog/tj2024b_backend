package day10;

import java.util.Scanner;

public class BoardService { // class start 
	// 클래스 멤버
	// 1. 멤버변수 
	
	// 2. 생성자
	
	// 3. 메소드/멤버함수
		// 1. 등록 함수 boardadd , 실행조건 : 주메뉴에서 1입력시 , 매개변수 : 입력객체 / 게시물목록[] , 반환값 : 없음
	void boardAdd( Scanner scan , Board[] boards ) {
		System.out.println("제목 : "); String title = scan.next();
		System.out.println("내용 : ");	String content = scan.next();
		System.out.println("작성자 : ");	String writer = scan.next();
		// *********** 생성자를 이용한 객체 생성 *********** //
		Board board = new Board( title , content , writer ); 
		for( int index = 0 ; index <= boards.length -1 ; index++ ) {
			if( boards[index] == null ) {
				boards[index] = board;
				break;
			}
		}
	}
		// 2. 출력 함수 boardPrint , 실행조건 : 주메뉴에서 2입력시 , 매개변수 : 게시물목록[] , 반환값 : 없음
	void boardPrint( Board[] boards ) {
		for( int index = 0 ; index <= boards.length - 1 ; index++ ) {
			if( boards[index] != null ) {
				System.out.printf("순번 : %d , 제목 : %s , 내용 : %s , 작성자 : %s \n" ,
						index  , boards[index].title , boards[index].content , boards[index].writer );
			
			}
		}
	}

} // class end 










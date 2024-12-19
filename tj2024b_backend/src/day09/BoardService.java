package day09;

import java.util.Scanner;

public class BoardService { // class s
	// 1. 멤버변수 
	// 2. 메소드/멤버함수
	//반환타입 함수명( 타입 매개변수~ ){}
	void boardAdd( Scanner scan , Board[] boards ) { // m s
		 // [1] 입력받기 
		System.out.println("> 게시물 등록합니다.");
		System.out.print("제목 : ");		
		String title = scan.next();
		System.out.print("내용 : ");		
		String content = scan.next();
		System.out.print("작성자 : ");	
		String writer = scan.next();
		// [2] 객체 생성 
		Board board = new Board(); 
		board.title = title;
		board.content = content;
		board.writer = writer;
		// [3] 객체를 배열에 저장
		boolean saveState = false;
		for( int index = 0 ; index<boards.length-1 ; index++) {
			if( boards[index] == null ) {
				boards[index] = board;
				saveState = true;
				break;
			}
		}
		if( saveState ) { System.out.println("등록 성공했습니다.");}
		else { System.out.println("등록 실패했습니다.");}
	} //  m end 
	
	void boardPrint( Board[] boards ) { // m s
		System.out.println("> 게시물 출력합니다.");
		for( int index = 0 ; index <= boards.length - 1 ; index++ ) {
			Board board = boards[index];
			if( board != null ) {
				System.out.printf("순번 : %d , 제목 : %s , 내용 : %s , 작성자 : %s \n" ,
						index  , board.title , board.content , board.writer );
			}
		} // for end 
		
	} // m end 
} // class e 







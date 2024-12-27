package day14.boardprogram9.view;

import java.util.ArrayList;
import java.util.Scanner;

import day10.Board;
import day14.boardprogram9.controller.BoardController;
import day14.boardprogram9.model.dto.BoardDto;

public class BoardView {
	private BoardView(){}// + 싱글톤 
	private static BoardView instance = new BoardView();
	public static BoardView getInstance() { return instance; } // - 싱글톤 
	// +  입력객체( 현재 클래스내부의 모든 함수들에서 사용하기 위해 멤버변수에 선언 )
	private Scanner scan = new Scanner(System.in);
	// 0. 메인페이지 표현 함수 
	public void run() {
		while(true) {
			System.out.print(" 게시물 1.C 2.R 3.U 4.D : ");
			int choose = scan.nextInt();
			if( choose == 1 ) { create(); } 
			else if( choose == 2 ) { readAll(); }
			else if( choose == 3 ) { update(); }
			else if( choose == 4 ) { delete(); }
		}
	} // f end 
	
	// 1. 게시물 쓰기 페이지 함수 
	public void create( ) { System.out.println("[C]");
		// [1] 저장할 게시물 정보를 입력받는다.
		System.out.print("title : ");		String title = scan.next();
		System.out.print("content : "); 	String content = scan.next();
		System.out.print("writer : "); 		String writer = scan.next();
		// [2] 게시물 정보를 하나의 객체 로 만든다. 생성자를 이용하여 빠른 초기화
		BoardDto boardDto = new BoardDto(title, content, writer);
		// [3] 객체를 컨트롤러에게 전달하고 쓰기 결과를 받는다.
		boolean result = BoardController.getInstance().create( boardDto );
		// [4] 받은 결과에 따른 메시지 출력한다.
		if( result ) { System.out.println("[ save success ]");}
		else { System.out.println("[save fail]");}
	} // f end 
	
	// 2. 게시물 출력 페이지 함수 
	public void readAll() { System.out.println("[R]");
		// [1] 컨트롤에게 모든 게시물 정보를 요청한다.
		ArrayList< BoardDto > result = BoardController.getInstance().readAll();
		// [2] 요청받은 모든 게시물 정보를 출력한다.
		System.out.println("순번\t작성자\t제목\t내용");
		for( int index = 0 ; index<=result.size()-1 ; index++ ) {
			BoardDto board = result.get(index);
			System.out.printf("%d \t %s \t %s \t %s \n " , 
					index , board.getWriter() , 
					board.getTitle() , board.getContent() );
		}
	} // f end 
	
	// 3. 게시물 수정 페이지 함수 
	public void update() { System.out.println("[U]");
	
	}
	// 4. 게시물 삭제 페이지 함수 
	public void delete() { System.out.println("[D]");
		// [1] 삭제할 인덱스(식별)번호를 입력받는다.
		System.out.print("delete Index : "); 
		int dIndex = scan.nextInt();
		// [2] 삭제할 번호를 컨트롤에게 전달하고 처리결과를 받는다.
		boolean result = BoardController.getInstance().delete( dIndex );
		// [3] 처리결과에 따른 메시지 출력한다.
		if( result ) { System.out.println("[delete success]");}
		else { System.out.println("[delete fail]");}
	}

} // class end 
















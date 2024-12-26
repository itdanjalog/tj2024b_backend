package day13.boardprogram8.view;

import java.util.Scanner;

public class BoardView {
	// + 싱글톤
	private BoardView() {}
	private static BoardView instance = new BoardView();
	public static BoardView getInstance() {
		return instance;
	}
	// - 싱글톤 end 
	
	// + 멤버변수( 입력객체 : 모든 메소드에서 사용하기 위해서 )
	private Scanner scan = new Scanner(System.in);
	
	// 1. 메인페이지 입출력 메소드 	함수명 : 임의
	public void index() {
		while( true ) {
			System.out.print(" [메인 페이지] 1.글등록 2.글출력 : ");
			int choose = scan.nextInt();
			if( choose == 1 ) { write();	}
			else if( choose == 2 ) { findAll(); }
		} // w end 
	} // f end 
	
	// 2. 글쓰기 입출력 메소드 		함수명 : 임의
	public void write() { 
		System.out.println(" [글쓰기 페이지] ");
	} // f end 
	
	// 3. 모든글출력 입출력 메소드 	함수명 : 임의
	public void findAll() {
		System.out.println(" [모든글출력 페이지] ");
	} // f end 
	
} // class end 



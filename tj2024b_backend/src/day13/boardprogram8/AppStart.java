package day13.boardprogram8;

import day13.boardprogram8.view.BoardView;

public class AppStart { // class start 
	
	public static void main(String[] args) { // main start 
	
		// + 싱글톤의 메소드 호출 
		BoardView.getInstance().index();
		// new BoardView().index();
		
	} // main end 
	
} // class end 

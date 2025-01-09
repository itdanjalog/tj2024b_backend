package boardservice10.view;

import java.util.Scanner;

import boardservice10.controller.MemberController;
import boardservice10.model.dto.MemberDto;

public class BoardView {
	// + 싱글톤 
	private static BoardView instance = new BoardView();
	private BoardView() {}
	public static BoardView getInstance() { return instance;} 
	
	private Scanner scan = new Scanner(System.in);
	
	// 0. (로그인 했을때) 메인 메뉴 메소드 // 로그아웃시 탈출 
	public void index() {
		while(true) {
			// + 게시물 전체조회 
			System.out.print("[ 1.로그아웃 2.내정보 3.게시물작성 4.게시물상세보기 ] : ");
			int choose = scan.nextInt();
			if( choose == 1 ) { MemberView.getInstance().logout(); break; }
			else if( choose == 2 ) { MemberView.getInstance().myInfo(); }
			else if( choose == 3 ) { }
			else if( choose == 4 ) { }
		}// w end 
	} // f end 
	
} // class end 




























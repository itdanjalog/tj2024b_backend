package day14.boardprogram9.controller;

import java.util.ArrayList;

import day14.boardprogram9.model.dao.BoardDao;
import day14.boardprogram9.model.dto.BoardDto;

public class BoardController {
	
	private BoardController(){}// + 싱글톤
	private static BoardController instance = new BoardController();
	public  static BoardController getInstance() {
		return instance;
	}
	
	// 1. 게시물 쓰기 제어 함수 
	public boolean create( BoardDto boardDto ) {
		// [1] 매개변수로 받은 값들을 DAO에게 전달하여 처리결과를 요청하고 받는다.
		boolean result = BoardDao.getInstance().create( boardDto );
		// [2] 처리 결과를 VIEW에게 반환한다.
		return result;
	}
	
	// 2. 게시물 출력 제어 함수 
	public ArrayList<BoardDto> readAll(){
		// [1] DAO에게 처리 결과를 요청하고 받는다. 
		ArrayList<BoardDto> result = BoardDao.getInstance().readAll();
		// [2] 처리 결과를 VIEW에게 반환한다.
		return result;
	}
	
	// 3. 게시물 수정 제어 함수 
	
	// 4. 게시물 삭제 제어 함수 
	
} // class end 


















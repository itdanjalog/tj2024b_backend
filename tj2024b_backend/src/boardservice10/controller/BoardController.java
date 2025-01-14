package boardservice10.controller;

import java.util.ArrayList;

import boardservice10.model.dao.BoardDao;
import boardservice10.model.dto.BoardDto;

public class BoardController {
	
	// + 싱글톤 
	private static BoardController instance = new BoardController();
	private BoardController() {};
	public static BoardController getInstance() { return instance;}

	// 1. 전체 게시물 컨트롤러 메소드 
	public ArrayList<BoardDto> findAll(){
		ArrayList<BoardDto> result = BoardDao.getInstance().findAll();
		return result;
	} // f end 
	
	// 2. 개별 게시물 컨트롤러 메소드 
	public BoardDto findById( int bno ) {
		BoardDto boardDto = BoardDao.getInstance().findById( bno );
		return boardDto;
	} // f end 
	
	// 3. 게시물 쓰기 컨트롤러 메소드 
	public boolean write( BoardDto boardDto ) {
		// 현재 로그인 회원의 번호 넣어주기.
		int loginMno = MemberController.getInstance()
				.getLoginMno(); // 현재 로그인된 회원번호 호출 
		
		boardDto.setMno( loginMno ); // dto 에 넣어주기 
		return BoardDao.getInstance().write( boardDto );
	} // f end 
	
	// 4.  카테고리 전체 조회 컨트롤러 메소드 
	public ArrayList<BoardDto> categoryAll( ){
		return BoardDao.getInstance().categoryAll();
	} // f end 
	
	
} // class end 




























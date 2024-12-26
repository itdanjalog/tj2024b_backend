package day13.boardprogram8.model.dao;

import day13.boardprogram8.model.dto.BoardDto;

public class BoardDao {
	
	private BoardDao(){} // + 싱글톤 
	private static BoardDao instance = new BoardDao();
	public static BoardDao getInstance() { return instance; } // - 싱글톤 
	
	// +멤버변수( 모든 게시물정보를 갖는 배열 , 데이터베이스 역할 )
	private BoardDto[] boardDB = new BoardDto[100];
	
	// 1. 글쓰기 처리 메소드 	, 함수명 : 임의 , 매개변수 : BoardDto , 리턴값 : boolean
	public boolean write( BoardDto boardDto ) {
		// [1] 매개변수로 받은 저장할boardDto를 배열에 저장한다.
		for( int index = 0 ; index <= boardDB.length-1 ; index++ ) {
			if( boardDB[index] == null ) {
				boardDB[index] = boardDto;
				return true;  // [2] 결과를 controller 응답한다.
			}
		}
		return false; // [2] 결과를 controller 응답한다.
	} // f end 
	
	// 2. 모든글출력 처리 메소드  , 함수명 : 임의 , 매개변수 : x , 리턴값 : BoardDto[]
	public BoardDto[] findAll( ) {
		// [1] 배열내 모든 객체를 controller 에게 응답한다.
		return boardDB;
	} // f end 
	
} // class end 





package boardservice10.controller;

public class BoardController {
	
	// + 싱글톤 
	private static BoardController instance = new BoardController();
	private BoardController() {};
	public static BoardController getInstance() { return instance;}

} // class end 

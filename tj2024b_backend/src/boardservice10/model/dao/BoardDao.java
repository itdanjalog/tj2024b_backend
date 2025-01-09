package boardservice10.model.dao;

public class BoardDao extends Dao {
	// + 싱글톤 
	private static BoardDao instance = new BoardDao();
	private BoardDao() { }
	public static BoardDao getInstance() { return instance;} 
} // class end 








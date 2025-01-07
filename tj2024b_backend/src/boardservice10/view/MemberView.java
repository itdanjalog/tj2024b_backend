package boardservice10.view;

public class MemberView {
	
	// + 싱글톤 
	private static MemberView instance = new MemberView();
	private MemberView() {}
	public static MemberView getInstance() { return instance;} 
	
} // class ned 

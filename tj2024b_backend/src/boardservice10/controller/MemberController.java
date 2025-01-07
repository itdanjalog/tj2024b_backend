package boardservice10.controller;

public class MemberController {
	// + 싱글톤 
	private static MemberController instance = new MemberController();
	private MemberController() {}
	public static MemberController getInstance() { return instance;} 
}

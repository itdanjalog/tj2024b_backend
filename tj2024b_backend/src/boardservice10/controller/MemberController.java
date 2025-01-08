package boardservice10.controller;

import boardservice10.model.dao.MemberDao;
import boardservice10.model.dto.MemberDto;

public class MemberController {
	// + 싱글톤 
	private static MemberController instance = new MemberController();
	private MemberController() {}
	public static MemberController getInstance() { return instance;} 
	
	// 1. 회원가입 컨트롤러 메소드 
	public boolean signup( MemberDto memberDto ) {
		// * 다양한 유효성검사를 넣을 예정 
		boolean result = MemberDao.getInstance().signup( memberDto );
		return result;
	}
	
	// 3. 아이디찾기 컨트롤러 메소드 
	public String findId( MemberDto memberDto ) {
		// * 다양한 유효성검사를 넣을 예정
		String result = MemberDao.getInstance().findId( memberDto );
		return result;
	}
	
	// 4. 비밀번호찾기 컨트롤러 메소드 
	public String findPwd( MemberDto memberDto ) {
		// * 다양한 유효성검사를 넣을 예정
		String result = MemberDao.getInstance().findPwd( memberDto );
		return result;
	}
	
} // class end 




























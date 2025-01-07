package boardservice10;

import boardservice10.view.MemberView;

public class AppStart {
	public static void main(String[] args) {
		
		// + 싱글톤의 메소드를 호출하는 방법 : 클래스명.getInstance().메소드명()
		MemberView.getInstance().run();
		
	} // main end 
} // class end 

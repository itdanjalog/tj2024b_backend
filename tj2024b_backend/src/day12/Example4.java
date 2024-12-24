package day12;

class Member{
	String name;
	static int age;
	boolean getAge() { return true; }
	static int getName() { return 10; }
}

public class Example4 {
	// 함수 호출 판단
		// 1. 호출하고자 하는 메소드가 같은 클래스인지 다른 클래스인지?
		// 2. 호출하고자 하는 메소드가 static(정적) 인지 아닌지? 
		// 3. 호출하고자 하는 위치의 메소드가 static(정적) 인지 아닌지?
			// - static 없는 메소드는 객체를 통해 호출		, 변수명.메소드명() 
			// - static 있는 메소드는 클래스를 통해 호출 	, 클래스명.메소드명()
	
	// static 정적메소드
	public static void main(String[] args) {
		// [1] 정적(main) 메소드 안에서 동일한 클래스 메소드 호출하기.
		// signup(); // main함수가 우선 할당 되므로 signup함수를 모른다.
			// 해결방안 
		Example4 example4 = new Example4();
		example4.signup();
		
		// [2] 정적(main) 메소드 안에서 동일한 클래스 static 메소드 호출하기 
		login(); // main함수가 우선 할당 되고 login함수도 우선할당 이므로 호출 가능하다.
			// --> 다른 클래스 static 메소드 이면 , 클래스명.static메소드명(); 
		Member.getName();
		
		// [3] 메소드 안에서 동일한 클래스 메소드 호출하기.
		// 함수명();
		
		// [4] 메소드 안에서 서로 다른 클래스의 메소드 호출하기.
		// 1.클래스명 변수명 = new 생성자();
		// 2.변수명.함수명();
		
	} // f end 
	
	// 메소드 
	void signup() { // 메소드 // 멤버함수 
		myInfo(); // 같은 클래스 메소드
		Member member = new Member();
		member.getAge(); // 서로 다른 클래스이면 객체 필요하다.
	}
	
	void myInfo() { }
	
	// 정적 메소드 
	static void login() { }
	
	
} // class end 



















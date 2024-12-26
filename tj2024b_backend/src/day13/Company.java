package day13;

public class Company {
	// 단계1 : private 디폴트생성자 선언하기 
	private Company() {} 
		// - private 생성자 이므로 다른클래스(외부)에서 객체생성 불가능 하다.
	
	// 단계2 : 클래스내부에 static 인스턴스 선언/생성하기
	private static Company instance = new Company();
		// - 클래스내부에 미리 객체를 생성한다.
		// - static 이므로 프로그램 시작시 객체가 생성된다.
		// - private 이므로 다른클래스(외부)에서 접근이 불가능하다.
	
	// 단계3 : 외부에서 참조할 수 있는 public 메소드 선언하기
	public static Company getInstance() {
		if( instance == null ) {
			instance = new Company();
		}
		return instance;
	}
		// - public 이므로 내부에 만든 객체를 다른클래스(외부)에서 접근할수 있도록 한다.
		// - static 이므로 프로그램 시작시 메소드가 할당된다.
		// - return instance 하므로써 내부에 미리 만든 (싱글톤)객체를 반환다.

	public void method() {}
	
} // class end 












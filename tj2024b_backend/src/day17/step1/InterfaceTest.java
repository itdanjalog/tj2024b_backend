package day17.step1;

public interface InterfaceTest {
	
	// 인터페이스 멤버
	// 1. 상수
	// int value1; // 오류 :인터페이스는 변수를 갖지 못한다.
	
	// (1) 상수만들기1 : 변수가 아닌 상수로 자동으로 상수로 초기화 했다.
	int value2 = 10;
	// (2) 상수만들기2 : public static final 키워드를 이용한 상수 만들기
	public static final int value3 = 20;
	
	// 2. 추상메소드
	// int method1( int a ) { } // 오류 : 일반 메소드는 인터페이스가 갖지 못한다.
	// (1) 추상메소드 만들기1
	int method2( int a );
	// (2) 추상메소드 만들기2
	abstract int method3( int a );
	
} // class end 

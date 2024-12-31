package day16.step2;

class 상위클래스{
	int value1 = 10;	int value3 = 30 ;
	public 상위클래스() { System.out.println("[상위클래스 인스턴스 생성]"); }
	public void showSuperValue() {  System.out.println("[상위클래스]");  }
} // class end 
class 하위클래스 extends 상위클래스{
	int value1 = 100;	int value2 = 200;
	public 하위클래스() { System.out.println("[하위클래스 인스턴스 생성]"); };
	public void showSubValue() { 
		System.out.println( "[하위클래스]" + ( this.value1 ) + // 100	
								" " + ( super.value1 ) ); 	// 10			
	}
} // class end 
public class Example2 { 
	public static void main(String[] args) {
		// 1. 상위클래스 인스턴스 생성 
		상위클래스 obj1 = new 상위클래스();
		System.out.println( obj1.value1 ); 	//10 // 본인 인스턴스의 멤버변수 호출 // 단 하위 클래스의 멤버변수 접근 불가능
		// 2. 하위클래스 인스턴스 생성 
		하위클래스 obj2 = new 하위클래스();
		System.out.println( obj2.value1 ); 	//100 // 만일 상위클래스와 하위클래스의 멤버변수명이 동일하면 현재 인스턴스 의 멤버변수가 우선순위 
		System.out.println( obj2.value2 );	//200
		System.out.println( obj2.value3 ); 	//30 하위 클래스의 인스턴스는 상위 클래스의 멤버변수 호출 가능.
		// 3. 하위클래스 에서 메소드 호출 
		obj2.showSubValue(); 	// 현재 인스턴스의 메소드 호출 // 100 //10
		obj2.showSuperValue(); 	// 현재 인스턴스가 물려받은 메소드 호출
		// * 
		하위클래스 obj3 = new 하위클래스();
		obj3.value1 = 300;
		obj3.showSubValue();  	// [하위클래스]300 10
		// * 생성자 
		하위클래스 obj4 = new 하위클래스(); 
			// 생성자 실행 총 횟수 : 3번 // 인스턴스 개수 : 3개
		
	}
}





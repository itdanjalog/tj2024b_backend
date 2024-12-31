package day16.step1;


class A { }				// 부모 : object	, 자식 : B C , 자손 : D E
class B extends A{ }	// 부모 : A		, 자식 : D 
class C extends A{ }	// 부모 : A		, 자식 : E
class D extends B{ }	// 부모 : B		, 자식 : 
class E extends C{ }	// 부모 : C		, 자식 : 
public class Example1 { // class s
	public static void main(String[] args) { // main s
		B b = new B();  // b클래스 의 인스턴스(객체)	B인스턴스 -> A인스턴스 -> Object인스턴스 
		C c = new C();	// c클래스 의 인스턴스(객체)	c인스턴스 -> A인스턴스 -> Object인스턴스 
		D d = new D();	// d클래스 의 인스턴스(객체)  d인스턴스 -> b인스턴스 -> a인스턴스 -> object인스턴스
		E e = new E();	// e클래스 의 인스턴스(객체)	e인스턴스 -> c인스턴스 -> a인스턴스 -> object인스턴스
		// [1] 자동 타입변환 , 묵시적 타입변환 
		A a1 = b;	 A a2 = c;		A a3 = d;		A a4 = e;
		B b1 = b;	 B b3 = d;		
		// B b2 = c; B b4 = e; 		// 형제간의 타입 변환은 불가능하다.
		C c2 = c;	C c4 = e;
		//C c1 = b;	 //C c3 = d; 	// 형제간의 타입 변환은 불가능하다.
		// [2] 강제 타입변환 , 명시적 타입변환  , 캐스팅 
		B b5 = (B)a1;			// A타입 을 B타입으로 변환 
		E e5 = (E)a4;			// A타입 을 E타입으로 변환		
		// E e6 = (E)a1;		// A타입 을 E타입으로 변환 // 오류 발생  //class day16.step1.B cannot be cast to class day16.step1.E
		// D d6 = (D)a2; 		// A타입 을 D타입으로 변환 //  오류 발생 //class day16.step1.C cannot be cast to class day16.step1.D
		// [3] 본래의 인스턴스를 확인 방법 , instanceof 키워드 , 남이 만든 클래스에 대해 참조를 확인 방법
		System.out.println( a1 instanceof A ); 		// a1변수가 참조하는 인스턴스에 A타입이 존재해? true
		System.out.println( a1 instanceof Object ); // a1변수가 참조하는 인스턴스에 Object타입도 존재해? true 
		System.out.println( a1 instanceof C ); 		// a1변수가 참조하는 인스턴스에 C타입이 존재해? false 
		System.out.println( a4 instanceof B); 		// a4변수가 참조하는 인스턴스에 B타입이 존재해? false
	} // main e 
} // class e 



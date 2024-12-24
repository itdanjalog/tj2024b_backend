package day12;
class Person{
	// 1. 멤버변수
	String name; int age;
	// 2. 생성자
		// 1. 디폴트 생성자 : 매개변수가 없는 생성자
	Person( ){ 
		// this.name="이름없음"; // this() 이전에 코드를 넣으면 오류발생
		this("이름없음" , 1);	// 2번째 생성자에게 인수값을 전달
		// this.멤버변수  : 인스턴스의 멤버변수 가리킨다.  
		// this( )		: 인스턴스의 생성자를 가리킨다.
	} 
		// 2. 사용자정의 생성자 : 개발자가 매개변수를 임의로 해서 만든 생성자
	Person( String name , int age  ){
		this.name = name;
		this.age = age;
		// this란 현재 생성자를 호출한 인스턴스의 멤버변수가리킨다.
		// this.name : 인스턴스의 멤버변수 가리킨다.
		// name : 매개변수 가리킨다.
		// 관례적으로 생성자의 매개변수와 클래스 멤버변수 명은 동일하게 한다.
	}
	// 3. 메소드
	
} // class end

public class Example2 { // class start 
	public static void main(String[] args) {
		
		Person noName = new Person();
		System.out.println( noName.name );	// 이름없음
		System.out.println( noName.age );	// 1
		
		Person yesName = new Person("유재석" , 40);
		System.out.println( yesName.name );	// 유재석
		System.out.println( yesName.age );	// 40
		
		/*
		 	클래스 : 2개 , Person , Example2
		 	객체(인스턴스) : 2개 , new Person(); , new Person("유재석" , 40);
		 	할당된멤버변수 : 4개 , 
		 		( String name; int age; ) 
		 		( String name; int age; )
	 		// this.멤버변수  : 인스턴스의 멤버변수 가리킨다.  
			// this( )		: 인스턴스의 생성자를 가리킨다.
			// this			: 인스턴스의 참조값을 호출된다.
		 */
		
	}
} // class end 


















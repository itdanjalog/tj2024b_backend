package day09;

public class Person {
	// + 멤버변수 
	String name;	// 이름
	float height;	// 키
	float weight;	// 몸무게 
	
	// + 생성자 : 객체를 처음 만들때 멤버변수나 상수를 초기화 하는것 
		// 종류 : 
		//		1. 디폴트생성자 생성자가 없는 클래스는 컴파일에서 자동으로 생성자를 만들어준다.
		//		2. 임의의 매개변수를 사용하는 생성자
		// 목적 : 주로 멤버변수에 대한 값들을 매개변수로 받아서 인스턴스가 생성될 때 멤버변수 값들을 *초기화* 역할 
		// 선언규칙 : *생성자명 과 클래스명* 과 동일하게 한다. 함수와 동일하게 매개변수는 존재할수 있지만 반환값은 없다.
		// 오버로드 : 동일한 생성자명을 여러개 선언 , *전제조건* 매개변수의 개수,타입,순서 에 다를경우에만 가능. ( 매개변수명 제외 ) 
	
		// 생성자 만들기
	Person( ){ } // 디폴트생성자 : 초기화를 하지 않는 생성자
	Person( String pname ){ // 함수와 비슷하게 구성하지만 반환값이 없다.
		name = pname;
	}
	Person( String name , float height , float weight ){
		// 매개변수 이름 과 멤버변수의 이름이 같으면 식별이 불가능.
		// + this키워드 : 현재 객체가 멤버변수를 가리킬때 사용하는 키워드
		// this.멤버변수
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
}











package day15.step1;

// [1] 동물 클래스 
class 동물{
	String myName; // 멤버변수 
	동물(){ 
		myName ="동물"; 
		System.out.println("[[ 동물 생성자 탄생 ]]");
	} // 생성자 end
	void showMe() {
		System.out.println("myName : " + this.myName );
	} // f end 
} // class end 
// [2] 조류 클래스 , 조류클래스는 동물 클래스로부터 상속받기 
class 조류 extends 동물{
	조류(){
		myName = "조류";
		System.out.println("[[ 조류 생성자 탄생 ]]");
	}
} // class end 
// [3] 참새 클래스 , 참새클래스는 조류 클래스로부터 상속받기 
class 참새 extends 조류{
	참새(){ myName = "참새";
		System.out.println("[[ 참새 생성자 탄생 ]]");
	}
} // class end 
// [4] 닭 클래스 , 닭 클래스는 조류 클래스로부터 상속받기 
class 닭 extends 조류 {
	닭(){
		myName = "닭";
		System.out.println("[[ 닭 생성자 탄생 ]]");
	}
}

public class Example1 {
	public static void main(String[] args) {
		
		// [ 인스턴스 ]
		// 1. 동물 인스턴스(객체) 생성 	
		동물 animal = new 동물();		animal.showMe();	// Object 생성자 --> [[ 동물 생성자 탄생 ]] , myName : 동물
		// 2. 조류 인스턴스(객체) 생성 , *** 하위 클래스의 인스턴스를 생성하면 상위 클래스의 인스턴스도 같이 생성된다. ***
		조류 bird = new 조류();		bird.showMe();		// Object 생성자 -->  [[ 동물 생성자 탄생 ]] , [[ 조류 생성자 탄생 ]] , myName : 조류
		// 3. 참새 인스턴스(객체) 생성 , *** 하위 클래스의 생성자를 호출하면 상위 클래스의 생성자가 호출된다.
		참새 sparrow = new 참새();		sparrow.showMe();	// Object 생성자 -->  [[ 동물 생성자 탄생 ]] , [[ 조류 생성자 탄생 ]] , [[ 참새 생성자 탄생 ]] , myName : 참새
		
		// [ 타입변환 ]
			// - 참새는 조류가 될수 있고 , 동물이 될수 있다.
			// 즉] 자식 타입의 자료는 부모 타입으로 변환이 자동으로 가능하다. 자식객체는 부모타입을 참조한다.
		조류 bird2 = sparrow; // 참새 타입의 자료(객체) 가 조류 타입으로 변환이 된다. ( 자동타입변환 )
		동물 animal2 = sparrow; // 참새 타입의 자료(객체) 가 동물 타입으로 변환이 된다. ( 자동타입변환 )
		Object obj2 = sparrow;	// 참새 타입의 자료(객체) 가 Object 타입으로 변환이 된다.( 자동타입변환 )
			
			// - 동물은 조류 과 참새가 될 수 없다.
			// 즉] 부모 타입의 자료는 자식 타입으로 변환이 될수 없다. 부모객체는 자식타입을 참조하지 않는다.
			// 오류 : class day15.step1.동물 cannot be cast to class day15.step1.참새 
		//참새 sparrow3 = (참새)animal;	// 동물 타입의 자료(객체가) 참새 타입으로 변환이 안된다.
		//조류 bird3 = (조류)animal;		// 동물 타입의 자료(객체)가 조류 타입으로 변횐이 안된다.
		
			// * 캐스팅 * : 가능한 전제조건은 본래 하위 타입의 객체가 상위 타입에서 다시 본래 하위 타입 변환 허용.
			// 즉] 부모 타입의 자료는 자식 타입으로 변환이 될수 없지만 단, 객체가 본래 자식 타입의 객체 이였다면 가능하다.
		동물 animal4 = sparrow; // 참새 타입의 객체 를 동물 타입으로 변환 
		참새 sparrow4 = (참새)animal4; // 동물 타입은 참새 타입으로 변환 가능, 단 객체가 본래 자식 타입 이였다면.
		
			// 형제간의 타입변환이 불가능하다.
		닭 chicken1 = new 닭(); // 인스턴스(4개 생성)
		// 참새 sparrow5 = (참새)chicken1; // 닭은 참새를 모른다. 
		
	} // main end 
} // class end 













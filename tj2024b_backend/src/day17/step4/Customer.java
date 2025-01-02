package day17.step4;

// pulic class Customer extends 클래스명{}
public class Customer implements Buy , Sell {
	// + 상속 : extends 클래스명 
		// - 클래스 1개당 상속은 1개의 클래스 
	// + 구현 : implements 인터페이스A , 인터페이스B
		// - 클래스 1개당 구현은 여러개의 인터페이스 
	
	// + 두 인터페이스의 추상메소드 구체화/구현하기
	@Override
	public void sell() {
		System.out.println("판매하기");
	}
	@Override
	public void buy() {
		System.out.println("구매하기");
	}
} // class end 

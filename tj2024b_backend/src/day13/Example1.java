package day13;

public class Example1 {
	
	public static void main(String[] args) {
	
		// 단계4 : 싱글톤 호출
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		// - 두 변수가 참조하는(갖는) 객체는 동일한 (싱글톤)객체 이다.
		System.out.println( myCompany1 ); // day13.Company@5305068a
		System.out.println( myCompany2 ); // day13.Company@5305068a
	
		// 참고1 : 다른 클래스에서 Compnay객체를 만들수 없다.
		// Company myCompany3 = new Company(); // 오류 
		
		// 참고2 : 싱글톤 내부의 메소드 호출하는 방법
		Company.getInstance().method();
			// - 유재석.밥먹기().공부하기();
			// 실행순서1 : 유재석.밥먹기()
			// 실행순서2 : 밥먹기결과값.공부하기()
		
			// 실행순서1 : Company.getInstance() => 싱글톤(instance) 반환
			// 실행순서2 : instance.method();
	}
} 



package day03;

public class Example3 { // class s 
	public static void main(String[] args) { // main s 
		// p.92 조건문 
		
		int age = 10;		
		// [1] if문
		if( age >= 8 ) { // if s // - 만약에 age(나이)값이 8 이상이면 ("학교에 다닙니다.")출력함수 실행한다.
			System.out.println("학교에 다닙니다.");
		} // if e
		
		// [2] if ~ else문
		if( age >= 8 ) { // if s  // - 만약에 age(나이)값이 8 이상이면 ("학교에 다닙니다.")출력함수 실행한다. 
			System.out.println("학교에 다닙니다.");
		}else { // 아니면 // - 위 조건의 반대 이므로 age(나이)값이 8 이상이 아니다 이므로 ("학교에 다니지 않습니다.")출력함수 실행한다.
			System.out.println("학교에 다니지 않습니다.");
		}  // if e
			
			// * 1분복습 
		char gender = 'F'; 
		if( gender == 'F') {		// (1) if  (2) == 'F'
			System.out.println("여성입니다.");
		}else {						// (3) else 
			System.out.println("남성입니다.");
		}
		
	} // main e 
} // class e 





package day02;

import java.util.Scanner; // - Scanner 클래스를 현재 파일로 불러오기.

public class Example4 { // class s 
	public static void main(String[] args) { // main s 
		
		// [콘솔입력] Scanner 클래스 
		// JS : prompt , document.querySelector().value
		// JAVA : Scanner
		
		
		// 1. 입력 객체 만들기 , 객체 생성 방법 : new 클래스명( ) , 클래스명은 첫글자를 대문자로 시작한다. 
			// new Scanner( ); // Scanner 클래스 , Scanner 클래스 이용한 Scanner 객체 생성 
			// new Scanner( System.in ); // System.in 입력객체 , Scanner 객체 생성시 입력객체를 인수로 전달한다.
			// -
				// Scanner scan; // Scanner 타입으로 'scan' 변수 선언 // 기본타입(8가지)외 참조(클래스)타입
				// scan = new Scanner(System.in); // 'scan' 변수에 Scanner 객체(주소) 대입 했다. 
		Scanner scan = new Scanner(System.in);
		
		// 2. 입력 객체로 콘솔에서 키보드로부터 입력받은 데이터 가져오기 함수 제공한다.
			// - 객체란? 고유한 속성/데이터 과 이벤트/함수 를 가지는 실체물
			// 객체.nextXXX(); 
			// 엔터 기준으로 하나의 (next) 입력 마침 처리한다. 
		
		// [1] 변수명.next() , 키보드로부터 입력받은 데이터를 String 타입으로 반환 함수. 띄어쓰기 불가능.
		System.out.print("[1] .next() 문자열 입력 : "); // 안내문구 출력 
		String str1 = scan.next(); // 콘솔에서 키보드로부터 입력받은 데이터를 String 타입으로 반환 
		System.out.println("[1] .next() 문자열 결과 : " + str1 );
		
		// [2] 변수명.nextLine() , 키보드로부터 입력받은 데이터를 String 타입으로 반환 함수. 띄어쓰기 가능
			// * 주의할점 : nextLine()은 다른 nextXXX()코드와 사용시 앞전 nextXXX()의 엔터를 포함하므로 하나로 인식한다.
			// - 해결방안 : 의미없는 scan.nextLine() 사용하므로 실사용할 nextLine() 구분 하기
		System.out.print("[2] .nextLine() 문자열 입력 : ");
		scan.nextLine(); // 의미없는 nextLine()
		String str2 = scan.nextLine();
		System.out.println("[2] .nextLine() 문자열 결과 : " + str2);
		
		// [3] 변수명.nextInt() , 키보드로부터 입력받은 데이터를 int 타입으로 반환 함수 , 허용범위 넘어가면 오류
		System.out.print("[3] .nextInt() 정수int 입력 : ");
		int value1 = scan.nextInt();
		System.out.println("[3] .nextInt() 정수int 결과 : " + value1 );
		
		// [4] 변수명.nextByte() ,  ~~  byte 타입으로 반환 함수
		byte value2 = scan.nextByte();
		System.out.println("[4] .nextByte() 결과 : " + value2 );
		
		// [5] 변수명.nextShort() , ~~ short 타입으로 반환 함수 
		short value3 = scan.nextShort();
		System.out.println("[5] .nextShort() 결과 : " + value3);
		
		// [6] 변수명.nextLong() ,  ~~ long 타입으로 반환 함수 
		long value4 = scan.nextLong();
		System.out.println("[6] .nextLong() 결과 : " + value4 );
		
		// [7] 변수명.nextFloat() , ~~ float 타입으로 반환 함수 
		float value5 = scan.nextFloat();
		System.out.println("[7] .nextFloat() 결과 : " + value5 );
		
		// [8] 변수명.nextDouble() , ~~ double 타입으로 반환 함수 
		double value6 = scan.nextDouble();
		System.out.println("[8] .nextDouble() 결과 : " + value6 );
		
		// [9] 변수명.nextBoolean() , ~~ boolean 타입으로 반환 함수.
		boolean value7 = scan.nextBoolean();
		System.out.println("[9] .nextBoolean() 결과 : " + value7 );
		
		// + 오류 : 지정한 함수의 반환타입과 입력한 데이터 허용범위 벗어나면 InputMismatchException 발생 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main e 
} // class e 









package day02; // 폴더명 

public class Example2 { // 클래스 시작 

	public static void main(String[] args) { // main 시작 
		
		// 1. 자동 (자료/타입)형 변환 , 묵시적 (자료/타입)형 변환
			// - 1.메모리 크기가 작은 것 부터 큰 순으로 변환
			// - 2.데이터의 손실이 없다.
			// - 3.연산(계산) 중에 큰 값으로 변환된다.( 메모리 손실 방지 )
			// byte -> short , char -> int -> long -> float -> double 
		byte byteValue = 10;				// byte타입 'byteValue' 변수에 10 대입 
		short shortValue = byteValue;		// short타입 'shortValue' 변수에 byte 10를 대입 
		int intValue = shortValue;			// int타입 'intValue' 변수에 short 10를 대입 
		long longValue = intValue;			// long타입 'longValue'변수에 int 10를 대입 
		float floatValue = longValue;		// float타입 'floatValue'변수에 long 10를 대입 
		double doubleValue = floatValue;	// double타입 'doubleValue' 변수에 float 10를 대입 
		System.out.println( "double value : " + doubleValue ); // byte에서 double 까지 자동형변환 
			// + 연산중에 묵시적 형변환  , 연산시 피연산자중에 더 큰 타입으로 결과를 반환한다.
				// byte + byte => int	, 예외] byte와 short 연산 결과는 무조건 int로 반환된다.
				// byte + short => int 	, 
				// int + int => int 
				// int + long => long 
				// int + float => float 
				// float + double => double 
		byte b1 = 10 ; byte b2 = 20; short s1 = 30; int i1 = 40; 
		float f1 = 3.14f; double d1 = 41.25;
		int result1 = b1 + b2;
		int result2 = b1 + s1;
		float result3 = i1 + f1;
		double reuslt4 = f1 + d1;
		
		// 2. 강제 (자료/타입)형 변환 , 명시적 (자료/타입)형 변환 , 캐스팅
			// - 1. 메모리 크기가 큰겂 부터 작은 순으로 변환 
			// - 2. 데이터의 (허용범위 외)손실이 있을수도 있다.
			// - 3. (변환할타입명)변수명
			// - double -> float -> long -> int -> short , char -> byte
		double value1 = 3.14;
		float value2 = (float)value1;
		long value3 = (long)value2;
		int value4 = (int)value3;
		short value5 = (short)value4;
		byte value6 = (byte)value5;
		System.out.println("byte value : " + value6); // 3.14 --> 3 , .14(손실)
		
		// +++ 자바특징중에 다형성(다양한 형식/타입을 가지는 성질 )은 형변환으로 부터 표현할수 있다.
		
		// 
		char ch1 = 'A';
		int int1 = ch1;
		System.out.println( int1 ); // 65 : A , 66 : B , 67 : C <--- 아스키코드표 에서 확인 
		System.out.println( (int)ch1 );
		int ch2 = 67;
		System.out.println( (char)ch2 ); // 'C'
		
		// + 연산중에 강제 타입변환 
		int result5 = (int)381.01 + 3;
		
		// 문제풀이 
			// 1. 예
			// 2. 아니요 [ 자동 : 아니요 , 소수점없어짐 : 예 ] 
			// 3. 부동소수점 
			// 4. 
		int 정수1 = 10;
		double 정수2 = 2.0;
		double 결과1 = 정수1 + 정수2; // int + double -> double 
		System.out.println("결과1 : " + 결과1 );
			// 5. 
		char 문자1 = '글';	// 문자열 " " , 문자 ' ' , 문자열이란? 문자들의 배열
		int 문자정수1 = 문자1;
		System.out.println("글 정수 : " + 문자정수1 ); //44544
		System.out.println("글 정수 : " + (char)(문자정수1+1) ); // 긁 
			// + JAVA 정수로 표현하면 , 74 65 86 65
		System.out.println( (char)74 +""+ (char)65 +""+ (char)86 +""+ (char)65 ); // JAVA
		System.out.println( (char)74 + (char)65 + (char)+ (char) 65 ); // 204
			// +
		char 문자2 = 'A'; // char 2바이트 , 6만개 문자 표현 
		char 문자3 = 'B';	 // short 2바이트 , +32만 정도 표현 
		System.out.println( 문자2 + 문자3 ); // 131 , 컴퓨터는 문자를 표현하기 위해서 정수를 사용한다.
			// +
		short[] 문자열1 = { 'J' , 'A' , 'V' ,'A' };
		char[] 문자열2 = { 'J' , 'A' , 'V' ,'A' };
		
	} // main 끝 
} // 클래스 끝 












package day04;

public class Example2 { // class s 
	
	public static void main(String[] args) { // main s 

		// while 문 
		/*
		 	while( 조건식 ) {
		 		실행문 
		 	}
		 	- 조건식이 true이면 {} 안에 있는 실행문 실행한다.
		 */
		
		// [1] while문 활용하여 1부터 10까지 더하기 
		int num = 1 ; // 1.초기값 
		int sum = 0 ; // = 0 없으면 Unresolved compilation problems: 발생
			// int sum; 변수가 참조 또는 가지고 있는 값이 없다. 쓰레기값,임의값
			// 쓰레기값(임의값/초기값없는상태) vs 0 vs null vs '' vs ""
			// * 변수에 0를 대입하지 않으면 초기값이 없으므로 임의값(쓰레기값)은 연산을 할수 없다.
		while( num <=10 ) { // 만약에 num이 10 이하이면 반복처리 2. 조건문 
			sum = sum + num; // sum += num		
			num++;			 // num = num + 1	// num 1증가 3. 증감식 
		} // w end 
		System.out.println("[while] 1부터 10까지의 합은 " + sum );
		
		// - for문 표현 
		int sum2 = 0;
		for( int num2 = 1 ; num2 <= 10 ; num2++ ) {
			// 1. 초기값    ;  2. 조건문  ;  3.증감식 
			sum2 += num2;
		} // f end 
		System.out.println("[for] 1부터 10까지의 합은 " + sum2 );
		
		// 1분복습 : 1.while 2. num++;
		
		// [2] while문이 무한히 반복되는 경우 , 조건식에 상수 true 
//		while(true) {
//			System.out.println("[while] 쇼핑몰 24시간 실행중!!!");
//		}
		// - for문 표현 
//		for( ; ; ) {
//			System.out.println("[for] 쇼핑몰 24시간 실행중!!!");
//		}
		
		// [3] do ~ while 문 , 1~10까지 더하는 프로그램 
		int num3 = 1;
		int sum3 = 0;
		
		do { // 먼저 실행후						, 선 처리
			sum3 += num3;
			num3++;
		}while( num3 <= 10);	// 실행후 조건검사 	, 후 조건 검사 
		
		System.out.println("1부터 10까지의 합 : " + sum3 );
		
		// [4] 구구단중에서 2단 만 출력하시오. while 과 do~while 문으로 구현하기.
		
		// 0. 반복문 없을때
		System.out.println( " 2 X 1 = " + (2*1) );
		System.out.println( " 2 X 2 = " + (2*2) );
		System.out.println( " 2 X 3 = " + (2*3) );
		System.out.println( " 2 X 4 = " + (2*4) );
		System.out.println( " 2 X 5 = " + (2*5) );
		System.out.println( " 2 X 6 = " + (2*6) );
		System.out.println( " 2 X 7 = " + (2*7) );
		System.out.println( " 2 X 8 = " + (2*8) );
		System.out.println( " 2 X 9 = " + (2*9) );
			// --> 반복되는 코드 : System.out.println( " 2 X ? = " + (2*?) ); 
			// --> 반볻되지 않는 코드  : 1 2 3 4 5 6 7 8 9 -> 규칙/패턴 ?? 1부터 9까지 1씩증가.
		// 1. while 문 
		int gob = 1; 			// 1.초기값 
		while( gob <=9 ) { 		// 2.조건식 		// 선 조건검사 --> 후 실행 
			// System.out.println( " 2 X "+gob+" = " + (2*gob) );
			System.out.printf(" 2 X %d = %d \n" , gob , (2*gob) );
			gob++; 				// 3. 증감식
		} // while end 
		
		// 2. do~while 문
		int gob2 = 1;			// 1. 초기값 		// 선 실행 
		do {
			System.out.printf(" 2 X %d = %d \n" , gob2 , (2*gob2) );
			gob2++;				// 2. 증감식 
		}while( gob2 <= 9 );	// 3. 조건식 		// 후 조건검사 
		
		// 3. for문 
		for( int gob3 = 1 ; gob3 <= 9 ; gob3++ ) { // 1.초기값 ; 2.조건식 ; 3.증감식
			System.out.printf(" 2 X %d = %d \n" , gob3 , (2*gob3) );
		} // for end 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main e 
} // class e 






















package day04;

public class Example3 { // class s 
	public static void main(String[] args) { // main s 
		
		// p.113 1분복습 : 1. int num = 1; 2. num<=10; 3. num++
		
		// [1] for , 1부터 10까지 더하는 과정 
			// 1. 
		int sum = 0;
		sum += 1; sum += 2 ;sum += 3; sum += 4; sum += 5;
		sum += 6; sum += 7 ;sum += 8; sum += 9; sum += 10;
			// - 반복되는코드 : sum += 
			// - 반복되지않는 코드 : int sum = 0; , 1 2 3 4 5 6 7 8 9 10
				// - 패턴/규칙 : 1부터 10까지 1씩증가 규칙 
			// 2. 
		int sum2 = 0;
		for( int i = 1 ; i <= 10 ; i++ ) { // i는 1부터 10까지 1씩 증가 반복한다.
			sum2 += i;
		} // for end 
		System.out.println("1부터 10까지 합 : " + sum2 );
		
		// [2] 나 혼자 코딩!
		System.out.println("안녕하세요1");
		System.out.println("안녕하세요2");
		System.out.println("안녕하세요3");
		System.out.println("안녕하세요4");
		System.out.println("안녕하세요5");
		System.out.println("안녕하세요6");
		System.out.println("안녕하세요7");
		System.out.println("안녕하세요8");
		System.out.println("안녕하세요9");	// 반복되는 코드 : System.out.println("안녕하세요?");
		System.out.println("안녕하세요10");	 // 반복되는 않는 코드 : 1 2 3 4 5 6 7 8 9 10 
		
		for( int value = 1 ; value<=10 ; value++ ) {
			System.out.println("안녕하세요"+value );
		}// for end 
		
		// [3] 구구단 , for중첩 , 단마다 곱 계산( 단for 안에 곱for 포함 )
		for( int dan = 2 ; dan<=9 ; dan++ ) {
			// dan은 2부터 9까지 1씩증가 하면서 반복 
			for( int times = 1 ; times <= 9 ; times++ ) {
				// times는 1부터 9까지 1씩증가 하면서 반복 
				System.out.println( dan + "X" + times + "=" + dan * times );
			} // for2 end 
		} // for1 end 
		
		// [4] 1분복습 
		for( int dan = 3 ; dan <= 7 ; dan++ ) {
			for( int times = 1 ; times <=9 ; times++ ) {
				System.out.println( dan + "X" + times + "=" + dan * times );
			} // for2 end 
		} // for1 end 
		
		// [5] continue문 , 이후의 문장은 수행하지 않고 for문의 증감식으로 이동한다.
		// 1~100까지의 홀수값들의 누적합계
		int total = 0;
		for( int num = 1 ; num <=100 ; num++ ) {
			if( num % 2 == 0 ) {
				// 만약에 현재 반복되고 있는 num변수값이 나누기 2했을때 0 이면 [짝수]
				continue;
			} // if end 
			total += num;
		} // f end 
		System.out.println("1부터 100까지 홀수의 합 : " + total );
		
		// [6] 1분복습 : 1. num = 1   2. num<=100   3. num % 3 != 0
		
		// [7] break , 가장가까운 for/switch 문{} 을 탈출/종료 한다.
		int sum3 = 0;
		for( int num = 0 ; ; num++ ) {
			sum3 += num;
			if( sum3 >=100 ) { break; }
			// 만약에 sum3이 100보다 이상이면 반복문 종료/탈출 한다.
		} // for end 
		
		// [8] 1분복습 : 1. num++    2. if( sum >= 500 )     3. { break; }     
		
		// 연습문제 
		// 1. 민수
		int num1 = 10;			// 1. 계산할 피연산자/첫번째 값
		int num2 = 2;			// 2. 계산할 피연산자/두번째 값
		char operator = '+';	// 3. 계산에 사용할 산술 연산자
		// (1) 
		  if(operator=='+') {		// 4. 만약에 operator(연산자) 가 '+' 이면 
		      System.out.println(num1+num2);	// 5. 더하기 수행 
		   }else if(operator == '*') {	// 아니고 operator(연산자) 가 '*' 이면 
		      System.out.println(num1*num2);	// 5. 곱하기 수행 
		   }else if(operator == '-') {	// 아니고 operator(연산자) 가 '-' 이면 
		      System.out.println(num1-num2);	// 5. 뺄셈 수행 
		   }else if(operator == '/') {	// 아니고 operator(연산자) 가 '/' 이면 
		      System.out.println(num1/num2);	// 5. 나누기 수행 
		   }
		  
		  // (2) switch 문에서 논리(t/f)연산 제어 가 아닌 데이터 비교 검사(==) 제어
		  switch( operator ) {	// 4. operator(연산자) 조건 두고 
		  	case '+' : System.out.println(num1+num2); break;  	// 5. 조건이 '+' 이면 더하기 수행 
		  	case '-' : System.out.println(num1-num2); break;	// 5. 조건이 '-' 이면 뺄셈 수행 
		  	case '*' : System.out.println(num1*num2); break;	// 5. 조건이 '*' 이면 곱하기 수행 
		  	case '/' : System.out.println(num1/num2); break;	// 5. 조건이 '/' 이면 나누기 수행 
		  } // switch end 
		
		// 2. 민우 , 구구단을 짝수 단만 출력하는 코드 구현 
		int total2 = 0;						// 1. 단 과 곱을 곱한 결과를 저장하는 변수 
		for(int i=2; i<=9; i++) {			// 2. i는 곱 역할 , 2 부터 9까지 1씩 증가하는 반복문 
			for(int j=1; j<=9; j++) {		// 3. j는 단 역할 , 1 부터 9까지 1씩 증가하는 반복문 
			if(i%2!=0) {					// 4. 만약에 단 이 홀수 이면 continue( for증감식 이동 )
			   continue;
			}
			total2 = i*j;					// 5. 짝수인 경우에만 실행되는 코드 
				System.out.println(i + "*" + j + "=" + total2); // 6.단 과 곱 과 곱한결과 의 변수값 호출 
			} // for2 end 
		} // for1 end 
		
		// 3. 진석 , 단보다 곱하는 수가 작거나 같은 경우에만.
		int 단1; // 1. 단 를 저장하는 변수 
		int 곱1; // 2. 곱 를 저장하는 변수
		  for(단1 = 2;단1<=9 ; 단1++) { 	// 3. 단은 2부터 9까지 1씩 증가 반복 
		     for(곱1=1;곱1<=9; 곱1++) {	// 4. 곱은 1부터 9까지 1씩 증가 반복 <--- 단순 구구단 반복문중첩 
		        if( 단1 >= 곱1) {			// 5. 만약에 단이 곱보다 작으면 break( 가장 가까운반복문종료 -곱for 종료 -> 단 증감식 이동 )
		        	System.out.println(단1+"X"+곱1+"="+단1*곱1); // 6. 아니면 구구단 출력 
		        }
		        
		     }
		  }
		
		// 4. 
		
		// 5.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main e 
} // class e 



























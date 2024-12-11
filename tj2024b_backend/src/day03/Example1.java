package day03; // 클래스가 위치한 패키지명/폴더명

import java.net.Socket;

public class Example1 { // 클래스 시작 
	// 자바는 번역(컴파일)단위를 클래스 단위로 함으로써 모든 코드는 클래스안에 존재해야한다.

	public static void main(String[] args) { // main start 
		// 번역된(.class파일)코드가 실행하기 위해서는 main함수 안에 있어야 실행된다.
		
		// 연산자 
		
		// [1] 대입연산자 , 왼쪽 변수 = 오른쪽변수(또는 식 ) , 오른쪽 항 먼저 확인/계산
		int age = 24; // 나이를 의미하는 age변수에 값 24를 대입함.
		
		int mathScore = 10;
		int engScore = 20;
		// 수학점수와 영어점수 값을 더해서 총점을 의미하는 변수에 대입한다.
		int totalScore = mathScore + engScore; 
		
		// [2] 부호연산자 , +양수 , -음수 
		int num = 10;
		System.out.println( +num ); // +10 --> 10
		System.out.println( -num ); // -10 --> -10 // 부호 붙여서 출력했지만 수정은 아니다.
		System.out.println( num ); 	// 10 --> 10 
		
		num = -num;
		// 변수 선언 : 타입 변수명 = 값;  // 변수값 호출 : 변수명 // 변수값 수정 : 변수명 = 새로운값 
		System.out.println( num ); // -10 --> -10
		
		// [3] 산술연산자 , +덧셈 -뺄셈 *곱셈 /나누기 %나머지
		System.out.println( 5 / 3 ); // 1.xxxxxxx -> 1 (몫)		* int / int -> int  
		System.out.println( 5.0 / 3.0 ); // 1.6666666666666667 -> 나누기 결과 * double / double -> double
		System.out.println( (int)(5.0 / 3.0 ) ); // 1.6666666666666667 -> 강제타입 -> 정수
		
		int math = 90; int eng = 70;
		int total = math + eng; // 총점 구하기 
		System.out.println( total ); // 총점변수의 값 출력한다. 
		
		double avg = total / 2.0 ; // 평균 구하기 
		System.out.println( avg ); // 평균변수의 값 출력한다.
		
			// [1분복습]
		int korScore2 = 100;
		int mathScore2 = 90;
		int engScore2 = 80;
		int totalScore2 = korScore2 + mathScore2 + engScore2;
		double avgScore2 = totalScore2 / 3.0 ; 
		// totalScore2(int) / 3(int)  ---> int
		// totalScore2(int) / 3.0(double) ---> double ;
		System.out.println( totalScore2 );
		System.out.println( avgScore2 );
		
		// [4] 증감연산자 , ++ -- , 주의할점 ;(세미콜론/명령어단위) 기준으로 연산 우선순위를 정한다.
		int num2 = 10;
		int value2;
		value2 = ++num2;	// num2 값이 1증가 한 후에 value2 변수에 대입한다.
			System.out.println( value2 ); // num2 = 11 , value2=11 , 
		value2 = num2++;	// valu2변수에 기존 num2 값이 먼저 대입한후에 num2값이 1증가 한다.
			System.out.println( value2 ); // value2=11 , num2 = 12
		value2 = --num2;	// num2 값이 1감소 한 후에 value2 변수에 대입한다.
			System.out.println( value2 ); // num2 = 11 , value2=11 
		value2 = num2--;	// value2변수에 기존 num2 값이 먼저 대입한후에 num2값이 1감소 한다.
			System.out.println( value2 ); // value2 = 11 , num2 =10;
		
		int gameScore = 150;
		int lastScore = gameScore++; // 변수앞에 ++가 있으므로 대입(=)보다 1증가가 우선이다.
		System.out.println( lastScore ); // ++gameScore 151 // [1분복습] gameScore++ 150
		
		int lastScore2 = gameScore--;	// 변수앞에 --가 있으므로 대입(=)보다 1감소가 우선이다.
		System.out.println( lastScore2 ); // --gameScore 150; // [1분복습] gameScore-- 151
	
			// * 사칙연산의 우선순위에 따라 *곱하기 후 +더하기 => 9
		int result1 = 3 + 3 * 2; System.out.println( result1 );
				// - 연산순서 
				// 1. 3 * 2 => 6			곱셈
				// 2. 3 + 6 => 9			더하기 
				// 3. int result1 = 9		대입 
			// * 
        int x = 10;
        int y = x-- + 5 + --x;
        		// - 연산순서.
        		// 1. x-- + 5 	---> 10 + 5 => 15  [ x는 +연산 후 1차감] x = 9
        		// 2. 15 + --x	---> 15 + 8	=> 23	[ x는 +연산 전 1차감] x = 8
        System.out.println( x ); // 8
        System.out.println( y ); // 23
		
        // [5] 비교연산자 , >초과 <미만 >=이상 <=이하 ==같다 !=다르다 , 결과는 true 또는 false 
        int myAge = 27;
        boolean value = (myAge > 25);
        System.out.println( value ); // true // ( ) 소괄호를 사용한 이유는 가독성(읽기좋게) 높이기 위해서 사용.
        
        // [6] 논리연산자 , &&논리곱:모두 참이면 참 , ||논리합 : 하나라도 참이면 참 , !부정
        int num1 = 10;
        int i = 2;
        
        boolean value3 = ( (num1 = num1 + 10) < 10 ) && ( ( i = i+2 ) < 10 );
        			// [단락회로평가]  ---- 여기에서 false 이므로 ,   --- 뒤에 조건은 볼 필요없으므로 코드 실행되지 않는다.
        System.out.println( value3 );	// false 
        System.out.println( num1 ); 	// 20 
        System.out.println( i );		// 4 --> 2
        
        value3 = (( num1 = num1 + 10 ) > 10 ) || ((i = i+2) < 10 );
        			// [단락회로평가] --여기에서 true 이므로  , -- 뒤에 조건은 볼 필요없으므로 코드는 실행되지 않는다. 
        System.out.println( value3 ); 	//true
        System.out.println( num1 );  	// 30 
        System.out.println( i );		// 2
        	
        	// p.79 1분복습 : 1. true , 2. 50 , 3. 10
        
        // [7] 복합 대입 연산자 , += , -= , *= , /= %= 
        	// p.81 1분복습
        	// num1 = num1 +5; ----> num1 += 5;
        	// num1 = num1 + num2; ----> num1 *= num2;
      
        // [8] 조건 연산자 , 조건식 ?참결과 : 거짓결과
        int num3 = 5 > 3 ? 10 : 20 ; // 만일 5가 3보다 크면 10대입 하고 아니면 20 대입 한다.
        
        int fatherAge = 45;
        int motherAge = 47;
        
        char ch;
        ch = (fatherAge > motherAge ) ? 'T' : 'F';
        System.out.println( ch ); // F
        	// P.82 1분복습 
        	// 1. isEven
        	// 2. num % 2 == 0 (짝수공식)
        	
        	// p.87페이지 연산자 우선순위(참고)
        
	} // main함수 end 
} // 클래스 end 

























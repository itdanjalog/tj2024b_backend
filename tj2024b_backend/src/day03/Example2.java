package day03;

public class Example2 { // class s 
	public static void main(String[] args) { // class s 
		// p.88 연습문제  // 5번 문제와 6문제의 (3)은 제외
		// 1.
		int myAge = 23;								// (1) = 
		int teacherAge = 38;
		boolean value = ( myAge > 25 );
		System.out.println( value );
		System.out.println( myAge <= 25 );
		System.out.println( myAge == teacherAge); 	// (2) ==
		char ch;
		ch = (myAge > teacherAge) ? 'T' : 'F';		// (3) ? (4) : 
		System.out.println( ch );
		
		// 2.
		int num;
		num = -5 + 3 * 10 / 2;
		System.out.println( num );		// (1) 10
		
		// 3.
		int num2 = 10;
		System.out.println( num2 );		// (1) 10
		System.out.println( num2++ );	// (2) 10
		System.out.println( num2 );		// (3) 11
		System.out.println( --num2 );	// (4) 10
		
		// 4.
		int num3 = 10;
		int num4 = 20;
		boolean result;
		result = ( (num3>10) && (num4 > 10) ); // false  이면서 true 이므로 결과는 false 
		System.out.println( result ); 	// (1) false 
		result = ( (num3>10 ) || (num4 > 10 ) ); // false 이거나 true 이므로 결과는 true 
		System.out.println( result ); 	// (2) true;
		System.out.println( !result ); 	// (3) false  , !(부정/반대)
		
		// 6.
		int num5 = 8;
		System.out.println( num5 += 10 ); 	// (1) 18
		System.out.println( num5 -= 10 ); 	// (2) 8
			
		// 7.
		int num6 = 10;
		int num7 = 20;
		int result2 = num6 >= 10 ? num7 + 10 : num7 -10;
		// 만약에 num6값이 10이상이면 num7값에 10를 더한값을 아니면 num7값에 10를 뺀값을 result2에 대입한다.
		System.out.println( result2 ); 		// (1) 30
		
	} // main e 
} // class e 


















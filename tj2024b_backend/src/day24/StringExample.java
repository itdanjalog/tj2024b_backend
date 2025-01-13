package day24;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		
		// [1] 변수 몇개? 2개 , 자료 몇개? 1개
			// 리터럴이란? 키보드로부터 입력받은 자료,상수풀(이미 저장된 값)
		int a = 3;
		int b = 3; 
		System.out.println(a == b ); 	// true
		// 즉] 서로 다른 두 변수는 같은 자료를 참조한다.
		
		// [2] 변수 몇개? 2개 , 자료 몇개? 1개
		int c = 5;
		int d = c;
		System.out.println( c == d );	// true
		// 즉] c가 참조하는 5를 d에 대입했다. 그러므로 c와d는 같은 자료를 참조한다.
		
		// [3] 변수 몇개? 2개 , 자료 몇개? 2개( 순수한 자료 3 , 포장 인스턴스 )
		Integer value1 = 3;	// 순수한 자료의 리터럴 
		Integer value2 = new Integer(3); // 취소선 : 권장하지 않음 뜻. // 순수한 자료의 리터럴이 저장된 타입(포장/Wrapper) 
		System.out.println( value1 == value2 ); // false		// 리터럴 비교 // 스택 값 비교
		System.out.println( value1.equals( value2 )); // true // 인스턴스 안에 값 비교 // 힙 값 비교
		
		// [4] String 클래스
		// 1. 배열을 이용한 문자열 표현
		char[ ] str1 = new char[]{'유', '재', '석' }; 
		// 2. "" 리터럴 이용한 문자열 
		String str2 = "유재석";				// 상수풀(리터럴) 의 "유재석"
		// 3. 생성자 이용한 문자열 
		String str3 = new String("유재석"); 	// 인스턴스의 "유재석"
		
		System.out.println( str2 == str3 ); 		// false
		System.out.println( str2.equals(str3) ); 	// true 
		String str4 = "유재석";
		System.out.println( str2 == str4 ); 		// true
		
		// [5] String 주요 메소드 
			// 1. 
		String str5 = "자바".concat("프로그래밍");
		System.out.println( str5 ); 	// 자바프로그래밍
			// 2. 
		StringBuilder builder = new StringBuilder();
		builder.append("자바");
		builder.append("프로그래밍");
		System.out.println( builder );	// 자바프로그래밍
			// 3. 
		String str6 = String.format("%s %s" , "자바" , "프로그래밍");
		System.out.println( str6 ); // 자바 프로그래밍
			// 4. 
		String str7 = "";
		str7 += "자바";		// 문자열1개 
		str7 += "프로그래밍";	// 문자열1개   
		System.out.println( str7 ); // 자바프로그래밍
			// 5. .chartAt( 인덱스 ) 
		char gender = "012345-1230123".charAt(7);
		System.out.println( gender );	// 
			// [활용] .nextChar() 없는 이유는 .next().charAt(0) : 한글자 입력
		// Scanner scan = new Scanner(System.in);
		// char ch = scan.next().charAt(0); // 입력받은 문자열의 첫글자 추출
		
			// 6. .length()
		System.out.println( "012345-1230123".length() ); // 길이:14,인덱스:0~13
			// [활용] 반복문 : 변수명.length()-1 [마지막 인덱스] 
			// for( int index = 0 ; index <= 변수명.length()-1 ; index++ ){ }
		
			// 7. .replace( 기존문자열 , 새로운문자열 );
		String str8 = "자바프로그래밍".replace( "자바", "JAVA");
		System.out.println( str8 ); // JAVA프로그래밍
			// [활용] html(<br/>) --> java(\n)
		String htmlData = "유재석<br/>안녕하세요.";
		System.out.println( htmlData );  // 유재석<br/>안녕하세요.
		String javaData = htmlData.replace("<br/>", "\n");
		System.out.println( javaData );	
		// 유재석
		// 안녕하세요
		
			// 8. .subString( 시작인덱스 , [끝인덱스] ) :
		// 첫번째 인덱스부터 6번인덱스 전까지 추출 
		String str9 = "012345-1230123".substring( 0 , 6 ); 
		System.out.println( str9 ); 	// 012345
		
		// 7번 인덱스부터 (끝인덱스생략)마지막 인덱스 까지 추출 
		String str10 = "012345-1230123".substring(7); // 끝인덱스 생략 
		System.out.println( str10 );	// 1230123

			// 9. .split("구분문자")  :
		String[] str11 = "012345-1230123".split("-");
		System.out.println( str11[0] ); // 012345
		System.out.println( str11[1] ); // 1230123
			// [활용] : CSV 파일 다루기
		
			// 10. .indexOf("찾을문자열")
		int findIndex = "자바 프로그래밍 언어".indexOf( "자바" );
		System.out.println( findIndex ); // 0
			// 11. .contains("찾을문자열")
		boolean findBool = "자바 프로그래밍 언어".contains( "자바" );
		System.out.println( findBool ); // true
			// [활용] : 문자열 검색
		
			// 12. .getBytes()
		byte[] str12 = "JAVA PROGRAM".getBytes();
		System.out.println( str12 );
		System.out.println( Arrays.toString( str12 ) );
		// [74, 65, 86, 65, 32, 80, 82, 79, 71, 82, 65, 77]
			// - 영문/일부특수문자 : 문자1개당 1바이트( 아스키코드 )
		System.out.println( "ab".getBytes().length ); // 2
			// - 한글 : 문자1개당 2바이트( 유니코드 ) + 1바이트(utf-8규칙정보) => 3바이트
		System.out.println( "가나".getBytes().length ); // 6
			// char 2바이트 표현  short +-32,000개 --> short unsigned 65,536개
			// --> char 유니코드로 된 문자 1개 표현 
			// [활용] : 인증코드 만들기
		String code = "";
		for( int i = 1 ; i<=6 ; i++ ) {
			System.out.println( new Random() ); // 랜덤(난수) 관련 클래스 
			System.out.println( new Random().nextInt() ); 		// int타입의 난수 반환함수
			System.out.println( new Random().nextInt(26) );		// 0 ~ 25 사이의 난수 반환 함수.
			System.out.println( new Random().nextInt(26) + 97 ); // 97 ~ 122 사이의 난수 반환 함수.
			System.out.println( (char)(new Random().nextInt(26) + 97) );
			code += (char)( new Random().nextInt(26) + 97 );
		} // f end 
		System.out.println( code ); // 임의의 난수 문자열 생성 
		
		
		
	} // m end 
} // class end 





































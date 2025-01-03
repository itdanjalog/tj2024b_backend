package day18.step1_예외처리;

import java.io.IOException;

public class Example1 {
	public static void main(String[] args) {
		
		// [1] 일반 예외 : 컴파일러 예외처리 검사 , 자동으로 예외처리 하라고 경고가 뜸. 
			// Class.forName("패키지경로.클래스명") : 지정한 클래스를 로드 , ClassNotFoundException 예외
		try {
			// 만약에 예외가 발생하거나 발생할것 같은 코드
			Class.forName("java.lang.String"); 	// String 클래스가 존재하므로 예외 발생 하지 않음 
			Class.forName("java.lang.String2"); // String2 클래스가 존재하지 않아서 예외발생 
		}catch( ClassNotFoundException e ) { // try에서 예외가 발생하거나 할것 같은 예외클래스명 변수명
			System.out.println( e );	// 만일 try에서 지정한 예외클래스가 발생하면 실행코드
		}
		
		// [2] 일반 예외
			// System.in.read() : 시스템 으로부터 읽기 함수 , IOException 예외
		try {
			System.in.read();
		} catch( IOException e) {
			System.out.println( e );
		}
		
	} // main end 
} // class end 






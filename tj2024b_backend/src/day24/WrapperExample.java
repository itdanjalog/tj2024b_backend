package day24;

public class WrapperExample {
	public static void main(String[] args) {
		
		// [1] 100 를 저장하는 방법
		int value1 = 100;
		Integer value2 = 100;
		// [2] 3.14 를 저장하는 방법
		double value3 = 3.14;
		Double value4 = 3.14;
		// 차이점 : 기본 vs 참조(멤버/생성자/메소드)
		// System.out.println( value1. );
		System.out.println( value2.BYTES ); // 4(바이트)
		
		// [3] 오토박싱 , 언박싱
		// 오토박싱 : 기본타입을 참조타입으로 변환 
		Integer value5 = value1;	// Integer = int
		// 언박싱 : 참조타입을 기본타입으로 변환
		int value6 = value2; 		// int = Integer
		
		// [4] 문자열 타입 --> 기본타입 변환 
		int val1 = Integer.parseInt( "100" );
		double val2 = Double.parseDouble("3.14");
		float val3 = Float.parseFloat( "3.14" );
		byte val4 = Byte.parseByte("100");
		short val5 = Short.parseShort("100");
		long val6 = Long.parseLong("100");
		boolean val7 = Boolean.parseBoolean("true");
		
		// [5] 기본 타입 --> 문자열 변환 
		String str1 = 100 +""; 
		String str2 = String.valueOf(100);
		
		
	} // m end 
} // class end 






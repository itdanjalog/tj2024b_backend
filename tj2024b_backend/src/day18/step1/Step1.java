package day18.step1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args)  {
        // [1] 일반 예외 : 발생 할수도 있고 안할수도 있고, 컴파일러 무조건 예외처리 검사
        try {
            // ========= 예외가 발생 할것 같은 ============ //
            Class.forName("java.lang.String");                       // .forName(클래스명) : 해당 클래스명이 존재하는지 검사해주는 함수
            Class.forName("java.lang.String2");
            // - java.lang.ClassNotFoundException;
            // ========= ================= ============ //
        }catch ( ClassNotFoundException e ){
            // ========= 예외가 발생 했을때  ============ //
            System.out.println( e ); // 로그를 남기고 추후에 개발자가 코드 수정
            // ========= ================= ============ //
        }
        // [2] 실행 예외 : 발생 할수도 있고 안할수도 있고. ( 방지 )
        try {
            String str1 = "ThisIsJava";
            System.out.println(str1.length());    // 10 , 문자열.length() : 문자열길이
            String str2 = null;
            System.out.println(str2.length());    // .(도트/접근)연산자 , 객체낸 멤버변수,메소드 접근
            // java.lang.NullPointerException: Cannot invoke "String.length()" because "str2" is null
        }catch ( NullPointerException e ){  System.out.println( e );   }

        //
        String str3 = "100";
        String str4 = "1aa";
        int result1 = Integer.parseInt( str3 );     // Integer클래스 : int형 관련 클래스  , .parseInt( ) 문자열 --> 정수형 타입 변환
                                                    // .parseInt( )  : static 함수 인가요? 맞아요.
        System.out.println( result1 );
        try {
            int result2 = Integer.parseInt(str4);
            System.out.println(result2);            // java.lang.NumberFormatException: For input string: "1aa"
        }catch ( NumberFormatException e ){ System.out.println( e );  }

        //
        try {
            int[] intArray = {1, 2, 3};
            System.out.println(intArray[2]);
            System.out.println(intArray[3]);          // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        }catch ( ArrayIndexOutOfBoundsException e ){ System.out.println( e );  }

        //
        try {
            Scanner scanner = new Scanner(System.in);
            int ch = scanner.nextInt(); // 만약에 문자 입력시 예외발생 : java.util.InputMismatchException
        }catch ( InputMismatchException e ){ System.out.println( e ); }

        // try 다중 catch
        try {
            String str5 = "1aa";
            int result2 = Integer.parseInt(str5);
            // ---> 여기서 예외가 발생하면 아래코드는 실행되지 않고 catch 이동
            System.out.println(result2);

            int[] intArray = {1, 2, 3};
            System.out.println(intArray[3]);

            Scanner scanner = new Scanner(System.in);
            int ch = scanner.nextInt(); // 만약에 문자 입력시 예외발생 : java.util.InputMismatchException

        }catch ( NumberFormatException e ){  System.out.println("숫자형으로 변환할수 없어");
        }catch ( ArrayIndexOutOfBoundsException e ){   System.out.println("없는 인덱스 입니다.");
        }catch ( InputMismatchException e ){ System.out.println("잘목된 입력이야.");
        }catch ( Exception e ){  System.out.println("알수 없는 예외가 발생했습니다. 추후에 보수 예정 " + e);
        }finally { System.out.println("여기는 예외가 있던 말던 무조건 실행되는 구역 ");     }

    }
}

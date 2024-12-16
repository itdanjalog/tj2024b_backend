package day06; // 현재 클래스가 위치한 패키지/폴더 명
import java.util.Scanner;
/*
	실습1 : 게시판 프로그램
		- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) 
		- 제목 , 내용 , 작성자 를 입력받아서 저장/출력/삭제/수정 구현
		- 게시물 3개 저장 하기 , 게시물1개당 제목/내용/작성자 저장소(변수) 3개 필요 , 게시물3 --> 변수 9개 필요.
*/

// 코드 실행 : ctrl+f11
public class BoardProgram1 { // class start // 자바 모든 코드는 class안에 존재한다. 
	public static void main(String[] args) { // main start // 자바의 모든 실행 코드는 main 안에서 시작된다.
		// [6-1] 변수선언 , 기본타입[boolean char byte short int long float double], 참조타입[String,Scanner등등]
		String 제목1 = null; 		String 내용1 = null;		String 작성자1=null;	// null 이란 ? 참조값이 없다는 뜻. 문자열이 없다는 뜻 
		String 제목2 = null;		String 내용2 = null;		String 작성자2=null;
		String 제목3 = null;		String 내용3 = null;		String 작성자3=null;
		while(true) { // [1] 반복문 , while 무한루프 // w s 
			// [2] 출력함수 , syso + 자동완성 
			System.out.println("\n\n===== 게시판 프로그램 ===== ");
			System.out.print("1.등록 2.출력 : ");
			// [3] 입력함수 , 
				// 1. 입력객체 : Scanner 변수명 = new Scanner( System.in );
			Scanner scan = new Scanner( System.in );
				// 2. 입력객체 이용한 입력함수 : 변수명.nextXXX();
			int 선택메뉴 = scan.nextInt(); // - 임의 정의한 메뉴번호(int) 입력받기 // - 입력받은 값저장 
			// [4] 연산자 , == 같다	// [5] 조건문 , if( 조건문 ){ }  
			if(선택메뉴 == 1 ) {  System.out.println(">> 1.등록 선택했습니다.");
				System.out.print("> 제목 : ");	String title = scan.next();		// 메시지(print) -> 입력(next) -> 저장(변수) 
				System.out.print("> 내용 : ");	String content = scan.next();
				System.out.print("> 작성자 : ");	String writer = scan.next();
				// [7-1] 변수값에 따른 데이터 검사후 대입 // 첫번째 게시물이 비어 있으면 // [6-2] 변수값 수정 
				if( 제목1 == null ) { 제목1 = title; 내용1 = content; 작성자1 = writer;  }   // - while 밖 변수에 입력받은 3개의 문자열를 각각 저장.
				else if( 제목2 == null ) { 제목2 = title; 내용2 = content; 작성자2 = writer;  } // 두번째 게시물이 비어 있으면
				else if( 제목3 == null ) { 제목3 = title; 내용3 = content; 작성자3 = writer;  } // 세번째 게시물이 비어 있으면
				else { System.out.println("** 등록 실패 : 게시물 작성공간이 부족합니다. **"); }	// 그외. 
			} // if end 
			else if( 선택메뉴 == 2 ) { System.out.println(">> 2. 출력 선택했습니다."); 
				// [7-2] 변수값에 따른 데이터 검사후 출력 // [6-3] 변수값 호출  // +연결연산자 : "문자열"+변수명+"문자열"+변수명
				if( 제목1 != null ) { System.out.println("> 제목 : " + 제목1 +" > 내용 : " + 내용1 + " > 작성자 : " + 작성자1  ); }
				if( 제목2 != null ) { System.out.println("> 제목 : " + 제목2 +" > 내용 : " + 내용2 + " > 작성자 : " + 작성자2  ); }
				if( 제목3 != null ) { System.out.println("> 제목 : " + 제목3 +" > 내용 : " + 내용3 + " > 작성자 : " + 작성자3  ); }
				// 오류가 발생하는 이유 : 변수의 초기값(처음에 변수 만들때 값을 넣는 행위-초기화) 없다. // - 지역변수가 초기값이 없으면 호출이 불가능하다. 
			} // if end 
		} // w e 
	} // main end 
} // class end 






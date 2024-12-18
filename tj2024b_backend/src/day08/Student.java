package day08;

public class Student {	// 객체를 만들기위한 설계 클래스 
	// * 클래스의 구성멤버 : 멤버변수 , 멤버함수(메소드) , 생성자 
	// 1. 멤버변수 		// 객체가 가질수 있는 고유한 성질/특성/값  	* 상태
	int studentID;		// 학생번호 
	String studentName; // 이름 
	int grade;			// 학년
	String address;		// 주소
	
	// 2. 메소드(멤버함수)	// 객체가 행위 할수 있는 명령어 집합/묶음	* 행위
		// - 메소드 정의/만들기 : 현재 객체의 학생명을 호출했던곳으로 반환하는 함수 
		// String: 반환타입 , getStudentName:함수명 , ( ) : 매개변수생략 , { } : 실행코드 , return : 함수종료및반환값
	public String getStudentName( ) {
		return studentName;	//return 반환값;
	}  
		// - 메소드 정의/만들기 : 매개변수로 받은 새로운학생명을 객체의 학생명에 저장/대입 하는 함수 
		// void : 반환값이 없다는 뜻 , setStudentName:함수명 , ( String name ) : 매개변수1개 , { } : 실행코드 , return : 생략 
	public void setStudentName( String name ) {
		studentName = name;
	}
	
	// -- main 함수 : 프로그램을 시작하기 위해 호출하는 함수 , 클래스의 메소드는 아니다.
	// main + 자동완성 
	public static void main(String[] args) {
		Student studentAhn = new Student(); // (1) 인스턴스(객체) 생성 
		studentAhn.studentName = "안연수";	// (2) 객체내 멤버변수에 값을 대입
		System.out.println( studentAhn.studentName );		// (3) 객체내 멤버변수에 값 호출 
		System.out.println( studentAhn.getStudentName() );	// (4) 객체내 멤버함수/메소드 를 호출 
	}
	
} // class end 






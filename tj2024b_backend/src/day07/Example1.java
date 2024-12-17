package day07;

import java.util.Scanner;

/*
	자바 과제5 : (식당) 대기번호 발행 프로그램
	- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체
	- 전화번호 , 인원수 를 입력받아서 저장·출력 구현
	- 명단 클래스 설계한다.
	- 총 대기명단은 3개 까지 가능하다. 
	제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
*/
// (1) main함수 갖는 실행 클래스 
public class Example1 { // class start 
	// main + 자동완성 
	public static void main(String[] args) { // main start 
		// [5] 클래스 정의하기 , 객체를 담을 변수 선언.
		Waiting wait1 = null;	Waiting wait2 = null;	Waiting wait3 = null;
		while(true){// [1] 무한루프 
			System.out.print("1.명단등록 2.명단확인 : "); // [2] 출력 
			Scanner scan = new Scanner(System.in); // [3] 입력객체
			int choose = scan.nextInt();	// [3] 입력함수.
			if( choose == 1 ) { // [4] 조건문 
				System.out.print("전화번호 :"); 	String phone = scan.next();
				System.out.print("인원수 : ");	int count = scan.nextInt();
				// [6] 객체 생성후 입력받은 값 대입 
				Waiting waiting = new Waiting();  // 대기명단 객체 생성 
				waiting.phone = phone; waiting.count = count; // 대기명단 객체내 입력받은 값 대입 
				if( wait1 == null ) { // [6] 만약에 첫번째 대기명단 이 비어 있으면 
					wait1 = waiting; // 대기명단 객체를 while 밖 변수에 대입한다.
				}else if( wait2 == null ) { // 만약에 두번째 대기명단 이 비어 있으면 
					wait2 = waiting; // 대기명단 객체를 while 밖 변수에 대입한다. 
				}else if( wait3 == null ) { // 만약에 세번째 대기명단 이 비어 있으면 
					wait3 = waiting; // 대기명단 객체를 while 밖 변수에 대입한다.
				}
			}else if( choose == 2) {
				if( wait1 != null ) { System.out.printf("인원수 %d 명 , 연락처 : %s \n" , wait1.count , wait1.phone ); }
				if( wait2 != null ) { System.out.printf("인원수 %d 명 , 연락처 : %s \n" , wait2.count , wait2.phone ); }
				if( wait3 != null ) { System.out.printf("인원수 %d 명 , 연락처 : %s \n" , wait3.count , wait3.phone ); }
			}
		} // w end 
	} // main end 
} // class end 
// - 정수 3 를 담기 위해서는 변수 타입 무엇을 사용하나요? int byte short long
// - Waiting 객체를 담기 위해서는 변수 타입 무엇을 사용하나요? Waiting
















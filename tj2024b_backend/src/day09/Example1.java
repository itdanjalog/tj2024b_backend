package day09;

import java.util.Scanner;

/*
	자바 과제8 : (식당) 대기번호 발행 프로그램
	- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체 , 배열 , 메소드 
	- 전화번호 , 인원수 를 입력받아서 저장함수 · 출력함수 구현하기 
	- 명단 클래스 설계한다.
	- 총 대기명단은 100개 까지 가능하다. 
	제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
*/

public class Example1 { // class start 
	public static void main(String[] args) { // main start 
		// [*] 기능 제공 객체 생성 
		WaitingService ws = new WaitingService();
		// [*] 배열 생성 
		Waiting[] waitingArray = new Waiting[100];
		while(true) { // w start 
			System.out.print("1. 등록  2. 출력 : ");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if( choose == 1 ) {
				ws.waitingAdd(scan, waitingArray);
			}else if( choose == 2 ) {
				ws.waitingPrint(waitingArray);
			}
		} // w end
	} // main end 
} // class end 















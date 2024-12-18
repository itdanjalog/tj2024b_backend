package day08;

import java.util.Scanner;

/*
	자바 과제7 : (식당) 대기번호 발행 프로그램
	- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체 , 배열
	- 전화번호 , 인원수 를 입력받아서 저장·출력 구현
	- 명단 클래스 설계한다.
	- 총 대기명단은 100개 까지 가능하다. 
	제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
*/
public class Example1 {
	public static void main(String[] args) { // main start 
		Waiting[] waitingArray = new Waiting[100];
		while(true){
			System.out.print("1.명단등록 2.명단확인 : "); 
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if( choose == 1 ) {  
				System.out.print("전화번호 :"); 	String phone = scan.next();
				System.out.print("인원수 : ");	int count = scan.nextInt();
				Waiting waiting = new Waiting();  
				waiting.phone = phone; waiting.count = count; 
				for( int index = 0 ; index <= waitingArray.length - 1 ; index++ ) {
					if( waitingArray[index] == null ) { waitingArray[index] = waiting; break; }
				} // for end 
			}else if( choose == 2) {
				for( int index = 0 ; index <= waitingArray.length - 1 ; index++ ) {
					if( waitingArray[index] != null ) {
						System.out.printf("인원수 %d 명 , 연락처 : %s \n" , 
								waitingArray[index].count , waitingArray[index].phone );
					} // if end 
				} // for end 
			} // elseif end 
		} // w end 
	} // main end 
} // class end 

//(변경사항1) 대기명단 객체가 3개가 아닌 100개로 변경 되므로 배열 사용하면 효율적이다. 
// Waiting wait1 = null;	Waiting wait2 = null;	Waiting wait3 = null;
		
//(변경사항2) 대기명단 객체 3개 에서 빈 객체 찾기 if 3번 , 객체 100개 이면 if 100번 사용..??
// if( wait1 == null ) { wait1 = waiting;}
// else if( wait2 == null ) { wait2 = waiting; }
// else if( wait3 == null ) {  wait3 = waiting; }

//( 변경사항3 ) 대기명단 객체 3개 에서 비어있지 않은 객체 출력 if 3번 , 객체 100 개이면 if 100 번사용??
// if( wait1 != null ) { System.out.printf("인원수 %d 명 , 연락처 : %s \n" , wait1.count , wait1.phone ); }
// if( wait2 != null ) { System.out.printf("인원수 %d 명 , 연락처 : %s \n" , wait2.count , wait2.phone ); }
// if( wait3 != null ) { System.out.printf("인원수 %d 명 , 연락처 : %s \n" , wait3.count , wait3.phone ); }

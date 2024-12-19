package day09;

import java.util.Scanner;

public class WaitingService {
	// 멤버변수
	
	// 메소드
	// 1. 명단등록 메소드 , 실행조건 : , 매개변수 ; , 반환값 :
	void waitingAdd( Scanner scan , Waiting[] waitingArray ) {
		System.out.println("> 전화번호 : "); String phone = scan.next();
		System.out.println("> 인원수 : ");	int count = scan.nextInt();
		// [*] 객체 생성하고 객채내 멤버변수 접근하여 입력받은 값 대입했다.
		Waiting waiting = new Waiting(); 
		waiting.phone = phone;	waiting.count = count;
		// [*] 배열에 저장하기 
		for( int index = 0 ; index <= waitingArray.length-1 ; index++ ) {
			if( waitingArray[index] == null ) {
				waitingArray[index] = waiting;
				break;
			}
		}
		return;
	} // f end 
	
	// 2. 명단출력 메소드 
	void waitingPrint( Waiting[] waitingArray ) {
		for( int index = 0 ; index <= waitingArray.length - 1 ; index++ ) {
			if( waitingArray[index] != null ) {
				System.out.printf("인원수 %d 명 , 연락처 : %s \n" , 
						waitingArray[index].count , waitingArray[index].phone );
			} // if end 
		} // for end 
	} // f end 
	
} // c end 
 







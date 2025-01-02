package day17.step2;

public class Example2 {
	public static void main(String[] args) {
		// (1) 인터페이스 타입의 변수 생성 , 키보드 변수 선언
		키보드 myKeyBoard;
		// (2) 구현체: 인터페이스의 추상메소드를 구현(한 객)체
			// 1. 사냥게임 해야지..
			// 2. 키보드에 사냥게임 연결 
		myKeyBoard = new 사냥게임(); // new 사냥게임() ==> 구현한 인스턴스(객체)
		myKeyBoard.aKey(); // 공격!! 
		myKeyBoard.bKey(); // 방어!!
			// 1. 게임 바꿔야지. ( 타입변환 )
		myKeyBoard = new 축구게임();
		myKeyBoard.aKey(); // 슛팅!!
		myKeyBoard.bKey(); // 패스!!
		
		// (3) 생각해보기 : 키보드 타입이 없어도 게임타입으로 실행이 가능하다.
		사냥게임 게임1 = new 사냥게임();
		게임1.aKey(); // 공격
		게임1.bKey(); // 방어
		// 게임1 = new 축구게임(); // 오류 : 사냥게임 인스턴스는 축구게임의 타입을 모른다.
		
	} // main end 
} // c end 






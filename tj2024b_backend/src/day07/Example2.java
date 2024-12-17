package day07;

import java.util.Scanner;

/*
	자바 과제6 : 키오스크 프로그램 
	- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체
	- 제품은 콜라,사이다,환타 인 3개가 존재한다는 가정 한다.
	- 각 제품의 재고는 초기에 10개씩 존재한다.
	- 각 제품의 가격은 콜라 1000원 사이다 1500원 환타 2000원 가정 한다.
	- 제품 클래스를 정의한다. 제품객체 활용하여 구현한다.
	- 프로그램 초기 메뉴] 1.콜라 2.사이다 3.환타 4.결제
		1 선택시 : 콜라 선택시 콜라 재고 1 차감하고 장바구니에 담는다.
		2 선택시 : 사이다 선택시 사이다 재고 1 차감하고 장바구니에 담는다.
		3 선택시 : 환타 선택시 환타 재고 1차감하고 장바구니에 담는다.
		4 선택시 : 현재 장바구니에 담긴 모든 현황을 보여주고 금액 합산을 출력한다. 
			ex] 콜라1개 , 사이다2개 , 환타0개 총금액 : 4000원
		* 추가 유효성검사 : 만일 재고가 부족하면 "재고가 부족합니다" 라고 출력하시오.
	제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
*/

// (1) main 갖는 실행 클래스 
public class Example2 { // class start 
	public static void main(String[] args) { // main start 
		// [5] 클래스 정의하기 , 샘플 객체 생성 , new연산자 : 객체 생성시 사용되는 연산자 
		Product p1 = new Product();	p1.name="콜라"; 	p1.price = 1000; p1.stock = 10;
		Product p2 = new Product(); p2.name="사이다";	p2.price = 1500; p2.stock = 10;
		Product p3 = new Product(); p3.name="환타";	p3.price = 2000; p3.stock = 10;
		while(true){ // [1] 무한루프 
			System.out.print("1.콜라 2.사이다 3.환타 4.결제 : "); 	// [2] 출력함수
			Scanner scan = new Scanner(System.in);				// [3] 입력객체 
			int choose = scan.nextInt();						// [4] 입력함수
			if( choose == 1 ) { // 콜라 선택 
				if( p1.stock > 0 ) { // 콜라의 재고가 존재하면 
					p1.stock--;	p1.cart++;
				}else { // 콜라의 재고가 존재하지 않으면 
					System.out.println("콜라 재고 부족합니다.");
				}
			}else if( choose == 2 ) { // 사이다 선택 
				if( p2.stock > 0 ) { p2.stock--; p2.cart++; }
				else { System.out.println("사이다 재고 부족합니다.");}
				
			}else if( choose == 3 ) { // 환타 선택 
				if( p3.stock > 0 ) { p3.stock--; p3.cart++; }
				else { System.out.println("환타 재고 부족합니다.");}
				
			}else if( choose == 4 ) { // 결제 선택 
				int 총금액 = ( p1.cart * p1.price ) + (p2.cart * p2.price ) + (p3.cart * p3.price );
				System.out.printf("바구니현황 : 콜라 %2d개, 사이다 %2d개, 환타 %2d개\n총금액 : %d원\n" 
						, p1.cart , p2.cart , p3.cart , 총금액 );
				p1.cart = 0; p2.cart = 0; p3.cart = 0;
			} 
		} // w end 
	} // main end 
} // class end 
// + 멤버변수는 객체 생성시 초기화를 생략하면 자동으로 기본값이 대입된다. ( 지역변수 아니다 ).
// + 정수 : 0 , 실수 : 0.0 , 논리 : false , 클래스타입 : null
// Product 객체 생성시 cart 멤버변수에는 자동으로 0이 대입된다.

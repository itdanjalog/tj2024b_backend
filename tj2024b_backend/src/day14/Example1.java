package day14;

import java.util.ArrayList;

public class Example1 { // class start 
	public static void main(String[] args) { // main start 
		
		// [1] 배열의 길이를 변경할 수 있다. *고정길이*
		String[] names = new String[3];	// String 객체 3개를 저장할 수 있는 배열 
		// [2] 배열에 객체(요소) 대입 
		names[0] = "유재석";
		names[1] = "강호동";
		names[2] = "신동엽";
		// [3] 배열내 모든 요소를 순회/조회
		for( int index = 0 ; index <= names.length-1; index++ ) {
			System.out.print( names[index] );
			// 유재석강호동신동엽 
		}
		// [4] 배열내 길이 이상의 요소 대입 , 길이 3이면 인덱스 0 ~ 2 가 존재한다.
		// names[3] = "하하"; 	// 오류 // Index 3 out of bounds for length 3		
		// [5] 배열내 중간 요소 삭제 
		names[1] = null;	// 고정길이 , 삭제 개념이 존재하지 않는다. 
	
		System.out.println( names ); // [Ljava.lang.String;@28a418fc
		
		// [1] ArrayList 클래스 , 배열과 다르게 *가변길이* 로 사용이 가능하다.
			// import java.util.ArrayList;	// < 제네릭 타입 > : 리스트 에 저장할 객체의 타입 
				// ArrayList< 요소타입 > 변수명 = new ArrayList<>();
		ArrayList< String > nameList = new ArrayList<>();
		
		// [2] .add( 요소 ) : 리스트에 요소 추가 함수.
		nameList.add( "유재석" );		nameList.add( "강호동" );	nameList.add( "신동엽" );
		
		/// [3] .size() : 리스트의 요소 총개수 반환 함수 , .get(인덱스) : 리스트의 지정한 인덱스 요소값 반환 함수
		for( int index = 0 ; index <= nameList.size() -1 ; index++ ) {
			System.out.print( nameList.get(index) );
		} // for end 
		
		// [4] .add( 요소 ) : 리스트에 요소 추가 함수.
		nameList.add("하하");	 // 배열과 다르게 리스트는 가변길이 이므로 자동으로 길이가 조정된다.
		
		// [5] .remove( 인덱스 ) : 리스트에 지정한 인덱스 요소 삭제 함수
		nameList.remove( 1 ); // index가 1인 '강호동' 요소 삭제 // 배열과 다르게 리스트는 가변길이 이므로 요소 삭제 가능
		
		// [6] 확인 
		System.out.println( nameList );	// [유재석, 신동엽, 하하]
		
		// 실습 , Book 클래스 객체들을 저장하는 리스트객체 생성
			// [1] 리스트 객체 선언 
		ArrayList<Book> library = new ArrayList<>();
		
			// [2] .add() 이용한 리스트객체 내 요소객체 추가
		library.add( new Book("태백산맥" , "조정래") );
		library.add( new Book("데미안","헤르만 헤세") );
		
		Book book1 = new Book("어떻게 살 것인가?", "유시민");
		library.add(book1);
		
		Book book2 = new Book("토지" , "박경리");
		library.add(book2);
		
		library.add( new Book("어린왕자", "생텍쥐페리"));
		
			// [3] .size() : 리스트객체내 요소 총개수 반환함수 ,
			// .get( 인덱스 ) : 리스트객체내 지정한 인덱스 요소객체 반환 함수.
		for( int index = 0 ; index <= library.size()-1 ; index++ ) {
			Book book = library.get(index);
			System.out.println( book );
		} // for end 
		
		System.out.println( library );
		
	} // main end 
} // class end 

























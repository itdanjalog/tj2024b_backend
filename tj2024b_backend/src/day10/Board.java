package day10;

public class Board { // class start // 
	// 클래스 멤버
	// 1. 멤버변수 
	String title;	String content;		String writer;
	// 2. 생성자 : 객체(new) 생성시 초기화(선택사항) 담당하는 역할 
		// 규칙 : 생성자명은 클래스명과 동일하다. 리턴값은 없고 매개변수는 있다. 생성자 사용할때 매개변수 타입,개수 일치
		// 목적 : 주로 객체생성할때 매개변수를 받아서 멤버변수에 대입 , 유효성검사
		// 관례 : 매개변수명과 멤버변수명이 동일 하되 . 멤버변수명 앞에 this 붙인다.
		// 오버로드 : 원래는 동일한이름으로 여러개 선언이 불가능하지만.
			// 매개변수 *개수,타입,순서* 가 다르면 오버로딩 지원한다. (함수/생성자)
		// 주의할점 : 멤버변수가 많으면 과도한 생성자의 개수가 경우에 따라 늘어갈수 있다. ( 관리 , 유지보수 )
		// 사용할지점 : 객체를 만들때 객체내 멤버변수에 처음값을 대입하고자 할때 생성자 만들어주기.
			// --> 객체를 많을때 상황에 따라 처음값(초기화)이 다르면 다양하게 생성자를 상황에 맞추어 만든다.
			// 예] 게시물등록시 필요한 생성자 , 게시물수정시 필요한 생성자 , 게시물삭제시 필요한 생성자
			// --> 문법X --> 내가 객체 만들때 객체내 멤버변수 값들을 *초기에 빠른 대입할것이 있는지 판단*
	
		// 1. 디폴트 생성자 : 매개변수가 없는 생성자 
	Board(){}
		// 2. 매개변수 1개 생성자 
	Board( String title ){
		this.title = title;
	}
		// 2. 매개변수 2개 생성자 
	Board( String title , String content ){
		this.title = title;	this.content = content;
	}
		// 3. 매개변수 3개 생성자 
	Board( String title , String content , String writer ){
		this.title = title; this.content = content; this.writer = writer;
	}
	// 3. 메소드/멤버함수

} // class end 






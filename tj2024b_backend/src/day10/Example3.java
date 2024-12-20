package day10;

public class Example3 {
	public static void main(String[] args) {
		
		// [1] Dto 객체 생성하기 
		BoardDto board = new BoardDto();
		
			// - title멤버변수는 private 이므로 오류 발생 
		// board.title = "안녕하세요";
		board.setTitle("안녕하세요");
		
			// - title멤변수는 private 이므로 오류 발생 
		// System.out.println( board.title );
		System.out.println( board.getTitle() );
		
			// toString 함수를 재정의하지 않았다면
				// day10.BoardDto@5305068a
			// toString 함수를 재정의했다면 
				// 객체참조값 대신 출력하고 싶은 문자열
		System.out.println( board ); // 
			
		
		
		
		
	}
}


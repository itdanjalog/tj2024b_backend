package boardservice10.model.dto;
// VIEW[사용자]	<----------- DTO ------------>	DB[저장소]

public class MemberDto { // DTO : 서로 다른 레이어(MVC패턴)들 간의 데이터를 이동하는 객체 
	// * 주로 데이터베이스 테이블의 속성과 동일하다. +커스텀 가능
	// * 주로 DTO 는 멤버변수 private 접근제한자 사용한다. private 이란? 다른 클래스에서 접근 불가능.
		// - getter/setter 메소드 : private 멤버변수를 다른 클래스에서 간접접근 하기 위한 메소드
		// - toString() 메소드 : 객체 호출시 참조(주소)값 대신 멤버변수 값을 반환 하는 메소드 * 객체 내용물 확인용
	// * 주로 DTO 는 생성자를 기본적으로 2개( 디폴트 , 풀생성자 ) , 그외 커스텀 , 생성자 이란 ? new(인스턴스/객체)를 생성할때 사용되는 초기화 함수 역할 
		// - 오버로딩 : 동일한 메소드명을 여러개 선언 가능 , 전제조건 : 매개변수의 타입,개수,순서
	
	// 1. 멤버변수/필드/속성 : 객체가 가질수 있는 고유한 값 를 저장하는 속성명 
	private int mno;		// 회원번호
	private String mid;		// 아이디 
	private String mpwd;	// 비밀번호
	private String mname;	// 이름
	private String mphone;	// 연락처 
	private String mdate;	// 가입일 
	
	// 2. 생성자 // 자동생성 : 클래스 { } 안에서 빈칸에 오른쪽 클릭 -> [source] -> [ Generate Constructor ] 
	public MemberDto() {}
	public MemberDto(int mno, String mid, String mpwd, String mname, String mphone, String mdate) {
		super();
		this.mno = mno;
		this.mid = mid;
		this.mpwd = mpwd;
		this.mname = mname;
		this.mphone = mphone;
		this.mdate = mdate;
	}
	// + 회원가입에 적합한 생성자
	public MemberDto(String mid, String mpwd, String mname, String mphone) {
		super();
		this.mid = mid;
		this.mpwd = mpwd;
		this.mname = mname;
		this.mphone = mphone;
	}
	
	// 3. 메소드 , getter/setter , toString()
		// 자동완성 : 클래스 { } 안에서 빈칸에 오른쪽 클릭 -> [source] -> [ Generate getter and setter ] 
		// 자동완성 : 클래스 { } 안에서 빈칸에 오른쪽 클릭 -> [source] -> [ Generate toString ] 
	@Override
	public String toString() {
		return "MemberDto [mno=" + mno + ", mid=" + mid + ", mpwd=" + mpwd + ", mname=" + mname + ", mphone=" + mphone
				+ ", mdate=" + mdate + "]";
	}

	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpwd() {
		return mpwd;
	}
	public void setMpwd(String mpwd) {
		this.mpwd = mpwd;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMphone() {
		return mphone;
	}
	public void setMphone(String mphone) {
		this.mphone = mphone;
	}
	public String getMdate() {
		return mdate;
	}
	public void setMdate(String mdate) {
		this.mdate = mdate;
	}

} // class end 


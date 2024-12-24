package day12.boardprogram7;

public class MemberDto {
	// 1.멤버변수 
	private String id;
	private String pwd;
	private String name;
	
	// 2.생성자
	public MemberDto() {}
	public MemberDto( String id , String pwd , String name ) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	// 3. 메소드 
	public String getId() { return this.id; }
	public String getPwd() { return this.pwd; }
	public String getName() { return this.name; }
	public void setId( String id ) { this.id = id; }
	public void setPwd( String pwd ) { this.pwd = pwd;}
	public void setName( String name ) { this.name = name; }
}

package day14.boardprogram9.model.dto;

public class BoardDto {
	// 1. 멤버변수
	private String title;
	private String content;
	private String writer;
	// 2. 생성자
	public BoardDto() {}
	public BoardDto( String title , String content , String writer ) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	// 3.메소드 
	public String getTitle() {  return this.title; }
	public String getContent() { return this.content; }
	public String getWriter() { return this.writer; }
	public void setTitle( String title ) { this.title = title; }
	public void setContent( String content ) { this.content = content;}
	public void setWriter( String writer ) { this.writer = writer; }
	
}

use boardservice10;
# [1] 회원가입, 	insert into 테이블명( 속성명 , 속성명 ) values( 속성값 , 속성값 ); 
insert into member( mid , mpwd , mname , mphone ) values( '값' , '값', '값', '값' );

# [2] 아이디찾기 	select 속성명 from 테이블명 where 조건		,	 SQL : and  , java/js : &&
select mid from member where mname = '유재석' and mphone ='010-3333-3333'; 
# select mid from member where mname = 찾을값 and mphone = 찾을값 ; 

# [3] 비밀번호찾기 	select * from 테이블명 where 조건 
select * from member where mid = 'qwe123' and mphone = '010-3333-3333';

# [4] 로그인 			select 
select mno from member where mid = 'qwe123' and mpwd = 'a123456';
# JDBC : select mno from member where mid = ? and mpwd = ?;

# [5] 내정보 보기		select  
select * from member where mno = 1; 			# 1번 회원의 정보 조회 
# JDBC : select * from member where mno = ?; 	# ?번 회원의 정보 조회 

# [6] 회원탈퇴 		delete from 테이블명 where 조건 
delete from member where mno = 1;
# JDBC : delete from member where mno = ?;

# [7] 회원수정		update 테이블명 set 속성명 = 새로운값 , 속성명 = 새로운값 where 조건 
update member set mpwd = 'qwe1' , mname ='유재석' , mphone ='010-4444-4444' where mno = 2;
# JDBC : update member set mpwd = ? , mname = ? , mphone = ? where mno = ?;

# [8] 전체 게시물 조회	select * from 테이블명;
select * from board;
# JDBC : select * from board;
# [8*] 전체 게시물 조회시 작성자번호 대신에 아이디 로 표시 , 카테고리번호 대신에 카테고리명 표시 
select b.* , m.mid from board as b inner join member as m on b.mno = m.mno;
select * from board as b inner join category as c on b.cno = c.cno;
# [2개이상 조인하기]
select b.* , c.cname , m.mid
	from board as b inner join category as c on b.cno = c.cno 
		inner join member m on b.mno = m.mno;
	
# [9] 개별 게시물 조회	select * from 테이블명 where 조건;
select * from board where bno = 3;
# JDBC : select * from board bno = ?;

# [2개이상 조인하기]
select b.* , c.cname , m.mid
	from board as b inner join category as c on b.cno = c.cno 
		inner join member m on b.mno = m.mno where b.bno = 3;
	





















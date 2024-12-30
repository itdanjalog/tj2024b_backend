-- 한줄주석 
# 한줄주석 
/* 여러주석 */
-- 실행 : 실행할 명령어에 커서를 두고 ctrl+enter
# [1] db server의 전체 데이터베이스 목록 조회 
show databases;
# [2] db server의 local path 조회 
show variables like 'datadir';
# [3] db server의 db 생성 
create database mydb1230;
# [4] db server의 db 삭제 
drop database mydb1230;
drop database if exists mydb1230;
# [5] db server의 사용할 db 활성화 
use mydb1230;

create database my1230;
use my1230;
# [1] 테이블 생성한다. create table 테이블명( 필드명 타입 );
create table testtable1( 필드명 int );
# [2] 현재 활성화(사용) 중인 DB내 모든 테이블 조회
show tables;
# [3] 테이블 생성한다. create table 테이블명( 필드명 타입 , 필드명 타입 );
# 여러개 필드가 존재할 경우 ,(쉼표) 구분한다.
create table testtable2( 필드명1 int , 필드명2 double );
# [4] 테이블 삭제한다. drop table 테이블명;
drop table testtable1;
drop table if exists testtable2;

# [5] MYSQL 데이터 타입
# 다양한 데이터 타입 이용한 테이블 생성 실습 
create table testtable3( # 테이블 생성 시작 #주의할점 : DB 사용 활성화가 된 상태에서 가능, use ~~ 실행 확인 
	# 속성명 타입 , 속성명 타입  
	정수필드1 tinyint 	, 정수필드2 smallint 		, 정수필드3 mediumint , 정수필드4 int 		, 정수필드5 bigint ,
	실수필드1 float 		, 실수필드2 double		,
	날짜필드 date 		, 시간필드 time 			, 날짜시간 datetime 	,
	문자필드1 char(100)	, 문자필드2 varchar(100)	, 문자필드3 text		, 문자필드4 longtext ,
	논리필드 bool 			# 마지막 필드 뒤에는 ,(쉼표) 넣지 않는다.
); # 테이블 생성 끝 
show tables; # 전체 테이블 목록 조회 
# [6] 특정한 테이블 조회 
select * from testtable3;

# 실습1 : boardservice9 의 DB 설계 하시오.
# 단계1 : DB서버의 DB 만들기
create database boardservice9;
# 단계2 : 지정한 DB의 테이블 만들기 위해서 DB 활성화
use boardservice9;
# 단계3 : 지정한 DB의 테이블 생성하기.
create table board(
	title varchar(100)		, 	# 임의로 제목은 최대 100글자로 설계 		# 자바: private String title;
	content longtext		, 	# 임의로 내용은 긴글과 사진도 넣기위해 설계	# 자바: private String content;
	writer varchar(30)			# 임의로 작성자는 최대 30글자로 설계 		# 자바: private String writer;
); 

# 실습2 : day09 패키지의 WaitingService 의 DB 설계 하시오.
























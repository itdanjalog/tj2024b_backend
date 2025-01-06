drop database if exists example5_연산자;
create database example5_연산자;
use example5_연산자;

# 1. 회원테이블
drop table if exists member;
create table member(				# 아이돌 그룹
	mid char(8) not null ,			# 식별키 		최대 8자리
    mname varchar(10) not null ,	# 그룹명		최대 10자리
    mnumber int not null ,			# 인원수		정수 +-21억정도
    maddr char(2) not null , 		# 지역		최대 2자리
    mphone1 char(3) ,				# 지역번호	최대 2자리 
    mphone2 char(8) ,				# 전화번호 	최대 8자리
    mheight smallint ,				# 평균키 		정수 +-3만정도
	mdebut date ,					# 데뷔일 		yyyy-mm-dd 
    constraint primary key ( mid )				# 제약조건 
);
# 2. 구매테이블
drop table if exists buy;
create table buy(
	bnum int auto_increment , 			# 구매번호	정수 	자동번호 부여 
    mid char(8),						# 구매자		FK 
    bpname char(6) not null ,			# 제품명		최대 6자리 
    bgname char(4) , 					# 분류명 		최대	4자리
    bprice int not null ,				# 가격 		정수 
    bamount smallint not null ,			# 구매수량	정수 
    constraint primary key(bnum) ,					# 제약조건 
    constraint foreign key ( mid ) references member(mid) # 제약조건 
);

# 샘플데이터 
INSERT INTO member VALUES('TWC', '트와이스', 9, '서울', '02', '11111111', 167, '2015.10.19');
INSERT INTO member VALUES('BLK', '블랙핑크', 4, '경남', '055', '22222222', 163, '2016.08.08');
INSERT INTO member VALUES('WMN', '여자친구', 6, '경기', '031', '33333333', 166, '2015.01.15');
INSERT INTO member VALUES('OMY', '오마이걸', 7, '서울', NULL, NULL, 160, '2015.04.21');
INSERT INTO member VALUES('GRL', '소녀시대', 8, '서울', '02', '44444444', 168, '2007.08.02');
INSERT INTO member VALUES('ITZ', '잇지', 5, '경남', NULL, NULL, 167, '2019.02.12');
INSERT INTO member VALUES('RED', '레드벨벳', 4, '경북', '054', '55555555', 161, '2014.08.01');
INSERT INTO member VALUES('APN', '에이핑크', 6, '경기', '031', '77777777', 164, '2011.02.10');
INSERT INTO member VALUES('SPC', '우주소녀', 13, '서울', '02', '88888888', 162, '2016.02.25');
INSERT INTO member VALUES('MMU', '마마무', 4, '전남', '061', '99999999', 165, '2014.06.19');
INSERT INTO buy VALUES(NULL, 'BLK', '지갑', NULL, 30, 2);
INSERT INTO buy VALUES(NULL, 'BLK', '맥북프로', '디지털', 1000, 1);
INSERT INTO buy VALUES(NULL, 'APN', '아이폰', '디지털', 200, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '아이폰', '디지털', 200, 5);
INSERT INTO buy VALUES(NULL, 'BLK', '청바지', '패션', 50, 3);
INSERT INTO buy VALUES(NULL, 'MMU', '에어팟', '디지털', 80, 10);
INSERT INTO buy VALUES(NULL, 'GRL', '혼공SQL', '서적', 15, 5);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 2);
INSERT INTO buy VALUES(NULL, 'APN', '청바지', '패션', 50, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 1);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 4);

# DML : insert삽입 select조회 update수정 delete삭제
# [1] 모든 속성의 레코드 조회
# * : 와일드카드
# select * from 테이블명; 
select * from member;
select * from buy;

# [2] 특정 속성의 레코드 조회 
# select 속성명 , 속성명 from 테이블명;
select mid from member;
select mid , mname from member;

# [3] 속성명과 테이블명에 별칭 , 별칭이란? 조회 결과의 속성명 변경 , 원본 속성명은 그대로 , *다중테이블 조회시 속성명 중복 또는 간소화
# 속성명 as 별칭 , 주의할점 : as 생략 가능하다.  
select mid as 회원아이디 from member;						# 조회 결과 'mid' 속성명을 '회원아이디' 로 변경 
select mid as 회원아이디 , mname as 회원명 from member;		# 조회 결과 'mid'-> '회원아이디' , 'mname'->'회원명' 변경 
select mid 회원아이디 , mname 회원명 from member;			# as 생략 가능하다.
select mid 회원아이디 , mname 회원명 from member as m;		# 속성명과 테이블명 에 별칭이 가능하다.
select mid 회원아이디 , mname 회원명 from member m;			# 주로 as는 생략 한다. 테이블명 간소화 가능.

# [4] 속성값이 중복 인 레코드 제거 
# distinct 속성명
select maddr from member;					# maddr(주소) 속성값 레코드 조회
select distinct maddr from member;			# maddr(주소) 속성값 중복 제거된 레코드 조회 

# [5] 속성값에 산술연산 
# 산술연산자 : 속성명 + 값 , 속성명 - 값 , 속성명 * 값 , 속성명 / 값 , 속성명 div 값 , 속성명 mod 값  
select mnumber as 인원수 , mnumber+3 as 더하기 , mnumber-3 as 빼기 , mnumber*3 as 곱셈 , mnumber / 3 as 나눗셈 ,
	mnumber div as 3 몫 , mnumber mod 3 as 나머지 from member;
	






























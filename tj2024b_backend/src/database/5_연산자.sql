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
	
# [6] 조건절 where
# 비교연산자 : 속성명 = 값 , 속성명 != 값 ,  
# 논리연산자 : not 조건 , 조건1 and 조건2 , 조건1 or 조건2
# 기타연산자 : 속성명 between 시작값 and 끝값 , 속성명 in( 값1, 값2 , 값) , 속성명 is null , 속성명 is not null
# 문자열패턴 : 속성명 like '문자패턴' 
#				% : 모든 문자 대응 				ex] 삼성전자/LG전자/물전자 , %전자 -> 삼성전자/LG전자/물전자 
#				_ : _개수 만큼 문자 대응 		ex] 삼성전자/LG전자/물전자 , _전자 -> 물전자

# 주의할점 : 문자열 처리는 " " 혹은 ' ' 권장 , null은 =같다 불가능
select * from member where mname = '블랙핑크'; 					# 'mname'속성값이 '블랙핑크' 인 레코드 조회
select * from member where mnumber = 4;							# 'mnumber'속성값이 4 인 레코드 조회 
select * from member where mname != '블랙핑크';					# 'mname'속성값이 '블랙핑크'가 아닌 레코드 조회
select * from member where not mname = '블랙핑크';					# 'mname'속성값이 '블랙핑크'가 아닌 레코드 조회
select * from member where mheight <= 162;						# 'mheight'속성값이 162 이하 인 레코드 조회
select * from member where mheight >=165 and mheight <= 170;	# 'mheight'속성값이 165 이상 이면서 'mheight'속성값이 170 이하 인 레코드 조회
select * from member where mheight between 165 and 170;			# 'mheight'속성값의 165 ~ 170 사이 인 레코드 조회
# 'maddr'속성값이 '경기' 이거나 'maddr'속성값이 '전남' 이거나 'maddr'속성값이 '경남' 인 레코드 조회
select * from member where maddr='경기' or maddr='전남' or maddr='경남';	
select * from member where maddr in( '경기' , '전남' , '경남' );	
select * from member where mphone1 = ' ';
select * from member where mphone1 = null;						# !! 속성값이 null 일때는 =같다 불가능.
select * from member where mphone1 is null;						# 'mphone1' 속성값이 null 인 레코드 조회
select * from member where mphone1 is not null;					# 'mphone1' 속성값이 null 아닌 레코드 조회
select * from member where mname like '에이%';					# 'mname' 속성값이 '에이'로 시작하는 레코드 조회
select * from member where mname like '에이_';					# 'mname' 속성값이 '에이'로 시작하는 세글자 인 레코드 조회
select * from member where mname like '%핑크';					# 'mname' 속성값이 '핑크'로 끝나는 레코드 조회 
select * from member where mname like '%이%';					# 'mname' 속성값이 '이' 가 포함된 레코드 조회 
select * from member where mname like '_이_';					# 'mname' 속성값이 '이' 가 두번째 글자인 세글자 값 레코드 조회 

# [7] 정렬 , 조회 결과의 레코드를 특정한 필드 기준으로 정렬 
# order by 속성명 asc		, [기본값/생략가능]	, 지정한 속성명 기준으로 속성값들을 오름차순 정렬, 작은값 -> 큰값, 과거날짜 -> 최근날짜, ABC,ㄱㄴㄷ
# order by 속성명 desc					, 지정한 속성명 기준으로 속성값들을 내림차순 정렬, 큰값 -> 작은값, 최근날짜 -> 과거날짜, CBA,ㄷㄴㄱ
# order by 속성명1 정렬기준 , 속성명2 정렬기준	, 지정한 속성명의 정렬이 2개 이상일때 ,(쉼표)구분하기 , 2차정렬은 1차정렬내 동일한 값 내에서 2차정렬
select * from member order by mdebut asc;				# 'mdebut' 속성값을 [오름차순] 으로 레코드 조회 
select * from member order by mdebut desc;				# 'mdebut' 속성값을 [내림차순] 으로 레코드 조회
select * from member order by mname;					# asc 생략 가능하다.
#  먼저 'maddr' 속성값을 정렬 후 동일한 속성값이 존재할경우 동일한 속성값 끼리 'mdebut' 정렬한다.
select * from member order by maddr desc , mdebut asc;	

# [8] 제한 , 조회 결과의 레코드 수 제한 
# limit 레코드수 
# limit 시작레코드(0~) , 개수 
select * from member limit 2;							# 조회 결과의 레코드에서 상위 2개만 조회 제한
select * from member limit 0 , 2;						# 조회 결과의 레코드에서 0(첫번째)레코드 부터 2개만 조회 제한.
select * from member limit 2 , 3;						# 조회 결과의 레코드에서 2(세번째)레코드 부터 3개만 조회 제한
select * from member order by mheight desc limit 3; 	# 'mheight' 가 상위 3개만 조회 제한 

# 실습1 : 주소가 '서울'인 레코드를 데뷔일 기준으로 내림차순으로 조회 결과에 상위 2개만 조회 하시오.
select * from member ;													# 'member' 테이블 전체 레코드 조회
select * from member where maddr = '서울'; 								# 'member' 테이블의 'maddr'속성명이 '서울' 인 레코드 조회
select * from member where maddr = '서울' order by mdebut desc; 			# + 'mdebut'속성명 기준 오름차순 조회
select * from member where maddr = '서울' order by mdebut desc limit 2;	# + 조회 결과에서 상위 2개만 조회 

# [9] 그룹 
# group by 그룹속성명 having 그룹조건 
# 주의할점 : 두 개 이상의 속성명 사용[ 그룹대상의 속성명 값은 동일하더라도 다른 속성명의 값이 다를 수 있으므로 ] 
select * from buy;									# 'buy' 테이블 전체 레코드 조회
select bpname from buy group by bpname;				# 'buy' 테이블의 'bpname' 속성명 값을 그룹 , 중복 값이 없다.
select bpname , bprice from buy group by bpname;	# 오류 : bpname이 동일하더라도 bprice 다를 수 있으므로 

# [10] 집계/통계 함수 + 그룹 
select bamount from buy;
select sum( bamount ) from buy;				# 'bamount'(구매수량) 속성명 값들의 합계 
select avg( bamount ) from buy;				# 'bamount'(구매수량) 속성명 값들의 평균 
select min( bamount ) from buy;				# 'bamount'(구매수량) 속성명 값들의 최솟값 
select max( bamount ) from buy;				# 'bamount'(구매수량) 속성명 값들의 최댓값 
select count( bamount ) from buy;			# 'bamount'(구매수량) 속성명 값들의 개수 		* null 제외한다.
select count( * ) from buy;					# 'bamount'(구매수량) 속성명 레코드의 개수 	* null 포함한다. 

# 1. 회원아이디 별 구매수량 총합계 조회 
select mid , sum( bamount ) from buy group by mid;	# 'mid' 속성명의 값으로 (중복)그룹 하고 'bamount' 속성명을 집계한 레코드 조회
# 2. 회원아이디 별 총구매금액 총합계 조회 , 구매수량 * 구매가격
select mid , sum( bamount * bprice ) from buy group by mid; 
# 3. 회원아이디 별 구매금액 평균 조회 
select mid , avg( bprice ) from buy group by mid;
# 4. 총 구매횟수 조회
select count(*) from buy;
# 5. 회원아이디 별 구매횟수 조회 
select mid , count( bpname ) from buy group by mid;

# [11] having 그룹후조건(별칭사용가능) vs where 그룹전조건(별칭사용불가능)
# 주의할점 : select 문 에서 컴퓨터가 처리하는 순서 : select [3] from [1] where [2] group by [4] having [5]
# 1. 구매수량( bamount )이 3 초과 하고 회원아이디별 인 레코드 조회
select mid from buy where bamount > 3;
# 2. 회원아이디별 총구매금액( bamount * bprice ) 이 1000 초과 인 레코드 조회 
select mid , sum( bamount * bprice ) from buy group by mid having sum( bamount * bprice ) >= 1000;
select mid , sum( bamount * bprice ) as 총구매금액 from buy group by mid having 총구매금액 >=1000;
select mid , bprice 구매가격 from buy where 구매가격 >= 1000 ;	# 오류 # where 별칭으로 조건속성명 불가능
select mid , sum( bamount * bprice ) as 총구매금액 where 총구매금액 >= 1000; # 오류 : 집계 후 조건은 where 불가능

# 실습2 : buy 테이블에서 구매수량(bamount) 이 2개 초과 인 레코드 의 회원아이디(mid)별 구매가격(bprice)평균 이 50 이상인 레코드 조회 하시오.
# +구매가격평균 내림차순 조회 ,  + (구매가격평균) 상위 2개만 조회  
# 1. buy 테이블에서 구매수량(bamount) 이 2개 초과 인 레코드
select * from buy where bamount > 2;
# 2. 회원아이디(mid)별 구매가격(bprice)평균  * ~~별 집계(합계/평균/개수)
select mid as 회원아이디 , avg(bprice) as 구매가격평균 
	from buy where bamount > 2 	
	group by 회원아이디 ;

# 3.구매가격(bprice)평균 이 50 이상 , 구매가격평균은 집계인지 아닌지 판단. 집계이면 having 아니면 where
select mid as 회원아이디 , avg(bprice) as 구매가격평균 
	from buy where bamount > 2 
	group by 회원아이디 having 구매가격평균 >= 50;

# 4. +구매가격평균 내림차순 조회	
select mid as 회원아이디 , avg(bprice) as 구매가격평균 
	from buy where bamount > 2 
	group by 회원아이디 having 구매가격평균 >= 50
	order by 구매가격평균 desc;
	
# 5. +구매가격평균 상위 2개만 조회 
select 
	mid as 회원아이디 , avg(bprice) as 구매가격평균 
	from buy 
	where bamount > 2 
	group by 회원아이디 
	having 구매가격평균 >= 50
	order by 구매가격평균 desc 
	limit 0 , 2 ;

## [12] select 사용시 여러 절 이 있을때 작성순서
# select 속성명 from 테이블명 where 조건절 group by 그룹속성명 having 그룹조건 order by 정렬속성명 정렬기준 limit 시작번호,개수
## select 를 컴퓨터가 처리하는 순서.
# select [3] from [1] where [2] group by [4] having [5] order by [6] limit [7]












# 1. 데이터베이스 준비		
drop database if exists example6_집합;		# 만약에 'example6_집합' 데이터베이스 존재하면 삭제 
create database example6_집합;				# 'example6_집합' 데이터베이스 생성 
use example6_집합;							# 'example6_집합' 데이터베이스 사용 활성화
# 2. 테이블 
create table table1(						# 'table1' 테이블 생성 
	num_pk int , 							# 속성명 속성타입 
    constraint primary key( num_pk)			# 속성의 제약조건 설정 
);
create table table2(
	no_pk int , 
    constraint primary key( no_pk ) , 
    num_pk int , 
    constraint foreign key( num_pk ) references table1( num_pk )
);
# 3. 레코드 삽입
insert into table1 values(1), (2), (3), (4), (5);				# 하나의 insert 에 5개 레코드 삽입 
insert into table2 values(1,1) , (2,2) , (3,1) , (4,1) , (5,2);	# 하나의 insert 에 5개 레코드 삽입 
# 4. 레코드 조회
select * from table1;
select * from table2;
	# PK(기본키/식별키) 필드/속성 : 고유한 값들을 가진 필드			, 중복없음unique , not null , ex] 주민등록번호 , 사번 , 학번, 제품번호, 주문번호
	# FK(외래키/참조키) 필드/속성 : 다른 테이블의 속성값 참조하는 필드	, 중복허용 , null 허용 		  , pk 속성값 를 참조하는 속성값 

# 5. 집합 : 교집합 : 두 테이블간의 공통으로 포함하는 속성값으로 이루어진 테이블조회 
# 조회시 조회단위 : 레코드 단위
select * from table1;				# 레코드 5개 조회
select * from table1 , table2;		# 레코드 25개 조회 , 2개 이상의 테이블을 조회 : select * from 테이블명A , 테이블명B;

# 교집합

# INNER JOIN
#[1] where 이용한 교집합 표현하기 , 두 테이블의 공통 속성값 num_pk(PK) 와 num_pk(FK) , 주로 PK속성 - FK속성 , 테이블 합치기
select * from table1 , table2 where table1.num_pk = table2.num_pk;	# where 사용한 집합은 일반 조건과 겹치므로 구분이 어렵다.

#[*2*] inner join ~ on절 이용한 교집합 표현하기 , *가독성* , where 일반조건 , on 집합조건 , having : 그룹조건 
# select * from 테이블명A inner join 테이블B on 집합조건( 테이블A.PK속성명 = 테이블명B.FK속성명 )
select * from table1 inner join table2 on table1.num_pk = table2.num_pk;

#[3] inner 생략 가능 
select * from table1 join table2 on table1.num_pk = table2.num_pk;

#[4] using 키워드 : 전제조건은 pk속성명과 fk속성명이 같아야한다. 현재 예제는 num_pk/num_pk(FK) 다르므로 불가능
select * from table1 join table2 using( num_pk );

#[5] natural join 키워드 : 두 테이블간의 동일한 속성명 기준으로 자동으로 조인한다. # 조인 의도와 다르게 동일한 속성명이 존재할 수 있으므로 비권장
select * from table1 natural join table2;

# OUTER JOIN
#[6] 왼쪽 테이블(table1) 에 있는 모든 레코드를 포함하고 오른쪽 테이블(table2)에 교집합 되는 레코드 조회 , 없으면 null
select * from table1 left outer join table2 on table1.num_pk = table2.num_pk;

#[7] 오른쪽 테이블(table2) 에 있는 모든 레코드를 포함하고 왼쪽 테이블(table1)에 교집합 되는 레코드 조회 , 없으면 null
select * from table1 right outer join table2 on table1.num_pk = table2.num_pk;

#[8] outer 생략 가능.
select * from table1 left join table2 on table1.num_pk = table2.num_pk;

#[9] 합집합 : 두 집합의 모든 요소 갖는 집합 , 두 테이블간의 모든 레코드 조회
# union 키워드 : 2개 이상의 select를 하나로 합치는 키워드 
select * from table1 left join table2 on table1.num_pk = table2.num_pk union
select * from table1 right join table2 on table1.num_pk = table2.num_pk; 
# 오라클DB : FULL OUTER JOIN 이용한 집합  , MYSQLDB : union이용한 합집합 

#[10] 차집합 : 두 집합에서 A에는 속하지만 B에는 속하지 않는 원소집합 , 두 테이블에서 특정테이블에 속하지만 다른 테이블에 속하지 않는 레코드 조회
select table1.* from table1 left outer join table2 on table1.num_pk = table2.num_pk where table2.num_pk is null;

# * 속성명 is null : 속성값이 null인지 비교연산 , 속성명 is not null : 속성값이 null이 아닌지 비교연산 

# 실습1 : 아래 테이블 코드를 참조하여 문제를 풀이하시오.
# [문제1] : 모든 제품(product)테이블 레코드 조회시 모든 속성명을 표시하며 속성명 이 '카테고리번호'  대신에 '카테고리명'을 조회하는 SQL 작성하시오.
# [문제2] : 제품번호 1번의 재고수량 합계를 조회하느 SQL 작성하시오. 그리고 조회시 '제품명' 과 '합계수량' 속성명 만 표시 하시오.

create table pcategory(
        카테고리번호_pk int unsigned auto_increment , 
    # 속성(필드) 임의 , int(식별키숫자) , unsigned(부호없다.) , auto_increment(레코드삽입시 자동번호부여)
    카테고리명 varchar(10) not null , #속성(필드) 임의 , varchar(10) : 카테고리명이 최대 10글자로 이내로 작성하기 위해서
    primary key( 카테고리번호_pk) # pk필드 선언하기 , primary key( pk필드명 ) 
);
# 제품 테이블 
create table product( 
        제품번호_pk int unsigned auto_increment , 
    제품명 varchar(100) not null, # 제품명을 최대 100 글자 이내로 작성하기 위해서 
    제품가격 int unsigned not null , # 40억 이하로 가격을 작성하고 -(음수) 없음 , not null : 공백이 아닌 필드 설정 ( 공백삽입시 오류발생 )
    카테고리번호_fk int unsigned , # 카테고리 테이블의 pk필드 를 참조할 fk필드 
    primary key( 제품번호_pk ) , # pk 필드 선언하기 # pk필드는 자동으로 not null(null방지) 과 unique(중복방지) 제약조건이 설정된다.
    foreign key( 카테고리번호_fk ) references pcategory( 카테고리번호_pk ) # fk 필드 설정하기 
    # foreign key( fk필드명 ) references pk테이블명( pk필드명 )
);
# 재고 테이블 
create table stock( 
        재고번호_pk int unsigned auto_increment , 
    재고수량 int ,
    재고등록날짜 datetime default now() ,  # date(날짜타입) , default : 레코드삽입시 초기값를 선언하기 , now() : 현재 시스템 날짜/시간 반환 함수 
        제품번호_fk int unsigned ,                 # 제품 테이블의 pk필드를 참조할 fk필드 
    primary key( 재고번호_pk ) ,                 # 모든 테이블은 pk필드를 1개 이상 갖는다.(권장) 
    foreign key( 제품번호_fk ) references product( 제품번호_pk ) # fk 필드 설정하기 
);



 
 
# (해답1) 모든 제품(product)테이블 레코드 조회시 모든 속성명을 표시하며 속성명 이 '카테고리번호'  대신에 '카테고리명'을 조회하는 SQL 작성하시오.
select * from product;					# 테이블명 : 'product' , 모든 속성명을 표시'*'
select * from product , pcategory ; 	# 카테고리명은 카테고리 테이블에 존재한다. 두 테이블 조회를 해야한다.
select * from product inner join pcategory on product.카테고리번호_fk = pcategory.카테고리번호_pk; # 두 테이블간의 관계 파악하여 교집합를 한다.
select product.제품번호_pk , product.제품명 , product.제품가격 , pcategory.카테고리명 
	from product inner join pcategory on product.카테고리번호_fk = pcategory.카테고리번호_pk; # * 대신에 내가 원하는 속성명을 작성한다.
# 별칭 : 속성명 as 별칭명 , 테이블명 as 별칭명 , as 생략가능 
select p.제품번호_pk , p.제품명 , p.제품가격 , pc.카테고리명  
	from product as p inner join pcategory as pc on p.카테고리번호_fk = pc.카테고리번호_pk; 
#(해답2) 제품번호 1번의 재고수량 합계를 조회하느 SQL 작성하시오. 그리고 조회시 '제품명' 과 '합계수량' 속성명 만 표시 하시오.
select * from stock;								# 재고 테이블 조회 
select * from stock where 제품번호_fk = 1; 			# 제품번호 1번 인 레코드만 조회 
select sum( 재고수량 ) from stock where 제품번호_fk = 1;	# 제품번호 1번 인 레코드의 재고수량 속성값 총합계
select sum( s.재고수량 ) as 합계수량 from stock as s inner join product as p on s.제품번호_fk = p.제품번호_pk where s.제품번호_fk = 1; # 두 테이블 조인 
select p.제품명 as 제품명 , sum( s.재고수량 ) as 합계수량 
	from stock as s inner join product as p 
		on s.제품번호_fk = p.제품번호_pk 
    where s.제품번호_fk = 1;





 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

	
	
	
	
	
	
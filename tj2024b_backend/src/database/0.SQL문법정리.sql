[ ]
	관계형데이터베이스 ? 자료들 간의 종속되는 관계 표현 가능한 데이터베이스  
	테이블 ? 행/열 로 이루어진 데이터의 집합 
[SQL] 
	* SQL 명령어는 대소문자를 구분하지 않는다.
	* SQL 명령어는 (;)단위로 실행이 가능하다.
	0. Utility 메타데이터 관리 어
		1. SHOW
			1. SHOW DATABASES;					: db server의 전체 데이터베이스 목록 조회 
			2. SHOW VARIABLES LIKE 'datadir'	: db server의 local path 조회 
		2. USE 
			1. USE DB명;							: db server의 지정한 db 활성화(사용) 
		
	1. DDL : Data Definition Language 데이터베이스 정의어
		1. CREATE
			1. CREATE DATABASE DB명				: db server의 지정한 DB 생성
		2. DROP
			1. DROP DATABASE DB명 				: db server의 지정한 DB 제거 
			2. DROP DATABASE IF EXISTS DB명 		: db server의 지정한 DB 존재하면 제거 
		
	2. DML : Data Manipulation Language 데이터베이스 조작어
		[1] insert 
			1. 모든 속성에 값 대입 , 속성명 생략 
				insert into 테이블명 values( 값1 , 값2 , 값3);
			2. 특정 속성에 값 대입 , 속성명 작성
				insert into 테이블명( 속성명1 , 속성명2 , 속성명3 ) values( 값1 , 값2 , 값3 );
			3. 여러개의 레코드를 삽입할때
				insert into 테이블명( 속성명1 , 속성명2 ) values( 값1 , 값2 ), ( 값1 , 값2 ), ( 값1 , 값2 )
			주의할점 : 속성의 제약조건 에 따라 적절하게 값 대입한다.
		
		[2] select 
			1. 전체 속성에 레코드 조회 , *[와일드카드]
				select * from 테이블명;
			2. 특정 속성에 레코드 조회 , 
				select 속성명1 , 속성명2 from 테이블명;
			3. 특정 속성 조건에 따른 레코드 조회
				select * from 테이블명 where [조건절]
		
		[3] update 
			1. 전체 레코드의 속성값 수정 
				update 테이블명 set 속성명 = 새로운값;
			2. 특정 레코드의 속성값 수정 
				update 테이블명 set 속성명 = 새로운값 where [조건절]
			3. 다수 속성값 수정 
				update 테이블명 set 속성명 = 새로운값 , 속성명 = 새로운값 where [조건절]
		
		[4] delete 
			1. 전체 레코드 삭제 
				delete from 테이블명;
			2. 특정 레코드의 삭제 
				delete from 테이블명 where [조건절]
				
		* mysql workbench safe mode : 조건없이 수정/삭제가 불가능하게 안전모드 지원한다.
			set SQL_SAFE_UPDATES = 0; 	: safe mode 끄기 
			set SQL_SAFE_UPDATES = 1; 	: safe mode 켜기(기본값)
		
	3. DCL : Data Control Language 데이터베이스 제어어
	
	4. TCL : Transaction Control Language 트랜잭션 제어어
	
[데이터타입]
	1.[정수]	unsigned : 부호가 없다. 표현단위 2배 , 음수표현 불가능
		tinyint		1바이트	-128 ~ +127		
        smallint	2바이트	+-3만정도			
        mediumint	3바이트	+-800만정도		
        int			4바이트	+-21억이하	, int unsigned : 42억이하
        bingint		8바이트	+-21억이상 		
	2.[실수]
		float 		4바이트 	부동소수점(표현 범위 이상일 경우 오차 발생 )
        double		8바이트 	부동소수점(표현 범위 이상일 경우 오차 발생 )
        decimal		문자타입	실수를 문자로 처리하는 타입 , 오차 없음
	3.[날짜/시간]
		date 		날짜표현 , 0000-00-00	,	1000년 ~ 9999년 
        time		시간표현 , 00:00:00	
        datetime	날짜/시간표현 , 0000-00-00 00:00:00
	4.[문자]
		char(문자길이)	문자열표현 , 고정길이 , 최대 255글자 , char(5)		--> "유재석" --> [유] [재] [석] [ ] [ ] 2칸이 남는다.
        varchar(문자길이) 문자열표현 , 가변길이 , 최대 255글자 , varchar(5)	--> "유재석" --> [유] [재] [석] 남은 길이는 제거
        text			문자열표현 , 최대 6만 글자
        longtext		문자열표현 , 최대 42억개 글자 , 4GB , 대용량 
	5.[논리]
		bool			true or false 표현 , tinyint 와 같다.	
		
[ 제약조건 ]
	- 테이블 에서 문제/결함 되는 데이터가 입력되지 않도록 제약를 지정한 조건 
	1. not null 		: 해당 필드에 null 값을 포함하지 않는다.
	2. unique			: 해당 필드에 중복값을 허용하지 않는다. [중복 데이터 차단]
	3. default 기본값		: 레코드(값) 삽입시 해당 필드에 값을 대입하지 않으면 기본값으로 초기화 한다.
		default now()	: 레코드 삽입시 현재 시스템의 날짜/시간를 초기화 
	4. auto_increment	: (MYSQL만 가능) 레코드 삽입시 순서대로 자동 번호가 삽입 된다.
	5. primary key 		: 기본/식별키-PK , 식별 가능한 고유 값 필드 키 		, 학번/사번/주민등록번호/주문번호/제품번호 등등
		- PK필드는  not null 과 unique 포함된다.
		- 선언 : constraint primary key( pk필드명 )
	6. foreign key 		: 참조/외래키-FK , 다른 테이블의 기본키를 참조하는 키	
		- FK필드는 null 과 중복 데이터를 가질수 있다.
		- 선언 : constraint foreign key( fk필드명 ) references 참조할테이블명( 참조할필드명 )
		
	* 관계형 데이터베이스의 관례적으로 기본키PK 는 테이블당 1개 이상 갖는다.
		
		

	
	
	
	
	
	
	
	
	
	
	
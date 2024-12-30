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
	
	3. DCL : Data Control Language 데이터베이스 제어어
	
	4. TCL : Transaction Control Language 트랜잭션 제어어
	
[데이터타입]
	1.[정수]
		tinyint		1바이트	-128 ~ +127		
        smallint	2바이트	+-3만정도			
        mediumint	3바이트	+-800만정도		
        int			4바이트	+-21억이하
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
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
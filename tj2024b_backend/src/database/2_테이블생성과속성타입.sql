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








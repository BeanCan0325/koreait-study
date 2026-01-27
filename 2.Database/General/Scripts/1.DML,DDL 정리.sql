1.DML
  - 데이터 조회 및 변경을 하기 위한 언어
  - 종류:
  		SELECT, INSERT, DELETE, UPDATE
  		
  		1) SELECT 
  		  : 데이터 조회 시 사용
  		  : 문법: SELECT 컬럼명 FROM 테이블명;
  		2) INSERT
  		  : 데이터 추가할 때 사용
  		  : 문법: INSERT INTO 테이블명 VALUES(값1, 값2, ...);
  		  : 주의: 값을 넣을 떄테이블에 정의된 컬럼의 순서와 데이터 타입에 맞게 넣어야 함
  		3) UPDATE 
  		  : 데이터를 변경할 때 사용 
  		  : 문법: UPDATE 테이블명 SET 컬럼1(변경할 값), 컬럼2(변경할값2) WHERE 조건;
  		4) DELETE
  		  : 데이터를 삭제할 때 사용
  		  : 문법: DELETE FROM 테이블명 WHERE 조건;
  		  : 주의: 조건을 주지 않으면 테이블에 존재하는 모든 데이터가 삭제됨
  		  
########################################################################W
  		  
2. DDL  
	- 데이터베이스의 객체를 생성, 수정, 삭제하는 언어
	- 종류: CREATE, ALTER, DROP 
	- 문법: CREATE 객체명    / ALTER 객체명   / DROP 객체명
	
	1) CREATE TABLE 표현법
		- CREATE TABLE 테이블명(
			컬럼명1 자료형,
			컬럼명2 자료형,
			컬렴명3 자료형
		)
	2) 자주 사용되는 자료형의 종류
		- VARCHAR(byte) :가변 길이 문자열 (최대 65,535 바이트)
		- TEXT : 대용량 텍스트 타입(주로 게시판 내용 등에 사용)
		- INT : 숫자(정수형)
		- DECIMAL(p,s) :  숫자(실수형, 문자열 기반 고정 소수점)
		  > 문자열 기반 고정 소수점이기 떄문에 오차가 존재하지 않음
		  > P: 전체자리수
		  > S: 소수점 기준 자릿수
		- DATE : 날짜 (yyyy-MM-DD) 
		- DATETIME : 날짜 + 시간 (yyyy mm dd hh:MM:ss)
		
		
		
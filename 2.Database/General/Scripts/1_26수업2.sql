CREATE TABLE db_tcl (
	id varchar(50)
);
INSERT INTO db_tcl values('test1');
INSERT INTO db_tcl values('test2');
INSERT INTO db_tcl values('test3');

SELECT * FROM db_tcl;
-- 작업중인공간이라 보이는건데 cmd에서 들어가면 안보임
-- cmd -> my sql -u root -p
-- use employees; select * from db_tcl;

COMMIT;

UPDATE db_tcl 
SET id = 'test4';

SELECT * FROM db_tcl dt ;
ROLLBACK;

-- 개체 무결성, 참조 무결성, 도메인 무결성, 고유성 제약, NULL 제약
-- 트랜젝션 dml기준으로 수행하기 위한 작업. (예) 게시글 작성, 파일에 작성 => 트랜지션이 2개 인


-- ▶[정규화]◀
-- 1. ◌ 데이터베이스 정규화 ◌
-- 	- 이상 문제를 해결하기 위해 속성(컬럼)들 끼리의 종속관계를 분석하여 
-- 	  여러 개의 릴레이션(테이블)으로 분해하는 과정
-- 2. ◌ 이상문제 ◌
-- 	- 삽입 이상: 데이터를 저장할 때 원하지 않는 정보가 함꼐 삽입되는 경우
-- 	- 삭제 이상: 튜플(데이터)을 삭제함으로써 유지되어야 하는 정보까지도 연쇄적으로 삭제되는 경우
-- 	- 갱신 이상: 중복된 튜플(데이터) 중 일부의 속성(컬럼)만 갱신 시킴으로써 정보의 모순성이 발생하는 경우
-- 3. ◌ 정규화를 너무 많이하면 생기는 단점 ◌
--	- 릴레이션 분해가 많이 될 수록 join을 자주 사용하게 되어 select쿼리의 속도가 상대적으로 느려지기 때문에 적정선에서 해야함.

-- 4. ◌ 데이터베이스 반정규화 ◌ 
-- 	- 성능 향상을 목적으로 정규화된 데이터 모델을 정규화 원칙에 벗어나게 하는 것을 의미
-- 	- 요약: 쪼개진 테이블을 다시 합친다. 
-- 	- 반정규화 하는 이유: select를 자주하는데에 성능상 문제가 발생할 경우(조회가 느리거나 등)
--	- 단점: 이상 문제가 발생할 수 있다. 

-- -----------6.<TCL 실습> -----------------

-- 1. tcl(TRANSACTION controll language)
-- 	- 트랜잭션을 제어하는 언어
-- 2. 트랜잭션(Transaction) 
-- 	- 데이터베이스에서 실행되는 논리적인 작업 단위
-- 	- INSERT, UPDATE, DELETE 와 같은 데이터베이스의 상태를 변화시키는 일련의 작업 단위를 의미
-- 	- 예시) A가 B에게 10,000원을 송금해야한다.
-- 		> 1) A에게 10,000원이 있는지 조회(select)
-- 		> 2) B의 잔액에 10,000원 추가(update)
-- 		> 3) B의 잔액에 10,000원 추가(update)
-- 		
-- 3. COMMIT 
-- 	- 현재 트랜잭션에서 작업한 내용을 데이터베이스에 반영
-- 4. ROLLBACK
-- 	- 현재 트랜잭션의 작업한 내용을 취소( 마지막 COMMIT 시점으로 되돌아가기)

-- -------------------------------------------
SELECT * FROM dept_emp;
SELECT birth_date, gender FROM employees
WHERE birth_date > '1995-01-01' AND gender = 'M';



-- [연습문제]
-- q1
SELECT de.emp_no, salary FROM dept_emp de
JOIN salaries s
ON de.emp_no = s.emp_no
WHERE de.to_date = '9999-01-01'
AND s.to_date = '9999-01-01';

-- q2
SELECT e.emp_no, first_name, de.dept_no FROM dept_emp de
JOIN employees e
ON de.emp_no = e.emp_no;

-- q3
SELECT first_name, d.dept_no FROM dept_manager de
JOIN employees e
ON de.emp_no = e.emp_no
join departments d 
ON de.dept_no = d.dept_no
wHERE de.to_date ='9999-01-01'; 

-- q4
SELECT e.first_name, s.salary FROM employees e 
JOIN salaries s 
ON e.emp_no = s.emp_no
WHERE s.salary >= 80000 
AND s.to_date = '9999-01-01';


-- q5
SELECT e.FIRST_name , s.salary FROM employees e
JOIN salaries s
ON e.emp_no = s.emp_no 
ORDER BY salary DESC;

-- q6
SELECT d.dept_name, count(*) FROM dept_emp de 
JOIN departments d 
ON de.dept_no = d.dept_no 
GROUP BY de.dept_no;

-- q7
SELECT dept_name, count(*) AS cnt FROM dept_emp de 
JOIN departments d 
ON de.dept_no = d.dept_no 
GROUP BY d.dept_name 
HAVING cnt >= 20000
ORDER BY count(*); 

-- q8
SELECT e.first_name, d.dept_name, e.gender  FROM dept_emp de 
JOIN employees e 
ON de.emp_no = e.emp_no 
JOIN departments d 
ON de.dept_no = d.dept_no
order BY e.gender;

-- q9
SELECT e.first_name, d.dept_name, de.from_Date FROM dept_emp de
JOIN employees e 
ON de.emp_no  = e.emp_no 
JOIN departments d 
ON d.dept_no = de.dept_no 
WHERE de.from_date >= '1996-01-01';

-- q10
SELECT d.dept_name, avg(s.salary) FROM dept_emp de 
JOIN departments d 
ON d.dept_no = de.dept_no 
JOIN salaries s 
ON de.emp_no = s.emp_no
GROUP BY d.dept_name ;

-- q12
SELECT de.dept_no ,avg(salary) FROM dept_emp de
JOIN departments d 
ON d.dept_no = de.dept_no 
JOIN salaries s 
ON s.emp_no = de.emp_no
GROUP BY de.dept_no
HAVING avg(salary) >= 70000;

-- q13 
SELECT title,count(*) FROM dept_emp de
JOIN employees e 
ON de.emp_no = e.emp_no 
JOIN titles t
ON t.emp_no = de.emp_no
GROUP BY title;

-- q14 @@
SELECT e.first_name, t.title, s.salary FROM dept_emp de
JOIN employees e
ON e.emp_no = de.emp_no 
JOIN titles t
ON de.emp_no = t.emp_no
JOIN salaries s
ON t.emp_no = s.emp_no
order BY salary desc
LIMIT 1;

-- q15



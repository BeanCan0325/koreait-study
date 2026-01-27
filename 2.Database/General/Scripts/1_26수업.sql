-- 1.INNER JOIN 
-- 2.Left join : 왼쪽 테이블의 모든 행과 오른쪽 테이블에서 일치하는 행동들을 반환
-- 3. 서브쿼리 : sql 쿼리 안에 쿼리가 하나 더 들어가는 형태 
--     3-1 단일행 서브쿼리
-- 	   3-2 다중행 서브쿼리 (IN)
-- 			> 높은 급여를 받는 직원 순으로 여러명 조회
--			>

USE employees;

SELECT * FROM salaries s
WHERE (emp_no,salary) IN (SELECT emp_no, MAX(salary) FROM salaries
							GROUP BY emp_no);

SELECT emp_no, MAX(salary)  form slalries
GROUP BY emp_no;

-- 현재 직급 정보 조회 (서브쿼리 사용)
SELECT * FROM titles t ;
select emp_no, title, to_date
from titles
WHERE (emp_No, to_date) IN(SELECT emp_no, max(to_date) from titles
							GROUP BY emp_no);


SELECT * FROM salaries; -- 1년마다 연봉이 상승한 급여정보도 확인가능

SELECT emp_no, salary, to_date
FROM salaries 
where( emp_no , to_date) IN(
		SELECT emp_no, max(to_date) FROM salaries s
		GROUP BY emp_no);

-- q1 첫 입사부서 조회
-- dept_emp 테이블의 가장 낮은 from_date는 입사일 의미
-- 조건절의 서브쿼리로 emp_no, from_dte를 가져와서 비교
-- 조건절에 맞으면 dept_emp테이블의 emp_No, dept_no, from_date 조회

SELECT * FROM dept_emp
where( emp_no, from_date) IN (select emp_no, min(from_date) FROM dept_emp
							GROUP BY emp_no);
							

-- [인라인 뷰] : 메인쿼리의 from에 
-- q1. 부서별 평균급여를 인라인뷰로 만든 후 조회하기 
SELECT * FROM ( SELECT dept_no, avg(salary) FROM dept_emp de
				JOIN salaries s ON de.emp_no = s.emp_no
				GROUP BY de.dept_no) a;

SELECT * FROM salaries 
ORDER BY salary DESC
LIMIT 3;

SELECT emp_no , salary, salary*1.1 AS increment_salary FROM salaries 
ORDER BY salary DESC
LIMIT 3;

SELECT *
FROM (SELECT emp_no , salary, salary * 1.1 AS increment_salary 
FROM salaries
ORDER BY INCREMENT_salary DESC
LIMIT 3) a
WHERE increment_salary >= 170000;
-- 위에꺼 묶기

-- dept_no, 평균연봉(salary)을 조회( 인라인뷰)
-- 메인쿼리에서 평균 연봉이 70000 이상인 부서만 조회 
SELECT *
from(
		SELECT dept_no, avg(salary) as avg_salary
		FROM dept_emp de
		JOIN salaries s ON de.emp_no = s.emp_no
		GROUP BY dept_no
		) t
WHERE avg_salary >= 70000;

-- q2 사원 별 급여가 80000이상인 직원만 조회 

SELECT * 
FROM ( SELECT emp_no, avg(salary) AS avg_salary FROM salaries s
	  GROUP BY emp_no) t
WHERE avg_salary >= 80000; 


-- ==================================================
-- [3.select -연산자와 조건 검색]

-- 1. 연산자 종류
-- 	- (): 우선순위 높이기 위해서 사용
-- 	- 산술연산자 (* / + -)
-- 	- 비교연산자 ( =, !=, <>, <, <=, >, >=)    ^= 
-- 	- IS NULL, LIKE, IN
-- 	  > IS NULL : 빈 값인지 확인 
-- 	  > LIKE : 문자열 패턴 검색(%는 0글자 이상, _는 무조건 1글자)
-- 	  > IN : 여러 값을 비교할 때 사용( ex) 컬럼명 IN('M','W'))
-- 	- BETWEEN 이상값 AND 이하값(범위 검색)  
-- 	- NOT : 논리부정(참을 거짓으로, 거짓을 참으로)
-- 	- AND : 두 피연산자의 조건이 모두 같다면 참
-- 	- OR: 두 피연산자 중 하나라도 같다면 참

-- 2. 정렬
-- 	- ORDER BY 컬럼명 옵션
-- 	  > 옵션1: ASC(기본값) 오름차순
-- 	  > 옵션2: DESC(내림차순)
-- 	 
-- 	3. 그룹 함수
-- 	 - 여러개의 행을 묶어 연산하여 결과를 반환
-- 	 - 아래에서 작성할 그룹함수 외에도 다양한 그룹함수를 지원
-- 	 
-- 	4. 그룹함수 종류(집계함수)
-- 	 - max(컬럼명) : 최댓값
-- 	 - min(컬럼명) : 최솟값
-- 	 - avg(컬럼명) : 평균
-- 	 - sum(컬럼명) :
-- 	 - count(컬럼명) : 반환된 행의 개수 
-- 	 
-- 	 5. GROUP BY 
-- 	 - 조회된 데이터의 여러개 행을 특정 컬럼의 값을 기준으로 묶어 그룹화
-- 	 - 일반적으로 그룹함수와 함께 사용
-- 	 
-- 	 6. HAVING
-- 	 - 그룹 함수를 이용한 조건을 작성할 때 주로 사용
-- 	 - ex) count(*) >= 100
-- 	 - 주의 : 문법상 GROUP BY 뒤에 위치해야함
-- 	 
-- 	 7. SELECT 실행 순서
-- 	 - 처음 FROM 으로 테이블 수입
-- 	 - 이후 아래로 실행(모두 실행되거나, ORDER BY 를 만나기 전까지 )
-- 	 - 이후 select로 필요한 컬럼만 조회
-- 	 - ORDER BY 가 있다면 마지막으로 실행
-- 	 - FROM -> WHERE -> GROUP BY -> HAVING -> SELECT -> ORDER BY
-- 	 
-- 	 8. JOIN
-- 	 - 두 개 이상의 테이블 데이터를 모두 조회 할 때 사용
-- 	 - 종류: INNER JOIN, LEFT JOIN, RIGHT JOIN ...
-- 	 
-- 	 a. INNER JOIN
-- 	  - ON 절에서 두 테이블의 공통된 값이 있을 경우에만 조회
-- 	 b. LEFT JOIN 
-- 	  - ON 절에서 두 테이블의 공통된 값이 없어도 기준 테이블(FROM 테이블)은 무조건 조회
-- 	 c. RIGHT JOIN
-- 	  - ON 절에서 두 테이블 공통된 값이 없어도. JOIN 된 테이블 은 무조건 조회
-- 	  - 기준 테이블 값이 없어도 null로 채워져서 조회됨
-- =====================================================================

-- [서브쿼리]** 중요합니다.
-- 	: 쿼리안에 쿼리가 있는

-- q1 입사일이 1993-02-19이면서 1964-10-24인 직원 이름 구하고, 
-- 		다시 해당이름으로 조건을 검색해서 사번(emp_no)를 구해야 하는 경우

SELECT first_name, last_name from employees
WHERE hire_date = '1993-02-19'
AND birth_date ='1964-10-24';


SELECT  emp_no FROM employees
WHERE first_name = 'Conrado'
AND last_name = 'Serra';

-- 서브쿼리 사용 
SELECT emp_no FROM employees
WHERE FIRST_name = 
			(SELECT first_name from employees
			WHERE hire_date = '1993-02-19'
			AND birth_date ='1964-10-24') -- 이거 한줄로 줄여지긴함
AND last_name =
			(SELECT  last_name from employees
			WHERE hire_date = '1993-02-19'
			AND birth_date ='1964-10-24');

SELECT emp_no
FROM employees
WHERE (first_name, last_name) = (SELECT FIRST_name, last_name FROM employees 
								WHERE hire_date: '1993-02-19'
								AND birth_date : '1964-10-24');

-- 직원중에서 emp_no가 가장 높은 직원 찾기
SELECT first_name, last_name FROM employees
WHERE emp_no = (SELECT max(emp_no) FROM employees);

SELECT max(emp_no), FIRST_name, last_name FROM employees
GROUP BY FIRST_name, last_name, emp_no
ORDER BY emp_no DESC 
LIMIT 1; -- order by 쓰고 맨 위에 있는거 출력

SELECT FIRST_name, last_name FROM employees
ORDER BY emp_no DESC 
LIMIT 1;


SELECT first_name,last_name  FROM employees
WHERE hire_date = (
SELECT min(hire_date) FROM employees
);

-- 가장 높은 연봉을 받는 직원 이름 조회 -조인 없이
SELECT FIRST_name FROM employees 
WHERE emp_no = (
SELECT emp_no FROM salaries s
ORDER BY salary desc
LIMIT  1
);

-- 평균 사번보다 높은 직원의 이름만 출력
SELECT first_name, last_name  FROM employees
WHERE emp_no >= (select avg(emp_no) FROM employees);


SELECT *  FROM employees e
WHERE hire_date > (
	SELECT  avg(hire_date) FROM employees
	WHERE emp_no = e.emp_no );
-- 참조도 아니고 밖에 있는 테이블을 참조하고 있음. 느림
-- 상관 서브쿼리 (밖의 컬럼을 참조하는거)   : 이거 안쓰는게 좋음 왠만하면 버리셈 성능 낮음. JOIN 쓰는게 나음


-- 다중행 서브쿼리 
SELECT emp_no, salary FROM salaries 
WHERE salary IN (
SELECT salary
FROM salaries s 
ORDER BY salary DESC);

-- 이를 통해 알아야 하는건 하나하나의 개념보다도
-- 결국은 어떻게 짜야할지 느낌을 보는것과 , 에러가 떴을 때 찾는거랑 
-- 다른사람의 코드를 보는거.


-- 12. 서브쿼리
-- 		: SQL 쿼리 안에 포함된 또 다른 쿼리
-- 		: 쿼리안에 쿼리가 있는 구조
-- 		
-- 	13. 조건 서브쿼리
-- 	    : WHERE 절에 사용하는 서브쿼리
-- 	     - 단일행 서브쿼리: 서브쿼리 실행 결과가 데이터가 1개인 서브쿼리
-- 	     - 다중행 서브쿼리: 서브쿼리의 실행 결과가 컬럼이 2개 이상인 서브쿼리
-- 	     - 다중열 다중행 서브쿼리: 서브쿼리의 실행 결과가 데이터가 2개 이상, 컬럼이 2개이상인 서브쿼리
-- 	
-- 	14. 단일행 서브쿼리
-- 	     : 결과값의 데이터(행)가 1개인 서브쿼리
-- 	     : 단일행 비교 연산자 사용
-- 	       > 단일행 비교 연산자: =, <=, <, >=, !=
-- 	      예시)  SELECT FIRST_name, last_name, FROM employees
-- 	            WHERE emp_no = (SELECT max(emp)_no FROM employees)
-- 			
-- 	 15. 다중행 서브쿼리
-- 	 	  : 결과 값의 데이터(행)가 2개 이상인 서브쿼리
-- 	 	  - 다중행 비교 연산자 사용
-- 	 	    > 다중행 비교 연산자 : IN ALL ANY ...
-- 	 	    예시)  SELECT emp_no, salary form salaries
-- 	 	    	  WHERE salary IN( SELECT salary FROM salaries)
-- 	 	    	  
-- 	 16. 다중열 다중행 서브쿼리
-- 	 	   : 결과 값의 데이터와 컬럼의 개수가 2개 이상인 서브쿼리
-- 	 	   예시) SELECT  emp_no, title, to_date, FROM titles
-- 	 	   WHERE (emp_no, to_date) IN (SELECT emp_no, max(to_date) FROM titles GROUP BY emp_No)
-- 	 	   
-- 	 17. 인라인 뷰
-- 	      	: FROM 절에 서브쿼리를 사용하는 방식
-- 	      	- 서브쿼리 수행결과가 테이블처럼 사용됨
-- 	      	예시) SELECT * FROM (SELECT dept_No, count(*) AS cnt FROM dept_emp
-- 	      							GROUP BY dept_no ) d;
-- 	 		주의1) 반드시 인라인 뷰 작성 후 테이블 별칭을 지어줘야함
-- 	 		주의2) 그룹 함수 사용시 별칭을 지어줘야 메인쿼리에서 사용 가능
-- 	 		참고_ 조건은 되도록 메인쿼리에서 작성 해주는것이 성능상 좋음
	 		
	 		

-- [데이터베이스 정규화 ]
-- : 이상문제를 해결하기위해 컬럼들끼리의 종속관계를 분석하여 여러개의 릴레이션(테이블)으로
--   분해하는 과정 (사입이상, 삭제이상, 갱신이상)
-- 	 결국 데이터베이스를 많이 쪼개는거 -> 그러면 join을 많이해서 느려지니까 3정규화정도로 
-- [데이터베이스 반정규화]
-- : 의도적으로 합쳐서 join을 줄이는거 (select의 성능이안나옴)



-- [TCL ****굉장히 중요]
-- transcatino Controll Language : **트랜잭션**을 제어하는 언어
-- 트랜잭션(Transcation)
-- 			: 데이터베이스에서 실행되는 논리적 작업 단위 
-- 			: 예를들어 송금과정의 전부가 트랜지션
-- 트랜잭션의 특징 ACID 
-- 
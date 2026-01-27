SELECT * FROM employees
ORDER BY birth_date desc;
-- 오름차순/ 뒤에 desc: 내림차순// ASC:올림차순(기본값)

SELECT * FROM titles 
order BY to_date DESC;


-- 함수
SELECT max(salary) FROM salaries;
SELECT salary from salaries;
SELECT min(salary) from salaries;
SELECT avg(salary) from salaries;
SELECT sum(salary) from salaries;

-- 조회된 칼럼의 개수
SELECT count(salary) from salaries; 
SELECT count(*) AS '직원수' from salaries; 

-- title 이 엔지니어인 직원의 수
SELECT count(title) from titles
WHERE title = 'Enginner';

-- 입사일이 1965년 1월1일 이후인 직원의 수 조회
SELECT count(*) FROM employees
WHERE hire_date > '1965-01-01';

-- emp_no가 가장 낮은 직원과 가장 높은 직원 조회
SELECT * FROM employees
WHERE emp_no = (SELECT min(emp_no) FROM employees)
OR emp_no = (SELECT Max(emp_no) FROM employees);

SELECT min(emp_no), max(emp_no) FROM employees;

-- 에러 "행의 개수가 안맞음"
-- SELECT max(emp_no), birth_date FROM employees;


-- [group by]
-- 조회된 데이터 여러 개의 행을 특정 컬럼을 기준으로 묶어 
SELECT max(emp_no), birth_date FROM employees
GROUP BY birth_date;
-- group by(1.먼저 같은 값들끼리 그룹화)를 기준으로 emp_No가 높은 수를 가져오는거 
SELECT count(*), birth_date FROM employees
GROUP BY birth_date;


-- 부서별 직원 수 구하기
-- 직원수, 부서 번호(dept_no) 조회

SELECT count(*), dept_no FROM dept_emp
GROUP BY dept_no;

-- 실습 문제 
-- q1
SELECT count(*) FROM  employees
GROUP by(gender);


-- q2
SELECT count(*), title FROM titles
GROUP BY (title)
order BY title DESC;

SELECT count(*), title FROM titles
GROUP BY (title)
-- group by 아래에 조건주기 "Having"
HAVING count(*) >= 100000;
order BY title DESC;

-- 조건을 줄때 그룹 함 수 필요 
-- Having : 그룹함수 필요시 / Where: 그룹함수 필요 없을 시 

-- dept_emp에서 직원 수가 5만 이상인 부서만 조회
SELECT count(*),FROM dept_emp
GROUP BY dept_no 
HAVING count(*) >= 50000;

-- 현재 재직중 직원들 중 직무별 직원 수가 200명 미만인 직무만 조회
SELECT count(*),title FROM titles
WHERE to_date = '9999-01-01'
GROUP BY title 
HAVING count(*) < 200;


-- [select 쿼리 실행 순서] 
-- from -> where -> Group by -> having -> select -> ordered by 
SELECT count(*),title FROM titles
WHERE to_date = '9999-01-01'
GROUP BY title 
HAVING count(*) < 200;
Ordered BY    -- 가장 마지막으로 실행

-- [join@@ 중요]
-- : 두개 이상의 테이블의 데이터를 모두 조회할 때 사용하는 구문
-- :pk,fk로 연관되있는 데이터 조회하기 위해 많이 쓰임

-- :oracle조인 && ASNI조인 두개있음

-- <join 종류> : 뭐가 많음 
-- inner join: 두 테이블의 공통된 컬럼 값만 조회
-- : , inner join, left join

-- 1. 사번, 이름, 연봉조회
SELECT e.emp_no, e.first_name, s.salary FROM  employees e
JOIN salaries s
ON e.emp_no = s.emp_no;
-- e시트의 emp.no 랑 s시트의 emp_no 가 일치하면 join(붙인다.)


SELECT * FROM  employees e
JOIN salaries s
ON e.emp_no = s.emp_no
WHERE to_date='9999-01-01';
-- 테이블 양옆으로 붙음 


-- 사번, 이름, 직무 조회 (현재 재직중인)
SELECT e.emp_no, FIRST_name, title FROM employees e
JOIN titles t
ON e.emp_no = t.emp_no
-- e.emp_no ->primary //t.emp_no -> foriegn
WHERE t.to_date = '9999-01-01';

-- 사번, 이름 ,연봉 ,직무
SELECT e.emp_no, FIRST_name, LAST_name,s.salary, t.title	FROM employees e
JOIN salaries s  
ON e.emp_no = s.emp_no 
AND s.to_date = '9999-01-01'
JOIN titles t 
ON  e.emp_no = t.emp_no
AND t.to_date ='9999-01-01';
-- 겹치는거 어떻게 없

SELECT * FROM departments d
LEFT JOIN dept_manager dm 
ON d.dept_no = dm.dept_no;
-- 왼쪽 테이블에 있는거 무조건 필요할 때 left. 없으면 null로 채워서 
-- from 쓴게 기준

SELECT * FROM departments d
right JOIN dept_manager dm 
ON d.dept_no = dm.dept_no;
-- right은 무조건 조회. 왼쪽이 없으면null로 채워서



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

package kr.co.koreait;
import java.util.Scanner;

public class Ex01_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		//변수 선언
		int varNum;
		varNum = 10;
		System.out.println(varNum);
		// 값 : 리터럴이라고도 표현함
		
		//명시적 초기화 
		// - 변수 선언과 초기화 동시에 진행
		int num1 = 100;
		
		// 자료형: 크기까지 외우셈
		boolean isStudent = true; //1byte
		char grade ='A'; //2byte
		byte smallNumber =127; //1byte
		int age = 19; //4byte
		long population = 800000000000L;// 8byte
		float pi = 3.14F; //4byte
		double gravity = 9.80665; // 8byte
		
		//비트 : 컴퓨터에서 정보를 표현하기 위한 최소 단위
		// 0또는 1로 표현됨
		//바이트 : 
		// 8개의 bit로 이루어진 단위
		// 8bit = 1byte
		
		//예를들어
		// 0	1	1	1	0	0	1	0
		//128  64  32  16   8   4   2   1
		// 1 byte -128 ~ 127 까지의 범위
		
		int userAge= 19;
		System.out.println("유저나이:"+ userAge);
		userAge= 22;
		System.out.println("변경유저나이:"+ userAge);
		
		
		// 상수
		final int USER_AGE =100;
//		USER_AGE = 1;
		System.out.println(USER_AGE);
		
//		float pi = 3.14F;
//		double gravity = 9.8065L;
		
		//🚨형변환
		
		// 자동 형변환(암시적 형변환)
		//  : 개발자가 직접 형변환을 해주지 않아도 컴파일 과정에서 자동으로 변환됨
		//  : @@ 범위가 작은 자료형 -> 범위가 큰 자료형
		byte num3 = 10;
		int num4 = num3; // 1byte -> 4byte 
		System.out.println(num4);
		
		// 아스키코드표
		// A= 65  a=97 이것만 외워서 하나씩 더하면됨
		// 근데 뒤에 특수문자좀 껴있음
		// 문자를 숫자로 바꾸면 아스키코드표에 있는 10진수가 나옴
		
		char ch ='a';
		int num5 = ch;
		System.out.println(num5);
		
		long longNumber = 10000000000L;//8byte
		float floatNum = longNumber; // 4byte
		System.out.println(floatNum);
		// -> 실수라서 메모리상 실수를 포함할 수있는 범위가 훨 넓음 
		// l.le5( 이런 부동소숫점을 쓰면 훨씬 더 많은 가능)
		// 실수형은 양수보다 더 넓은 범위를 사용하기 때문에 가능 
		//상관없이 정수 다받는거가능(메모리 설계상)
		
		
		//<강제형변환>(명시적형변환) 큰애를 작은애한테 넣는다.
		// : 개발자가 직접 형변환을 작성해줘야함. (컴파일에러)
		long lNumber = 100000000000L;
//		int iNumber = lNumber;
		int iNumber = (int)lNumber;
		// 8byte를 강제로 4byte로 변경하는거라 (주의)데이터 손실 항상 발생
		System.out.println(iNumber);
		
//		 -----------------------------------------------
		
		System.out.println("줄바꿈을 포함");
		System.out.print("줄바꿈 없음, 줄바꿈 개항문자 : \n");
		
		System.out.printf("줄바꿈 없음, 변수를 서식문자 사용 \n");
		// 서식문자: 데이터의 출력 형식을 지정하는 특수문자
		// 서식문자 종류
		// 1.%b :boolean
		// 2.%d :정수(byte,short, int,long)
		// 3.%o :8진수
		// 4.%x: 16진수
		// 5.%f: 실수(float, double)
		// 6.%c: 문자
		// 7.%s: 문자열
		// 6.%n: 개행 문자(줄바꿈)
		
		String name ="김땡땡";
		int age2 =19;
		String addr= "인천";
		System.out.printf("이름은 %s 입니다. %d살 입니다. %s 거주중입니다. \n",
							name,age2,addr);
		
		double pi_double =3.14;
		System.out.printf("pi_double의 값은 %2f 입니다.\n",pi_double);
		System.out.printf("pi_double의 값은 %f 입니다.\n",pi_double);
		
		// 이스케이프 문자: 백슬래시(\)와 문자를 조합한 문자
		// 1. \n: 줄바꿈(개행문자)
		// 2. \t: 탭
		// 3. \b: 백스페이스
		// 4. \문자: 특수 문자를 일반 문자열로 인식해야 할 때 사용
		
		System.out.println("\"Hello, world!\"");
		System.out.printf("개행문자는 \\n 입니다.\n");
	
//		------------------------------------
		//Scanner Class
		// -사용자로부터 콘솔에 값의 입력받는 기능 제공 클래스 
		
		//사용방법
		// 1. import java.util.Scanner;
		// 2. Scanner sc = new Scanner(System.in);
		// 3. String choice = sc.nextLine();
		
		Scanner sc = new Scanner(System.in);
		// @ ctrl + shift + 0 => import
		
		// [스캐너의 메서드들]
		// 1. nextInt(); 개행문자 전까지
		// 2. nextFloat(); 개행문자 전까지
		// 3. nextDouble();
		// 4. next();  -> 단어를 처리할 때 사용되며 공백전까지 입력받은 데이터 반환
		// 5. nextLine(); 개행문자까지 (개행문자 빼버림)
//						-> 문자열 처리할 때 사용되며 \n 기준으로 데이터를 반환
//						-> 엔터입력시 \n들어감
//		System.out.print("이름: " );
//		String inputName = sc.next();
//		System.out.println(inputName );
		// 띄어쓰면 앞글자 밖에 안나옴
		
		System.out.print("숫자: ");
		int inputNum = sc.nextInt();
		System.out.println("입력한 숫자: "+ inputNum);
		
		
		//실행안됨 -> 
		sc.nextLine();
		System.out.println("주소: ");
		String inputAddr = sc.nextLine();
		System.out.println("입력한 주소: "+ inputAddr);
		// 숫자입력받고 그냥 넘어감. 
		// next -> 공백전까지만 입력받음 
		// Line -> 개행까지만 입력받음  
		// 위의 프로세스 -> [1] [2] [3] -> Line()이 애를 만난거임->[\n]
		// 그래서 sc.nextLine(); 을 중간에 넣어줘야함
		
		
		
	}

}

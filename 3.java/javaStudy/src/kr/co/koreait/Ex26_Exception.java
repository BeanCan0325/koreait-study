package kr.co.koreait;

import java.util.Scanner;

public class Ex26_Exception {
	public static void main(String[] args) {

//		try {
//			int[] numbers = {1,2,3};
//			System.out.println("예외 발생 전");
//			numbers[2] = 10;
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("예외 발생 후");
////			Exception e => 모든 예외의 부모라 다 커버는 가능한데
////			 			: 특정 예외 메세지를 넣을 수 없음.
////						: 그리고 나중에 유지보수할때 예외가 터지면 뭔 예외인지 모르게됨.
//			System.out.println("예외 발생!! :" +e);
//		} finally {
////			예외 발생 유무와 상관 없이 실행할 코드
//			System.out.println("Finally!");
//		}
//		System.out.println("끝");
//	
////		Scanner sc =new Scanner(System.in);
//		
//		try(Scanner sc = new Scanner(System.in)) {// try-with-resources 라는 용법
//		System.out.print("첫번째 숫자: ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("두번째 숫자: ");
//		int num2 = sc.nextInt();
//		
//		int result = num1/num2;
//		System.out.println("나눗셈 결과: "+ result);
//		} catch (InputMismatchException inputE) {
//			System.out.println("숫자를 쓰라고");
//		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
////			System.out.println("발생한 예외: "+ e);
////			------------------
//		e.printStackTrace();  //예외이름, 내용 등이 뜬다. 
////		^ 오류가 몇백줄 될 때 다 해버리면 불필요한 정보까지 뜨기 때문에 잘 안씀
//		System.out.println(e.getStackTrace()[0]);
//		System.out.println(e.getMessage()); //예외 설명만 나옴
//			
//		}
//		
//		finally {
////			sc.close();
//			System.out.println("프로그램 종료");
//			----------------------------

//		try {
//			//의도적으로 예외를 발생시킴
////					new 000() -> 객체 생성과 유사. 예외도 다 클래스로 되어있음
//			throw new ArrayIndexOutOfBoundsException();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("예외발생");
//		}
//	}

//	---------------------

//	try {
//		readFile();
//	}catch(IOException e) {
//		System.out.println("파일을 찾을 수 없다.");
//	}
//	
//	public static void readFile() throws IOException{
////		Checked Exception (예외처리 필수)
//		FileReader fr = new FileReader("test.txt");
//	}

//	----------------

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("나이: ");
			int age = sc.nextInt();

			checkAge(age);
		} catch (Ex26_2_CustomException e) {
			System.out.println("예외발생: " + e);

		}
	}

//  RuntimeException 상속받았으면 throws 선택 가능해짐. 'Exception'으로 상속받았기에 throws 필수 작성한 것.
	public static void checkAge(int age) throws Ex26_2_CustomException {
		if (age < 0) {
			throw new Ex26_2_CustomException("나이는 음수가 될 수 없습니다.!");
		} else if (age < 18) {
			throw new Ex26_2_CustomException("미성년자는 접근할 수 없습니다.!");
		} else {
			System.out.println("정상적으로 접근되었습니다.");
		}
	}
}

package kr.co.koreait;

public class Ex26_1_Unchecked {
	public static void main(String[] args) {
		
		try {
			ExceptionTest.uncheckedMethod();
		} catch (ArrayIndexOutOfBoundsException e) {
//			자기 혼자 예외 받아서(throws없음) 발생시킨거.
			System.out.println("예외발생");
		}
	}
	

}

class ExceptionTest{
	public static void uncheckedMethod() {
//		UncheckedException 
//			- 얘는 throws를 작성하지 않아도 UncheckedException은 예외가 자동 전파
		throw new ArrayIndexOutOfBoundsException();
	}
	
	
	
}

package kr.co.koreait;

public class Ex26_1_BookNotFoundException extends RuntimeException{

		public Ex26_1_BookNotFoundException(String message) {
			super(message);
			System.out.println(message);
		}
}

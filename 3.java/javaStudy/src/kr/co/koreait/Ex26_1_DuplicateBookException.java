package kr.co.koreait;

public class Ex26_1_DuplicateBookException extends RuntimeException{

		public Ex26_1_DuplicateBookException(String message) {
			super(message);
			System.out.println(message);
		}
}

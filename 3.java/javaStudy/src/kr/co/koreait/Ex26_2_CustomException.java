package kr.co.koreait;

import java.util.Scanner;
// Exception 상속받으면 CheckedException (예외처리 필수)
//  - 컴파일 단계에서 검사( 예외처리 필수)
//	RuntimeException 상속받으면 unCheckedException (예외처리 선택)
// 	- 컴파일 단계에서 검사 안함. 런타임(실행중)에 예외 발생하면 자동 전파 ㄴ

public class Ex26_2_CustomException extends RuntimeException {

	Ex26_2_CustomException(String msg){
		super(msg);
	
	}

}

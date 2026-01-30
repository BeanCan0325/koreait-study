package kr.co.koreait;

public class Ex14_1_Calc {
	
   public static void main(String[] args) {
	
	  Ex14_1_Calc cl = new Ex14_1_Calc();
	  cl.add(1, 2);
	  cl.add(12, 2, 3);
	  
}
	
	
//(실습)
	public int add(int num1, int num2) {
	 int result = num1+ num2;
	 System.out.println("2개를 더한 값"+result);
//(주의) 		      ▲ ("문자열"+숫자 +숫자) : 하면 문자열 이어붙이듯 나옴
	 return result;
	}
	public int add(int num1, int num2, int num3) {
	 int result = num1 + num2  + num3;
	 System.out.println("3개를 더한 값"+result);
	 return result;
	}
	


}

package kr.co.koreait;

public class Ex15_Recursion {

	public static void main(String[] args) {
//      [재귀호출] : 코딩테스트,정보처리기사에서 나옴 	
		
		Ex15_Recursion rc = new Ex15_Recursion();
		int result = rc.sum(5);
		System.out.println(result);

	}

//(실습)
//	[재귀호출]
	public int sum(int n) {

		if (n == 1) {
			return 1;
		}

		return n + sum(n - 1);
	}
	
	
	
//(정처기 준비문제)
	public void test(int n) {
		if( n== 0) {
			return;
		}
		System.out.println(n+" ");
		test(n-1);
	}
	public void test(int n) {
		if( n== 0 || n == 10) {
			return 0;
		}
		int sum1 = 0;
		int sum2 = 0;
		
		 sum1 += test(n-1);
	     sum2 += test(n+1);

		return sum1+sum2;
	}
}

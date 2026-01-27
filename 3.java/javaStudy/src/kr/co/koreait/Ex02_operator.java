package kr.co.koreait;

public class Ex02_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//[연산자 Operator]
		//: 수학적 계산이나 데이터 처리를 수행하기 위해 사용하는 기호 또는 기호조합
		
		//1 산술연산자
		// + - *
		System.out.println(10/2); // 몫
		System.out.println(10%2); // 나머지
		
		//2 증감연산자
		 int num = 10;
		System.out.println(num);
		num++;
		System.out.println(num);
		
		//전위 : 피연산자의 값을 먼저 증가 또는 감소 시킨 후 연산을 수행
		int x = 10;
		System.out.println("전위연산자: " + ++x);
		System.out.println("x의 값:" + x);
		
		int y = 10;
		System.out.println("후위연산자: " + ++y);
		System.out.println("y의 값:" + y);
		
//		3. 비교연산자 
		System.out.println("--------------비교연산자----------" );
		String str1 ="ABC";
		String str2 = new String("ABC");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		// "".equals(str1) -> 비어있냐 (거짓)
		// !"".equals(str1) -> 비어있지않냐 (참)
		
//		4. 논리부정연산자
		System.out.println("--------------논리부정연산자----------" );
		String str3 = "가나다라";
		System.out.println("".equals(str3)); // str3이 비워져있으면 true
		System.out.println(!"".equals(str3)); // str3이 비워져있지 않으면 true
		
		// equals 권장방식 (만약 str3; 선언만되어있다면)
		//: 비어져있는 애가 앞으로 -> "".equals(str3) 
		// vs  str.equals("") ^null -> nullPointerException뜸
		
		
		System.out.println("--------------논리연산자----------" );
		//5. 논리 연산자
		// - 논리식으로 판단하여 참(true)또는 거짓(false)를 반환
		// &&  ||
		System.out.println(10<5 && 20 == 20); //and 연산자  
		// 				앞에서 거짓이 이미 나와서 뒤를 안봄
		System.out.println(33>28 && 5 !=7);

		System.out.println(10>5 ||  20==20);  //or 연산자
		System.out.println(33>28 || 5 !=7); // 앞쪽에서 true 나오면 뒤에 안봄
		
		
		System.out.println("--------------복합 대입 연산자----------" );
		int sum = 0;
		sum += 10;
		
		System.out.println(sum);
		
		int a = 10;
		int b = 20;
		System.out.println(a>b ? a+b : b-5);
		
		// 6. 비트연산자 
		// : 오른쪽으로 밀때 부족한 자릿수는 버려짐 
		
		
		
		
	}

}

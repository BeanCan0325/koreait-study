package kr.co.koreait;

import java.util.ArrayList;

public class Ex27_1_extendsGeneric {
	public static void main(String[] args) {
		
		Ex27_1_Calc<Integer> calc = new Ex27_1_Calc<>();
		calc.add(10, 20);
		
//		
//		Ex27_1_Calc<String> calc2 = new Ex27_1_Calc<>();
//		calc2.add("A", "B");
		
		Ex27_1_Calc2 c = new Ex27_1_Calc2();
		ArrayList<Integer> list = new ArrayList<>();
		c.add(list);
		
	}

}


// [하한제한]
class Ex27_1_Calc2{		//? ->와일드카드
	public void add(ArrayList<? super Integer> list) {
//								물음표로 받되, 숫자만 받겠다고 한계를 정한거
			list.add(10);
			list.add(20);
		System.out.println(list.toArray());
	}
}

// [상한제한]
//		- 이 클래스를 상속받는 하위 클래스들만 허용
class Ex27_1_Calc<T extends Number>{
	public void add(T num1, T num2) {
		Integer a = (Integer) num1;
		Integer b = (Integer) num2;
		System.out.println(a + b);
	}
}

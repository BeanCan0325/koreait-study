package kr.co.koreait;

import kr.co.training.Test;

public class Ex20_Encapsulation {

	public static void main(String[] args) {
			Ex19_1_Test t = new Ex19_1_Test();
			
			Test t2 = new Test();
//			^ import 안하면 오류뜸 
//			근데 Test 클래스도 class Test{}이면 import 못함.
			
//			[클래스 접근제어자]
//			- public : 전체 패키지에서 접근 가능
//			- (default): 같은 패키지에서만 접근 가능

//			변수도 접근제어가가 동일한 원리로 붙는다.
//			public protected (default) private	
			
			t2.num1  = 10;
			
//			t2.num2 = 20;
//			^ default라서 접근불가 
//			t2.num3 = 30;
//			^ private는 접근 불가
			
//(개념)
//			<필드, 메서드의 접근제어자>
//			-public : 어디서든 접근가능
//			-protected : 다른 패키지에 있더라도 상속 관계라면 사용가능
//			-(default): 같은 패키지에서만 사용가능 
//			- private: 같은 클래스에서만 가능
			
//(개념)     [캡슐화]
//			- 불필요한 정보를 노출시키지 않는 개념
//			  > 객체의 내부 구현을 외부로부터 숨김(정보은닉)
//			  > 잘못된접근으로부터 보호				
			
	}

}

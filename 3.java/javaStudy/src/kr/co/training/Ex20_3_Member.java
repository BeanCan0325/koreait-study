package kr.co.training;

public class Ex20_3_Member {

	public void introduce(Ex20_3_MemberInfo memberInfo) {

		String student;
		if (memberInfo.getAge() <= 20) {
			student = "학생입니다.";
		} else {
			student = "학생이 아닙니다.";
		}

//		System.out.printf("이름: %s \n나이: %d \n사는곳: %s \n학생여부: %s \n", memberInfo.getName(), memberInfo.getAge(),
//				student);
		System.out.println("=================================");
		System.out.println("이름: "+ memberInfo.getName());
		System.out.println("나이: "+ memberInfo.getAge());
		System.out.println("주소: "+ memberInfo.getAddr());
		System.out.println("학생여부: "+ student);
		System.out.println("=================================");
		
	}
		
	public void run(Ex20_3_MemberInfo memberInfo) {
		System.out.printf("🏃‍♂️‍➡️%s에 사는 %s이 달리고 있습니다.🏃‍♂️‍➡️🏃‍♂️‍➡️ \n",memberInfo.getAddr(),memberInfo.getName());
		
	}
		

}

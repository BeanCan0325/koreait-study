package kr.co.koreait.day3;

public class Training02_Calc {

    //1.덧셈수행 add() 작성
    //- 10 +10의 결과물 출력

    public int add(int inputNum1, int inputNum2) {
//        System.out.println(inputNum1 + inputNum2);
        return 10+10;
    }
    //2. 빼기 수행 sub() 작성
    // 숫자 2개 매개변수로 받고 각각 값을 뺀 결과를 출력

    public void sub(int num1, int num2) {
        System.out.println(num1-num2);
        System.out.println("빼기결과: "+(num1-num2));
    }

    //3. 곱하기 수행하는 mult()작성
    // - 숫자 3개를 매개변수로 받는다.
    // - 각각 값을 곱한 결과를 출력

    public void mult(int num1, int num2, int num3) {
        System.out.println(num1*num2*num3);
    }
    //4. 나누기 div()
    //- 숫자 2개 매개변수, 각각 값을 몫,나머지로 나눈 결과 출력
    //- 출력예시: "몫:00, 나머지:00"

    public void div(int num1, int num2){
        int i = num1%num2;
        int j = num1/num2;
        System.out.println("몫 = " + j);
        System.out.println("나머지 = " + i);

    }

    public int sum(int[] numbers) {
        int sum = 0; // 합계를 저장할 변수

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;

    }
}

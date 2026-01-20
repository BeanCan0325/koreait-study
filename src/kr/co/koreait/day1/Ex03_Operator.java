package kr.co.koreait.day1;

public class Ex03_Operator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);


        int result;
        int firstNumber = 50;
        int secondNumber = 20;

        result = firstNumber + secondNumber;
        System.out.println(result);

        result = firstNumber/ secondNumber;
        System.out.println(result);

        //+ 란 : 문자열+ 숫자 .. 숫자+ 숫자

        result = firstNumber % secondNumber;
        System.out.println(result);

        /* <산술연산자>
          - 사칙연산자
          - 증감연산자 : 1증가(++) 혹은 1감소(--)
         */

        int num3 = 10;
        num3 = num3 +1;

        //증감연산자
        num3++;

        System.out.println(num3);

        //1. 전위 증가 연산자  num3++
        //2. 후위 증가 연산자  ++num3
        //3. 전위 증감 연산자  --
        //4. 후위 증감 연산자

        int num4 = 10;
        System.out.println("후위 연산자: "+ num4++);
        System.out.println("이후 값: " + num4);

        int num5 = 10;
        System.out.println("전위 연산자: " + ++num5);
        System.out.println("이후 값: "+ num5);

        //비교연산자 : 비교할 때 쓰이는 연산자 (true or false)
        int num6 = 50;
        int num7 =20;
        System.out.println(num6 > num7);
        System.out.println(num6 >= 50);

        // a!= b a와 b가 같지 않다.

        String firstStr= "hi";
        String secondStr= new String("hi");

        System.out.println(firstStr == secondStr);

        System.out.println(firstStr.equals(secondStr));
        System.out.println("hi".equals("hi"));

        //<논리 부정 연산자>
        // true이면 false를 반환하고 false면 true를 반환.
        // 논리형을 부정하며 반대로 사용

        boolean isTrue = true;
        System.out.println(isTrue);
        System.out.println(!isTrue);


        //<논리 연산자>
        // - 논리식으로 판단하여 true또는 false를 반환

        //1. a && b : a와 b가 모두 참(true)일때 true를 반환 (and 연산자: 그리고 )
        //2. a || b: a또는 b가 둘중 하나라도 참(true)이면 true 반환 (or 연산자: 또는)

        boolean x = true;
        boolean y = false;

        System.out.println("==============");
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(10>5 && 5==5);


       // Q1. num8 변수에 값 100할당
        int num8 = 100;
        //Q2. num9 변수에 값 87
        int num9 = 87;
        //Q3. num8은 100 보다 작거나 또는 num9는 50보다 크다.
        System.out.println(num8 < 100 || num9 > 50);
        //Q4. num8은 67보다 크거나 그리고 num9는 100보다 작다.
        System.out.println(num8 >67 && num9<100);


        //<복합 대입 연산자>
        // - 산술연산자와 대입 연산자를 하나로 나타내는 기호
        int num10 = 100;
        System.out.println(num10);
        num10 += 5;
        System.out.println(num10);

        //<삼항 연산자>
        //- 조건식을 간단하게 줄여서 사용하기 위한 방식
        //- 아주 간단한 조건식의 경우 사용하면 코드의 길이가 주는데,
        // 무분별 사용시 코드가독성 bad

        int num11 = 10;
        int num12 = 20;
        System.out.println(num11>num12 ? num11+15 : num2-5);
    }
}

package kr.co.koreait.day1;
import java.util.Scanner;


public class Ex04_if {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int result = 0;
        int number = 10;
        System.out.println("전 result: " + result);
        if (number >= 10) {
            result = 10;
        }

        System.out.println("number: " + number);
        System.out.println("result: " + result);

        Scanner sc = new Scanner(System.in);
//        System.out.print("나이를 입력하세요: ");
//        int age = sc.nextInt();
//
//        if (age >= 19) {
//            System.out.println("성인입니다.");
//        } else {
//            System.out.println("미성년자입니다.");
//        }


        int num1 = 7;

        if (num1 < 5) {
            System.out.println("num1은 5보다 작습니다.");
        } else if (num1 > 5) {
            System.out.println("num1은 5보다 큽니다.");
        }

        int num2 = 5;
        if (num2 != 5) {
            System.out.println("num2는 5가 아닙니다.");
        } else {
            System.out.println("num2는 5 입니다.");
        }


        while(true) {
        System.out.print("num4 숫자입력:");
        int num4 = sc.nextInt();
            if (num4 >= 10 && num4 <= 20) {
                System.out.println("10~20입니다.");
                break;
            } else if (num4 == 21 || num4 == 22) {
                System.out.println("num4가 21 또는 22와 같다");
                break;
            } else {
                System.out.println("잘못값입력");
            }
        }
        sc.close();

        int num5=10;

        if(num5%2 == 0){
            System.out.println("짝수");
        } else if( num5%2 ==1){
            System.out.println("홀수");
        } else{
            System.out.println("삐빅오류");
        }
    }
}

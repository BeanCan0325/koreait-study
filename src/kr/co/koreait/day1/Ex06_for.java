package kr.co.koreait.day1;
import java.util.Random;
import java.util.Scanner;

public class Ex06_for {
    public static void main(String[] args) {

        // <for문>

        Scanner sc = new Scanner(System.in);
//        System.out.print("반복할 횟수 입력");
//        int count = sc.nextInt();
//        int sum =0;
//        //1부터 100까지의 합
//        for(int i =1; i < 101; i++){
//            int beforeSum = sum;
//            sum += i;
//            System.out.println(beforeSum +" + "+ i + "= "+ sum);
//        }

        // Q1: 짝수만 출력 // 짝수개수
      int count = 0;
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                count++;
//                System.out.println(i);
            }
        }
        System.out.println(count);


        //q2로또번호 생성기
        Random rd = new Random();

        for (int i = 0; i < 6; i++) {
            int lott = rd.nextInt(45)+1; // 1~45까지 무작위
            System.out.print(lott);
        }

        // <중첩 for 문>: for 문 안에 또다른 for문 사용구조

        int count2 =0;
//
//        for (int i = 0; i < 3; i++) {
//                System.out.println("*******i값: "+ i);
//            for (int j = 0; j < 5; j++) {
//                System.out.println("j값: "+ j);
//                count2++;
//            }
//        }
//        System.out.println("반복횟수: " + count2);
//

        // 구구단 출력
        // 2단부터 9단까지 출력( 이중for문)
        // 출력 형식: "2 * 1 = 2"

        for (int i = 2; i < 10; i++) {

                System.out.println("======"+i+"단 =====");
            for (int j = 1; j < 10; j++) {
                int sum = i*j;
                System.out.println(i +" * "+j+" = "+sum);
                //printf 사용
                System.out.printf("%d * %d = %d \n",i,j,sum);


            }
        }


    }
}

package kr.co.koreait.day2;
import java.util.Scanner;

public class Ex07_while {
    public static void main(String[] args) {

        //<while> 문
        // 조건식으로 동작하는 반복문
        // 반복할 횟수를 알고 있지 않은경우 사용
        // 반드시 언젠가는 끝나게끔(조건식이 거짓이 나오게) 코드를 짜야함.(무한루프)


//        int count = 0;
//        while (count < 10) {
//            System.out.println("현재 반복 횟수: " + count);
//            count++;
//        }

        //1-10까지 합계를 구해보시오 (while문 사용)

        int sum = 0;
        int count2 =1;
        while (count2 < 11) {
            sum += count2;
            count2++;
        }
        System.out.println(sum);


        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();


        //0을 입력하지 않으면 계속0을 입력할때까지 반복 (while 사용,)

        while (input != 0) {
            input = sc.nextInt();
        }

        System.out.println("0을 입력하셨습니다.");

        //<do-while 문>
        // 조건식과 상관없이 최초 1번은 실행

        int input2;
        do{
            input2 =sc.nextInt(); // 최초한번은 진행되고(이부분 헷갈) 그다음에 조건을 본다.
        } while(input2 !=0);



    }
}

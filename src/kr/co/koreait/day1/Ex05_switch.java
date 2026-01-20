package kr.co.koreait.day1;

import java.util.Scanner;

public class Ex05_switch {
    public static void main(String[] args) {
        // <SWitch>
        // -if와 똑같이 조건문이지만, 조건에 사용되는 연산자는 == 만 가능

        int num =1;

        // sitch 문에서 break를 사용하지 않으면 fall-through가 발생
        // 코드 흐름이 아래로 쭉 이어져서 코드가 계속 실행되는 현상
        switch(num){
            case 1:
                System.out.println("num1 == 1");
                break; //switch를 벗어나겠다.
            case 2:
                System.out.println("num2 == 2");
                break;
            default:
                System.out.println("num 1,2 둘다 아님");
        }

        Scanner sc = new Scanner(System.in);
        //con+shift+5

        System.out.println("============MENU=============");
        int input = sc.nextInt();
        switch(input) {
            case 1: System.out.println("☕🧊");
            break;
            case 2: System.out.println("☕🥛");
            break;
            case 3: System.out.println("🍓🥛");
            break;
            default: System.out.print("메뉴 없음❌");
        }

    }
}

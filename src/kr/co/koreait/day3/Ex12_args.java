package kr.co.koreait.day3;

import java.util.Arrays;
// 매개

public class Ex12_args {
    public static void main(String[] args) {
        Ex12_args a = new Ex12_args();
//        a.printNumbers(1);
        a.printNumbers(10,20);
        a.printNumbers(30,40,50);
        a.printNumbers(30,40,50,60);
    }
        //...-> 가변길이 매개변수 이거 잘 모르는거. / 가변길이는 int보다 무조건 순위가 낮다.
    //      가변길이 매개변수가 작성된 오버로딩은 호출 순위가 낮음.
    //      시그니처가 가장 제일 일치하는 애부터 호출한다.
    public void printNumbers(int num1, int num2,int... numbers){
        System.out.println(Arrays.toString(numbers));
    }
}

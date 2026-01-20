package kr.co.koreait.day3;

public class Training02_Main {
    public static void main(String[] args) {
        //Training02_Calc 객체를 생성하시오
        //=변수명 :calc
        //해당 객체의 모든 메서드를 1번 이상 씩 호출하시오


        //클래스이름 == 파일이름
    }
    public void calc (){
        Training02_Calc clac = new Training02_Calc();
        int sum =clac.add(20,20);
        System.out.println(sum);
        clac.sub(10, 2);
        clac.mult(3,2,4);
        clac.div(10, 3);


        int[] numbers = {10,20,30};
        int result = clac.sum(numbers);
    }
}

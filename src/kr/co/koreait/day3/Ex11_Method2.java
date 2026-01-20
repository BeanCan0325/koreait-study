package kr.co.koreait.day3;

public class Ex11_Method2 {
    public static void main(String[] args){
        Ex11_Method2 m = new Ex11_Method2();
        m.exOverloading();
        m.exOverloading(10);

        Ex11_Jogger jogger =new Ex11_Jogger();

        System.out.println(jogger.sayName("냥냥"));
        System.out.println(jogger.run(5));
        jogger.run(120,4);

        }

    public void exOverloading() {
        System.out.println("매개변수를 안받는 메서드 입니다.");
    }

    public void exOverloading(int num) {
        System.out.println("전달받은 매개변수는 " +num+ "입니다.");
    }

    }

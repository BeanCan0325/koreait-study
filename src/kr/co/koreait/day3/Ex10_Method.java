package kr.co.koreait.day3;

public class Ex10_Method {
    public static void main(String[] args) {
        //<메서드>
        //- 특정 기능을 수행하는 코드를 모아둔 집합

        //"안녕하세요 라는 문자열 출력하눈 printHello() 메서드 제작
    Ex10_Method ex10 = new Ex10_Method(); //객체 생성. 인스턴스화
    ex10.printHello();


    Ex10_Jogger jogger = new Ex10_Jogger();
    jogger.run(33);
    jogger.sayName("이소정",10);
    jogger.sayName("김철수",9);
    jogger.sayName("짱구",8);





    }

    public void printHello(){
        System.out.println("📝안녕하세요");
    }
}

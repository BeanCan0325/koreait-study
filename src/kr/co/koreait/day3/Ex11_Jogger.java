package kr.co.koreait.day3;

public class Ex11_Jogger {
    public static void main(String[] args){
        Ex11_Jogger jok = new Ex11_Jogger();
        System.out.println(jok.sayName("햄찌🐹"));
        System.out.println(jok.run(80));
        jok.run(100,30);
    }

    //1.sayName() 메서드 작성 : 매개변수로 이름전달받음. "안녕하세요 제이름은000입니다."라는 문자열 반환
    public String sayName(String name){
        return ("안녕하쇼 내 이름은" +name+" 이다만..");
    }


    //2.속도를 매개변수로 받는 run() 메서드 작성: 매개변수로 속도(speed)를 받음. "시속000/km의 속도로 달립니다."라는 문자열 반환
    public String run(int speed){
        return("🚗시속"+speed+"/km 속도로 달리는중...");
    }


    //3.거리와 시간을 매개변수로 받는 run()메서드 작성: 매개변수로  거리(distance)와 시간(time)을 받음.
    // - 평균속도 계산해서 변수 pace에 저장( 거리/시간)
    // - "거리 000km를 000시간 동안 달렸습니다. 평균속도 : 00km/h" 라는 문자열 반환
    public void run(int distance, int time){
        double pace = (double)distance/time;
        System.out.printf("거리 %f를 %d시간 동안 달렸습니다.", pace,time);
    }


}

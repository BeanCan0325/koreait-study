package kr.co.koreait.day2;
import java.util.*;

public class Training01_Student {
    public static void main(String[] args) {
        //학생관리 프로그으으으램
        /* 입력받음(1.학생추가, 2.학생목록 조회, 0.프로그램종료)
            1. 학생이름 입력받고 ArrayList에추가
            2. ArrayList 에 저장된 모든 학생의 이름 출력
            출력형식: "1. 000학생"
           - 단 사용자가 프로그램 종료 선택할 때 까지 메뉴 반복적으로 제공
         */

        Scanner sc = new Scanner(System.in);
        ArrayList<String> stList = new ArrayList<>();
        boolean isTrue = true;


        while(isTrue){

            System.out.println("=====📝학생관리 프로그램======");
            System.out.println("--1.학생추가--");
            System.out.println("--2.학생목록 조회--");
            System.out.println("--0.프로그램 종료--");
            System.out.println("--3.학생 삭제❌--");
            System.out.print("--입력:");
            int input = sc.nextInt();
            sc.nextLine(); // 이걸로 enter가 왜 빠져나감?

            switch (input){
                case 1:
                    System.out.print("이름:");
                    String name = sc.nextLine(); //문자열 입력받을 때 nextLin();
                    stList.add(name);
                    System.out.println(name +"학생 추가완료!");

                    break;

                case 2:
                    for(int i = 0; i<stList.size(); i++) {
                        System.out.println((i+1)+":"+stList.get(i));
                    }
                    break;

                case 3:
                    boolean removed= false;

                    while(!removed) {
                        System.out.print("삭제할 이름:");
                        String deleteName = sc.nextLine();


                        for (int i = 0; i < stList.size(); i++) {
                            if ((stList.get(i)).equals(deleteName)) {
                                //int
                                // int remove_index = stList.indexOf(deletName) -> 인덱스 반환

                                stList.remove(i);// stList.remove(remove_index) 가능
                                System.out.println("📝삭제완료");
                                removed = true;

                            } else {
                                System.out.println("❌학생이름 없음");
                            }
                        }

                    }
                    break;

                case 0:
                    System.out.println("=====🤖프로그램 종료======");
                    isTrue = false;
                    break;

                default: System.out.println("잘못된 메뉴를 선택하심");
            }

        }

        //.length --> 배열의 길이
        //.size() --> 요소의 개수 ( ArrayList 일단 10칸 만들어지고 하니까)

        //========
    }
}

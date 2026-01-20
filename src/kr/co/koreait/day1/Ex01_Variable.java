package kr.co.koreait.day1;
/*
 [변수]
- 변수 선언 : 자료형 변수이름;
- 변수 초기화 : 변수에 값을 할당하는 과정
- 리터럴(값) : 변수에 넣을 값을 리터럴이라고도 부른다.
 */


public class Ex01_Variable {
    public static void main(String[] args) {
        int varNum= 2;
        String name = "이소정";
        System.out.println(name +" "+ varNum);

// - 명시적 초기화: 변수의 선언과 초기화를 동시에 하는 것.
        int age = 19;

        /* <변수 네이밍 규칙>
        - 대소문자를 구분하며 길이 제한이 없음
        - 예약어 사용불가
        - 숫자로 시작할 수 없음
        - 특수문자는 _ 와 $만사용
        - 자바는 관례적으로 카멜표기법 사용.
         */

        /* <표기법 종류>
        1. 카멜 표기법
          : - 소문자로 시작 이어지는 단어들 대문자.
        2. 파스칼 표기법
          : - 대문자로 시작.      UserName.BoardList
        3. 스네이트 표기법
          : - 이어지는 단어들 사이에 _ 넣는 표기법. 다 소문자
          : user_name_popo   board_list
         */

        /* <자료형>
        - 저장할 데이터의 종류를 미리 정해두는 것
        - 숫자? 문자열?

        1. 논리형 boolean
        2. 문자형 char
        3. 정수형 byte, short, int, long
        4. 실수형 float, double
         */

        boolean isStudent = true;
        char koreanChar ='가';

        byte smallNum = 127;


        //기본형 vs 참조형
        /* 비트(bit) vs 바이트(byte)
           - 비트: 컴퓨터가 표현할 수 있는 최소 단위. 값은 두가지 (0또는 1)
           - 1011 -> 4bit

           - 바이트: 8비트의 묶음( 0또는 1이 8개 있다.)
           - 0   1    1    0   0   1   0   1
            128  64  32   16   8   4   2   1  -> 64+32+4+1 -> 101
            * 2진수의 값이 1인 애들만 더하면 10 진수로 값을 구해짐
               다 0 이면 =0
               다 1 이면 =255
               byte 크기는 1byte, 즉 표현할 수 있는 범위는 0~ 255   00000000 ~ 11111111 (8자리)
               byte가 표현가능한 숫자는 -128 ~127

               - 맨 앞자리가 0이면 양수: 01111111  (양수의 최대)  64+32+16+8+4+2+1 = 127
                 맨 앞자리가 1이면 음수: 10000000  (음수의 최대)  -128  10000001 -> -127

                 네트워크쪽은 이게 딱보면 나와야함.
                 1111111   11111111  ( 2byte일때)
                   512 256   128

              * ⭕ 음수= (비트반전) +1
         */

        long longNumber = 80_000_000_000L;  //L접미사 필수. 숫자를 쓰고 L안적으면 기본적으로 int 타입.
        //int -> 21억

        float floatNum = 3.14F; // F접미사 필수 -> F 안적으면 기본적으로 double 타입.


        // 기본형 vs 참조형
        //Q1. 논리형을 넣을 varFalse 변수선언.
        boolean varFalse;
        //Q2. 위에서 선언한 변수를 false로 초기화
        isStudent = false;
        //Q3. 'Q'를 넣을 변수 varChar를 선언과 동시에 초기화 * 명시적 초기화
        char varChar = 'Q';
        //04 10을 넣을 변수 varNum2를 선언 동시에 초기화
        int varNum2 = 10;
        //Q5. "java"를 넣을 변수 varStr변수를 선언, 초기화 동시에
        String varStr = "java";

    }
}

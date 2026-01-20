package kr.co.koreait.day2;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex08_array {
    public static void main(String[] args) {

        /* 배열 (Array)
        같은 자료형을 가진 변수를 하나로 묶어 관리함.

        <배열선언>
        1. 자료형[] 변수명;  int[] numbers; *권장방식
        2. 자료형 변수명[];  int numbers[];

        3. int[] numbers = new int[크기];   이렇게 하면 각 인덱스에 0 값(int)가 들어감.
        4. int numbers[] = new int[크기];
         */

        int[] intArr = new int[4];
        intArr[0] = 10;
        intArr[1] =20;
        intArr[2] =30;
        intArr[3] =40;

        System.out.println(intArr);
        // 배열은 참조형

        int[] intArr2 = {1, 2, 3, 4,};
        char[] chArr = {'a', 'b', 10};

        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
               num[i] = i+10;
            }


//        for(int i=0; i< num.length;i++) {
//            System.out.println(num[i]);
//        }


        // 배열의 요소를 1개씩 꺼내서 짝수인 것만 sum에 합계 저장 후 출력
        int sum = 0;
        int[] sum2 = new int[10];
        int idx = 0;

        for (int i = 0; i < num.length; i++) {
            if(num[i]%2 == 0){
                sum2[idx] = num[i];
                sum += num[i];
                idx++;
            }
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(sum2));


        //scores 배열 만들고 , 각각의 값은
        //-{60,77,56,89}
        //- 0번 인덱스 (국어점수), [1]영어점수 , [2] 수학점수, [3] 과학점수
        // 반복문 활용해서 평균점수 구하고, 반복문 안에서 모든과목 예시처럼 출력 "국어점수는 00점 입니다." 예시

        int[] scores = {60,77,56,89};
        int sum3 = 0;
        for(int i = 0; i< scores.length; i++){
            sum3 += scores[i];
            switch (i){
                case 0: System.out.printf("국어점수는 %d점 입니다.\n",scores[0]);
                break;
                case 1: System.out.printf("영어점수는 %d점 입니다.\n",scores[1]);
                break;
                case 2: System.out.printf("수학점수는 %d점 입니다.\n",scores[2]);
                break;
                case 3: System.out.printf("과학점수는 %d점 입니다.\n",scores[3]);
                break;
            }

        } System.out.println("평균 점수: "+ sum/(scores.length+1));



        //1. 사용자로부터 숫자 5개 입력 받아서 배열에 넣음
        //2. 반복문을 활용하여 해당 배열에서 짝수의 개수와 홀수의 개수를 구하세요.
        int[] inputNum = new int[5];

        Scanner sc = new Scanner(System.in);

        int evenCount =0;
        int oddCount =0;


//        for(int i=0; i<5; i++) {
//            System.out.print("🤖입력하세요: ");
//            inputNum[i] = sc.nextInt();
//            if(inputNum[i]%2 ==0){
//                evenCount++;
//            }else{
//                oddCount++;
//            }
//        }
        System.out.printf("🏷️짝수개수: %d, 🏷️홀수개수: %d\n",evenCount,oddCount);

        Integer[] inputNum2 = {10,50,30,70,100};
        Arrays.sort(inputNum2);// (!몰랐음)배열을 정렬시켜주는 놈 (기본적으로 오름차순 정렬)
        System.out.println(Arrays.toString(inputNum2));
        Arrays.sort(inputNum2, Comparator.reverseOrder());// (!몰랐음)배열을 내림차순 정렬)

        //@🏷️<배열의 얕은 복사> : 왜 공유하냐가 중요 / 몰랐던 부분
        //-배열의 주소 값만 가져와 참조하느 방식
        //- 하나의 배열 객체를 두 변수가 공유함.

        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] =20;
        arr[2] = 30;


        int[] copyArr = arr;
        copyArr[1] =999;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copyArr)); // copy -> arr[1]를 바꿈

        // 기존에 존재하는애에 주소값만 넣는 것 : 얕은 복사
        // <깊은 복사>
        // 새로운 배열 객체르 생성하면서 기존 배열의 데이터를 복사

        int[]arr2 = {10,20,30};
        int[] copyArr2 = new int[arr2.length];

        for (int i = 0; i < arr2.length; i++) {
            copyArr2[i] =arr2[i];
        }
        //-> 같은거 arraycopy()
        //System.arraycopy( -> 쓰는법 찾아봐야함

        //<2차원배열>
        int[][] arr3 = { {10,20,30}, {70,80,90}};
        //                  arr3[0]   arr3[1]
        //       arr3[0][0] =10 ,


        //<향상된 for문>
        // for< 자료형 변수명(타입 변수) : 배열명> {}
        // for(int i: arr{
        //    println(i) } -> 꺼낼거 없으면 종료. (그니까 꺼내는 기능)



        //----
    }

}

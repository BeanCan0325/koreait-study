package kr.co.koreait;

import java.util.Arrays;
import java.util.Comparator;

public class Ex08_Array {
 public static void main(String[] args) {
	 //배열 : 같은 자료형을 가진 값들을 하나의 변수로 관리함
	 
	 
	 //요소(element)
	 //- 배열에 들어간 각각의 값들을 요소라고 표현
	 
	 //인덱스( Index)
	 // - 배열의 요소에 접근하기 위해 사용되는 번호 ( 0부터 시작) 
	 
	 int arr[] = new int[4];
	 arr[0] = 10;
	 arr[1] = 20;
	 arr[2]= 30;
	 arr[3] = 40;
	 
	 System.out.println("0번 인덱스 조회: "+ arr[0]);
	 System.out.println("0번 인덱스 조회: "+ arr[1]);
	 System.out.println("0번 인덱스 조회: "+ arr[2]);
	 System.out.println("0번 인덱스 조회: "+ arr[3]);
	 
	 int[] num = new int[10];
	 
	 // 배열의 요소에 랜덤 숫자 넣기
	 for(int i =0; i<num.length; i++) {
		 num[i] = (int)(Math.random()*30+1);
	 }
	 System.out.println("============================");
	 
	 // 배열의 요소 1개씩 꺼내서 출력하기
	 for(int i=0; i<num.length; i++) {
		 System.out.println(num[i]);
	 }
	 
	 // 배열의 요소 1개씩 꺼내 짝수인 것만 sum에 저장(합계)
	 
	 int sum = 0;
	 
	 for(int i=0; i<num.length; i++) {
		 
		 if(num[i]%2 == 0) {
			 sum += num[i];
			 System.out.println("저장값: "+ num[i]);
		 }
	 }
	 System.out.println(sum);
	 
	 
	 int[] nums = {3,1,6,2,3,7,9};
	 System.out.println("첫번째 요소:" + nums[0]);
	 System.out.println("마지막 요소:" + nums[nums.length -1]);
	 
	 
	 //nums 배열에서가장 큰 값과 가장 작은 값 구하기
	 int min = nums[0]; // = Integer.MAX_VALUE;  +21억
	 int max = nums[0]; // = Integer.MIN_VALUE;  -21억
	 
	 // 이런것도 있음
	 // Math.max( 숫자 1, 숫자2) => 1 >= 2 : 숫자 1반환/ 아니면 숫자 2반환
	 
	 for(int i = 0; i<nums.length; i++) {
		 
		 if(nums[i] > max) {
			 max = nums[i];
			 //Integer.M;
		 }
		 if(nums[i]< min) {
			 min = nums[i];
		 }
	 }
	 
	 
	 //---------------------------------------------------
	 // Arrays.toString()
	 // - 반복문 없이 배열의 값들을 문자열 형태로 출력해주는 메서드
	 int [] nums2 = {4,2,3,1,7,5};
	 System.out.println(Arrays.toString(nums2));
	 
	 // Arrays.sort()  
	 // - 배열에 있는 요소를 정렬해주는 메서드
	 Arrays.sort(nums2); // 오름차순 정렬 
	 System.out.println(Arrays.toString(nums2));
	 
	 Integer [] nums3 = {4,2,3,1,7,5};
	 Arrays.sort(nums3, Comparator.reverseOrder()); //ctrl +shift +o -> import
	 System.out.println(Arrays.toString(nums3));
	 
	 //Comparator.reverserOrder() -> ,기본형 변수로 사용못함
	 // 동작방식
	 // 1. 음수값이 반환되는 경우 
	 // 2. 자리 돌리고 모든애들이 양수가 나올 때 까지 돌림. 
	 
	 
	 // -------------------------------------------------------------
	 // 1. 얕은 복사
	 //		: 배열의 주소값만 가져와 참조하는 방식
	 //		: 하나의 배열 객체를 두 변수가 함께 공유함
	 //		 	>복사된 배열에서 수정하면 원본 배열도 영향을 받음
	 int[] arrCopy1 = new int[3];
	 int[] shallowCopy = arrCopy1;
	 
	 shallowCopy[1] = 999;
	 System.out.println(Arrays.toString(arrCopy1));
	 System.out.println(Arrays.toString(shallowCopy));
 
	 // 2. 깊은 복사
	 //		: 새로운 배열 객체를 생성하고 기존의 배열 데이터를 복사하는 방식
//	 int[] arrCopy2 = {1,2,3};
//	 int[] deepCopy = new int[arrCopy2.length];
	 
//	 deepCopy[0] = arrCopy2[0];
//	 deepCopy[1] = arrCopy2[1];
//	 deepCopy[2] = arrCopy2[2];
	 
	 // && 깊은복사 활용법 &&
//	 System.arraycopy(arrCopy2, 0, deepCopy, 0, arrCopy2.length);
	 // 위에 주석처리한것과 비슷한 기능.
	 // arraycopy(1,2,3,4,5) 
	 //1: 복사할 원본배열
	 //2: 몇번 인덱스 부터 복사시작?
	 //3: 복사할 대상
	 //4: 0번 인덱스 복사한걸 몇번 인덱스부터 넣을거야
	 //5. 복사 몇개 할거냐 ex) 2-> [0] , [1] 이렇게 복사하고 끝
	 
//	 =======
	 
	 int[] arrCopy2 = {1,2,3};
	 int[] deepCopy = Arrays.copyOf(arrCopy2, arrCopy2.length);
	 // Arrays.copyOf(복사할배열, 복사할 길이)
	 

	 
 }
}

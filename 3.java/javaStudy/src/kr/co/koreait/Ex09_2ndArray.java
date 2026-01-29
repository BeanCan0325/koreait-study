package kr.co.koreait;

import java.util.Arrays;

public class Ex09_2ndArray {
	public static void main(String[] args) {
//		2차원 배열
		int [][] arr = new int[2][3];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 100;
		arr[1][1] = 200;
		arr[1][2] = 300;
		
		int[][] arr2 = {
				{10, 20, 30},
                {100, 200, 300}
		};
		
		System.out.println(Arrays.toString(arr));
		
//    실습: 인벤터리라는 2차원 배열
//		{10,5,8}, {3,7,2}, {6,1,9}
//		물품번호, 위치, 재고
//		물품번호 10:마우스  3:키보드 6:모니터
		
		int[][] inven = {  {10,5,8}, {3,7,2}, {6,1,9} };
	
		for(int i = 0 ; i <inven.length; i++) {
				for(int j = 0; j< inven[i].length; j++ ) {
					
					System.out.println(inven[i][j]);
					
				}
		}
		// 향상된 for문
		
		 int arr1[] = new int[4];
		 arr1[0] = 10;
		 arr1[1] = 20;
		 arr1[2]= 30;
		 arr1[3] = 40;
		 
		 System.out.println("0번 인덱스 조회: "+ arr1[0]);
		 System.out.println("0번 인덱스 조회: "+ arr1[1]);
		 System.out.println("0번 인덱스 조회: "+ arr1[2]);
		 System.out.println("0번 인덱스 조회: "+ arr1[3]);
		 
		 for (int num : arr1) {
			System.out.println(num);
		}
	
	}
}

/**
   Date : 2022.02.17
   Author : yunseob
   Description : 배열(Array) 활용 예제2
   version : 1.0
 */
package Java0217;

import java.util.Scanner;

public class ex02_ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//크기가 5인 배엵을 선언
		//스캐너를 이용해서 5개의 값을 입력
		//입력한 값 중에 가장 큰 값 구하기
		Scanner sc = new Scanner(System.in);
		// int arr[] = {0,0,0,0,0};
		
		int arr[] = new int[5];
				
				int max = 0;
				int min = 0;
		int num;
		
		System.out.println("점수 "+ arr.length + "개를 입력해주세요");
		
		for(int i = 0; i <arr.length ; i++) {
			System.out.println((i+1) + "번째 점수 입력 >>");
			arr[i] = sc.nextInt();
			// 우리가 입력한 숫자가 max보다 크면 입력한 값이 max가 된다.
			if(arr[i]>max) {
				max = arr[i];
				
			
		
			}else if(arr[i]<min) {
				min = arr[i];
				
			} 
			
		}
		System.out.println("입력한 값중 가장 큰 수는 " + max+ "입니다.");
		System.out.println("입력한 값중 가장 작은 수는 " + min+ "입니다.");
		
		//응용 가장 큰 수와 가장 작은 수를 구하시오
	}

}

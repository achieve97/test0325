/**
   Date : 2022.02.16
   Author : yunseob
   Description : 배열 예제
   version : 1.0
 */
package Java0216;

import java.util.Scanner;

public class ex08_arrayEx {

	public static void main(String[] args) {
		// 점수 3개를 입력받아서
		// 입력받은 값의 총점, 평균을 구하세요!
		// hint ) int score[] = new int[3];
		// int score[] = {0,0,0};
		
		int score[] = {1,2,3};
		int sum = 0; 
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i < score.length; i++) {
								// = 3
			System.out.println((i+1)+ "번째 점수 입력 >>");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		double avg = (double)sum/score.length;
		
		System.out.println("입력한 점수의 총점 : " +sum);
		System.out.println("입력한 첨수의 평균 : " +avg);
	}

}

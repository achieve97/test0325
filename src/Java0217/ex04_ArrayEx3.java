/**
   Date : 2022.02.17
   Author : yunseob
   Description : 배열(Array) 
 */
package Java0217;

import java.util.Scanner;

public class ex04_ArrayEx3 {

	public static void main(String[] args) {
		// (1) 배열, while문, switch-case문 이용해서
		// (2) 학생 수를 입력받고
		// (3) 학생 수 만큼 점수를 입력받고
		// (4) 학생 별 점수를 출력하고
		// (5) 점수의 총합과 평균을 출력한다.
		boolean run = true;
		int score[] = null;
		int stuNum = 0;
		
		while(run) {
			
		System.out.println("=======================");
		System.out.println("1.학생수 2.점수입력 3.학생별점수 4.분석 5.종료");
		System.out.println("=======================");
		System.out.print("메뉴선택 >>");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.print("학생 수를 입력하세요!");
			stuNum = sc.nextInt();
			break;
		case 2:
			score = new int[stuNum];
			System.out.print(" " + score.length + "명 점수를 입력해주세요"); 
			
			for(int i = 0; i < score.length; i++) {
				System.out.println((i+1)+ "번 학생 점수 입력 >>");
				score[i] = sc.nextInt();
			}
			
			
			
			
			break;
		case 3:
			for(int i = 0; i < score.length; i++) {
				System.out.println(" " + (i+1)+ "번 학생점수 :" + score[i]);
				
			}
			break;
		case 4:
			// 총점, 평균, 최고점수
			double sum = 0;
			double avg = 0;
			int max = 0;
			//총점
			for(int i = 0; i < score.length; i++) {
				sum += score[i];
				
				if(i==0) {
					max = score[0];
				} if(score[i] > max) {
					max = score[i];
				}
			}
			avg = sum / score.length;
			System.out.println(" ========== 성적표 =========");
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("최고점수 :  " + max);
			
			
			// 누가 받았는지 추가해서 작성
			break;
		case 5:
			run = false;
			System.out.println("프로그램을 종료합니다");
			break;
			default:
				System.out.println("다시 입력해주세요");
				break;
			
		
		
		
		
		
		
		}

	}
	}
}

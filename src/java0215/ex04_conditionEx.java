package java0215;

import java.util.Scanner;

public class ex04_conditionEx {

	public static void main(String[] args) {
		// 중첩if문
		/*
		 if(조건식){
		 	if(조건식){
		 		조건식이 참일 경우 실행;
		 	} else {
		 		조건식이 거짓일 경우 실행;
		 	}
		 } else {
		 	if(조건식){
		 		조건식이 참일 경우 실행;
		 	} else {
		 		조건식이 거짓일 경우 실행;
		 	}
		 }

		 */
		
		// 95점이상 : A+
		// 90점이상 : A
		// ... 
		// 65점이상 : D+
		// 60점이상 : D
		// 60점미만 : F
		
		// 점수를 입력받아서
		// 학점계산 프로그램!
		// score, grade 변수를 사용해서 만들기!
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수입력 >> ");
		int score = sc.nextInt();
		
		String grade;
		if(score<0) {
			System.out.println("입력범위를 초과했습니다.");
		}else if(score <= 100) {
			 if(score>=90) {
				if(score>=95) {
					grade="A+";
				} else {
					grade="A";
				}
			} else if(score>=80) {
				if(score>=85) {
					grade="B+";
				} else {
					grade="B";
				}
			} else if(score>=70) {
				if(score>=75) {
					grade="C+";
				} else {
					grade="C";
				}
			} else if(score>=60) {
				if(score>=65) {
					grade="D+";
				} else {
					grade="D";
				}
			} else {
				grade = "F";
			}
			
			System.out.println("당신의 학점은 " + grade + " 입니다.");
			
		} else {
			System.out.println("입력범위를 초과했습니다.");
		}
		
		
		
		
		
		

	}

}

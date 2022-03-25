/**
   Date : 2022.02.16
   Author : yunseob
   Description : while문을 이용한 예제
   version : 1.0
 */
package Java0216;

import java.util.Scanner;

public class ex04_whileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 0;
		boolean run = true;
		int menu;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("=================================");
			System.out.println("1.예금/t 2.출금 /t3.잔액조회/t4.종료");
			System.out.println("=================================");
			System.out.println("선택 >>");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("예금액 >>");
//				int amount =sc.nextInt();
//				balance = balance + amount;
				balance += sc.nextInt();
				break;
			case 2:
				//Q. 현재 잔액이 출금액보다 적을 경우 잔액이 부족합니다. 메세지
				if(balance < sc.nextInt()) {
					System.out.println("출금 잔액이 부족합니다.");
					
				} else {
					System.out.println("예금액 >>");
					balance -= sc.nextInt();
				}
				
				break;
			case 3:
				System.out.println("잔액조회" + balance);
				
				break;
			case 4:
				run = false;
				break;
			default : 
				System.out.println("다시 입력해주세요.\n");
				break;
			}
		}
	}

}

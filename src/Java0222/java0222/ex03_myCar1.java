/**
   Date : 2022.02.22
   Author : inchoriya
   Description : Car클래스를 이용한 myCar 객체 만들기
   version : 1.3
 */
package Java0222.java0222;

import java.util.Scanner;

public class ex03_myCar1 {

	public static void main(String[] args) {
		// (1) 내 자동차의 특징을 입력 받아서 새로운 객체를 만들고
		// (2) 충전할 연료를 입력 받아서 연료를 충전하고
		// (3) 주행을 시켜보자! 주행 여부를 (Y/N)으로 물어본 후 주행을 시킨다.
		// (4) 프로그램 종료
		
		// while문, switch-case문을 사용해서 만들어보자!
		
		ex01_Car1 myCar = null;
		
		String color, type, model, drive;
		int speed, gas, menu;
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("========================================");
			System.out.println(" [1]차량등록   [2]주유   [3]주행   [4]종료");
			System.out.println("========================================");
			System.out.print("선택 >>");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("차량을 등록합니다!");
				
				System.out.print("색상 선택 >> ");
				color = sc.next();
				
				System.out.print("속도 선택 >> ");
				speed = sc.nextInt();
				
				System.out.print("타입 선택 >> ");
				type = sc.next();
				
				System.out.print("모델 선택 >> ");
				model = sc.next();
				
				myCar = new ex01_Car1(color, speed, type, model);
				System.out.println("차량정보" + myCar);
				
				break;
			case 2:
				System.out.print("충전할 연료량 >> ");
				gas = sc.nextInt();
				
				myCar.setGas(gas);
				break;
			case 3:
				System.out.print("주행하시겠습니까? (Y/N)");
				drive = sc.next();
				
				if(drive.equals("Y")||drive.equals("y")) {
					myCar.drive();
				} else if(drive.equals("N")||drive.equals("n")) {
					System.out.println("주행을 하지 않습니다!");
				} else {
					System.out.println("'Y'나 'N'으로 선택해주세요!");
				}
				
				break;
			case 4:
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			default: 
				System.out.println("다시 입력해주세요!");
				break;
			}
			
			
			
			
		}
		
		
		
		
		

	}

}

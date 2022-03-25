package Java0222;

import java.util.Scanner;

public class ex031_myCar {

		ex01_car myCar = null;
		String color, type, model, drive;
		int speed, gas, menu;
		boolean run true;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("=======================");
			System.out.println("1. 차량등록 2. 주유 3. 주행 4. 종료");
			System.out.println("=======================");
			System.out.println("=======================");
			menu=sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("차량을 등록합니다.");
				
				System.out.println("색상 선택 >> ");
				color = sc.next();
				System.out.println("타입 선택 >> ");
				speed = sc.nextInt();
				System.out.println("모델 선택 >> ");
				type = sc.next();
				System.out.println("속도 선택 >> ");
				model= sc.next();
				
				
				break;
			case 2:
				System.out.println("충전할 연료량 >> ");
				gas = sc.nextInt();
				
				myCar.setGas(gas);
				break;
			case 3:
				System.out.println("주행하시겠습니까? (Y/N)");
				drive = sc.next();
				
				if(drive.equals("Y")||drive.equals("y")) {
					myCar.drive();
					System.out.println("gas가 충분합니다. 달립니다. ( gas 잔량 : " + gas + " 남음 )");
					gas -= gas;
					
					if(gas <= 5) {
						
						System.out.println("연료가 거의 없습니다.");
						
				}else if(drive.equals("N")||drive.equals("n")) {
					
					System.out.println("주행을 하지 않습니다.");
				} else {
					System.out.println("Y 또는 N으로 입력해주세요");
				}
				break;
			case 4:
				
				
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
				default:
					System.out.println("다시 입력해주세요");
					break;
			
			}
		}
		
}
}


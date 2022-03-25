package Java0222;

import java.util.Scanner;

public class ex03_myCar {

	
		// 내 자동차의 특징을 입력 받아서 새로운 객체를 만들고
		// 충전할 연료를 입력 받아서 연료를 충전하고
		// 주행을 시켜보자. 주행여부를 (Y/N)으로 물어본 후 주행을 시킨다.
		// 프로그램 종료
		
		//while문,switch - case문을 사용해서 만들어보자.
		
		String color;
		int speed;
		String type;
		String model;
		
	
			
		
		ex03_myCar(String color, int speed, String type, String model) {
			   this.color = color;
			   this.speed = speed;
			    this.type = type;
			   this.model = model;
			   
			   
			
		   }



		public ex03_myCar() {
			// TODO Auto-generated constructor stub
		}



		@Override
		public String toString() {
			return "ex03_myCar [color=" + color + ", type=" + type + ", model=" + model + ", speed=" + speed + "]";
		
		}
		
		int  gas;
		void setGas(int gas) {
			this.gas = gas;
			System.out.println("");
			System.out.println("현재 gas 잔량 : " + this.gas);
			System.out.println("");
		}
		
		void drive() {
			boolean run = true;
			while(run) {
			System.out.println("주행을 하시겠습니까");
			System.out.println("1. Yes 2. No");
			
			Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
			
			switch(num){
			
			case 1 :
				System.out.println("");
				System.out.println("달립니다. ");
				System.out.println("");
				
				break;
			case 2 : 
			run = false;
			System.out.println("");
			System.out.println("주행을 하지 않습니다.");
			System.out.println("");
				break;	   
				default :
					System.out.println("다시 입력해주세요");
				}
				
			
		}
	
		}
}


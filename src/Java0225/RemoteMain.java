package Java0225;

import java.util.Scanner;

public class RemoteMain {

	public static void main(String[] args) {
		
		// Audio 객체 생성
		Audio audio = new Audio();
		Television tv = new Television();
		Scanner sc = new Scanner(System.in);
		
		int num;
		int num1 = 0;
		boolean run = true;
		
		System.out.println("================= 리모콘 ==================");
		System.out.println("1.오디오 2. TV  3. 스마트TV 4. 종료");
		System.out.print("제품을 선택하세요 >> ");
		System.out.println(" ");
		
		num = sc.nextInt();
		while(run) {
		switch(num) {
		
		case 1:
			
			System.out.println("1.전원 On 2. 전원 OFF  3. 볼륨조절 4.음소거 On/Off 5 ");
			int btn = sc.nextInt();
			
			switch(btn) {
			case 1:
				audio.turnOn();
				break;
			case 2:
				audio.turnOff();
				break;
			case 3:
				System.out.println("볼륨을 입력해주세요(최대 10)");
				num1 = sc.nextInt();
				 audio.setVolume(num1);
				 break;
			case 4:
				System.out.println("음소거 하시겠습니까?");
				System.out.println("1. Yes 2. No");
				int btn2 =sc.nextInt();
				if(btn2==1) {
					audio.setMute(true);
					
				}else { 
					audio.setVolume(num1);
					
				}
				
				break;
			}
			
			
			
			
			
			
			break;
		case 2:
			System.out.println("1.전원 On 2. 전원 OFF  3. 볼륨조절 4.음소거 On/Off 5 ");
			int btn3 = sc.nextInt();
			
			switch(btn3) {
			case 1:
				tv.turnOn();
				break;
			case 2:
				tv.turnOff();
				break;
			case 3:
				System.out.println("볼륨을 입력해주세요(최대 10)");
				num1 = sc.nextInt();
				 audio.setVolume(num1);
				 break;
			case 4:
				System.out.println("음소거 하시겠습니까?");
				System.out.println("1. Yes 2. No");
				int btn2 =sc.nextInt();
				if(btn2==1) {
					audio.setMute(true);
					
				}else { 
					tv.setVolume(num1);
					
				}
				
				break;
			}
			
			
			
			
			
			
			
			break;
		case 3:
			break;
		case 4:
			run = false;
			break;
			
			
			default:
				
				break;
		

	}
	}
	}
}

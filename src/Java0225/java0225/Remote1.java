package Java0225.java0225;

import java.util.Scanner;

public class Remote1 {

	public static void main(String[] args) {

		// 여러분은 리모콘을 제작합니다.
		// 오디오, TV, 스마트TV 중 어떤 제품을 사용할 건지 선택 후
		// 전원on, 전원off
		// 볼륨 조절(볼륨 입력 받기)
		// 음소거(적용, 해제)
		// 스마트TV인 경우 인터넷 검색기능 까지 사용할 수 있는
		// 리모콘을 제작해보세요!

		// 주의 : RemoteInfo 사용하면 안됨!
		Scanner sc = new Scanner(System.in);

		RemoteControl1 remote = null;
		SmartTV1 smart = new SmartTV1();

		boolean run = true;
		boolean power = false;

		System.out.println("RemoteController!");
		System.out.println("-------------------------------------");
		System.out.println(" 1.Audio | 2.Television | 3.SmartTV  ");
		System.out.println("-------------------------------------");
		System.out.print("기기 선택 >> ");
		int machine = sc.nextInt();

		switch (machine){
		case 1:
			remote = new Audio1();
			break;
		case 2:
			remote = new Television1();
			break;
		case 3:
			remote = new SmartTV1();
			break;
		default:
			System.out.println("다시 입력하세요!");
			break;
		}

		if (remote != null) {
			do {
				System.out.println("------------------------------------------------------");
				System.out.println(" 1.전원ON | 2.볼륨조절 | 3.음소거 | 4.인터넷검색 | 5. 전원OFF");
				System.out.println("------------------------------------------------------");
				System.out.print("기능을 선택해 주세요 >> ");
				int menu = sc.nextInt();

				switch (menu) {
				case 1:
					remote.turnOn();
					power = true;
					break;
				case 2:
					if (power) {
						System.out.print("볼륨 입력 >> ");
						int vol = sc.nextInt();
						remote.setVolume(vol);
					} else {
						System.out.println("전원을 먼저 켜주세요!");
					}
					break;
				case 3:
					if (power) {
						System.out.print("음소거 여부 ( Y / N ) >> ");
						String result = sc.next();
						
						if(result.equals("Y")||result.equals("y")) {
							remote.setMute(true);
						} else if(result.equals("N")||result.equals("n")) {
							remote.setMute(false);
						} else {
							System.out.println("Y / N 중 하나를 입력하세요!");
						}
					} else {
						System.out.println("전원을 먼저 켜주세요!");
					}
					break;
				case 4:
					if (power) {
						if(machine!=3) {
							System.out.println("해당기기는 지원하지 않는 기능입니다.");
						} else {
							System.out.print("검색할 사이트 입력 >> ");
							String url = sc.next();
							smart.search(url);
						}
					} else {
						System.out.println("전원을 먼저 켜주세요!");
					}
					break;
				case 5:
					if (power) {
						remote.turnOff();
						run = false;
					} else {
						System.out.println("전원을 먼저 켜주세요!");
					}
					
					break;
				default:
					System.out.println("다시 입력해주세요!");
					break;
				}

			} while (run);
		}

	}

}

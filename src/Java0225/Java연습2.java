package Java0225;

import java.util.Scanner;

import Java0225.java0225.SmartTV1;

public class Java연습2 {
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
	
	RemoteControl remote = null;
	
	System.out.println("================= 리모콘 ==================");
	System.out.println("1.오디오 2. TV  3. 스마트TV");
	System.out.print("제품을 선택하세요 >> ");
	System.out.println(" ");
	int num = sc.nextInt();
	
	switch(num) {
	
	case 1:
		remote = new Audio();
		break;
	case 2:
		remote = new Television();
		break;
	case 3:
		remote = new SmartTV1();
		break;
	}
	
}
}
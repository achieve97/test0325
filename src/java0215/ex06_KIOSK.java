package java0215;

import java.util.Scanner;

public class ex06_KIOSK {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int num;
		int price = 0;
		
		String menu="";
		
		System.out.println();
		System.out.println("맥도날드에 오신것을 환영합니다.");
		while(run) {
		System.out.println(" ");
		System.out.println("주문을 도와드리겠습니다.\n");
		
		System.out.println("================= 메 뉴 ==================");
		System.out.println("1.버거\t2.맥모닝");
		System.out.println("3.사이드메뉴 4.디저트 5.주문취소\n");
		System.out.print("카테고리를 선택하세요 >> ");
		
		num = sc.nextInt();
		
		
		switch(num){
		case 1: 
			System.out.println(" ");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("================= 메 뉴 ==================");
			System.out.println("1.빅맥\t2.불고기버거 3. 치즈버거 4. 1955버거");
			int btn = sc.nextInt();
		switch(btn) {
		case 1: menu = "빅맥";
		price = 4000;
		break;
		case 2: menu = "불고기버거";
		price = 2500;
		break;
		case 3: menu = "치즈버거";
		price = 3000;
		break;
		case 4: menu = "1955버거";
		price = 5000;
		break;
		}
		
			break;
			
		case 2:
			System.out.println(" ");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("================= 메 뉴 ==================");
			System.out.println("1.베이컨 맥머핀 2.에그 맥머핀 3. 스낵랩 4. 핫케익");
			
			int btn1 = sc.nextInt();
			switch(btn1) {
			case 1: menu = "베이컨맥머핀";
			price = 1500;
			break;
			case 2: menu = "에그맥머핀";
			price = 1000;
			break;
			case 3: menu = "스낵랩";
			price = 2000;
			break;
			case 4: menu = "핫케익";
			price = 2500;
			break;
			}
			break;
		case 3:
			System.out.println(" ");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("================= 메 뉴 ==================");
			System.out.println("1.맥너겟 2.치즈스틱 3. 감자튀김 4. 해쉬브라운");
			
			int btn2 = sc.nextInt();
			switch(btn2) {
			case 1: menu = "맥너겟";
			price = 1500;
			break;
			case 2: menu = "치즈스틱";
			price = 2000;
			break;
			case 3: menu = "감자튀김";
			price = 2000;
			break;
			case 4: menu = "해쉬브라운";
			price = 2500;
			break;
			}
			break;
		case 4:
			System.out.println(" ");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("================= 메 뉴 ==================");
		
			System.out.println("1.자두 칠러 2.딸기 칠러 3. 주스 4. 콜라");
			
			int btn3 = sc.nextInt();
			switch(btn3) {
			case 1: menu = "자두 칠러";
			price = 1500;
			break;
			case 2: menu = "딸기 칠러";
			price = 1000;
			break;
			case 3: menu = "";
			price = 1500;
			break;
			case 4: menu = "핫케익";
			price = 1200;
			break;
			}
			break;
		case 5:
			run = false;
			System.out.println("주문을 취소합니다.");
			break;
		default:
			System.out.println("해당하는 메뉴는 없습니다.");
			break;
		}
		if(num==1) {
			System.out.println("해당 메뉴를 세트로 변경하시겠습니까?");
			System.out.println("1. Yes 2. No");
			int btn4 = sc.nextInt();
			switch(btn4) {
			case 1 : 
				System.out.println("세트 변경 시 1500원 추가됩니다.");
				System.out.print("\n주문하신 메뉴는 " + menu + "세트");
				System.out.println(", 가격은 " + (price + 1500)+ "원 입니다.");
				break;
			case 2 : 
				System.out.println("단품으로 주문합니다.");
				System.out.print("\n주문하신 메뉴는 " + menu);
				System.out.println(", 가격은 " + price + "원 입니다.");
				break;
			}
		}
		if(num>=2 && num<=4) {
			System.out.print("\n주문하신 메뉴는 " + menu);
			System.out.println(", 가격은 " + price + "원 입니다.");
		} 
		
		System.out.println("이용해 주셔서 감사합니다.");
		
	}

}
}










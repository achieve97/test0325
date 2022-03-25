package Java0217;

import java.util.Scanner;

public class yunseob {


	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int num;
		int price = 0;
		int a = 0;
	
		String menu="";
		
		System.out.println();
		System.out.println("맥도날드에 오신것을 환영합니다.");
		while(run) {
		System.out.println(" ");
		System.out.println(" 주문을 도와드리겠습니다! \n");
		
		System.out.println("================= 메 뉴 ==================");
		System.out.println("1.버거\t2.맥모닝");
		System.out.println("3.사이드메뉴 4.디저트 5.종료\n");
		System.out.print("카테고리를 선택해주세요 : ");
		System.out.println(" ");
		
		num = sc.nextInt();
		
		
		switch(num){
		case 1: 
			System.out.println("================= 버거메뉴 ==================");
			System.out.println("1.빅맥\t2.불고기버거 3. 치즈버거 4. 1955버거");
			System.out.println(" ");
			System.out.print("메뉴를 선택해주세요 : ");
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
		
		if(btn>=1 && btn<=4){
			System.out.println(" ");
			System.out.print("수량을 입력해주세요 : ");
			a = sc.nextInt();
		}
			break;
			
			
			
		case 2:
			
			System.out.println("================= 맥모닝메뉴 ==================");
			System.out.println("1.베이컨 맥머핀 2.에그 맥머핀 3. 스낵랩 4. 핫케익");
			System.out.println(" ");
			System.out.print("메뉴를 선택해주세요 : ");
			
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
			if(btn1>=1 && btn1<=4){
				System.out.println(" ");
				System.out.print("수량을 선택해주세요 : ");
				a = sc.nextInt();
			}
			
			break;
		case 3:
			
			System.out.println("================= 사이드메뉴 ==================");
			System.out.println("1.맥너겟 2.치즈스틱 3. 감자튀김 4. 해쉬브라운");
			System.out.println(" ");
			System.out.print("메뉴를 선택해주세요 : ");
			
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
			if(btn2>=1 && btn2<=4){
				System.out.println(" ");
				System.out.print("수량을 선택해주세요 : ");
				a = sc.nextInt();
			}
			break;
		case 4:
			
			System.out.println("================= 디저트메뉴 ==================");
			System.out.println("1.자두 칠러 2.딸기 칠러 3. 주스 4. 콜라");
			System.out.println(" ");
			System.out.println("메뉴를 선택해주세요 : ");
			
			int btn3 = sc.nextInt();
			switch(btn3) {
			case 1: menu = "자두 칠러";
			price = 1500;
			break;
			case 2: menu = "딸기 칠러";
			price = 1000;
			break;
			case 3: menu = "주스";
			price = 1500;
			break;
			case 4: menu = "핫케익";
			price = 1200;
			break;
			}
			if(btn3>=1 && btn3<=4){
				System.out.println(" ");
				System.out.print("수량을 선택해주세요 : ");
				a = sc.nextInt();
			}
			
			break;
		case 5:
			run = false;
			System.out.println("이용해주셔서 감사합니다.");
			break;
			
			
		default:
			System.out.println("해당하는 메뉴는 없습니다.");
			break;
		}
		if(num==1) {
			System.out.println(" ");
			System.out.println("해당 메뉴를 세트로 변경하시겠습니까?");
			
			System.out.println("1. Yes 2. No");
			int btn4 = sc.nextInt();
			switch(btn4) {
			case 1 : 
				System.out.println("세트 변경 시 1500원 추가됩니다.");
				System.out.print("\n주문하신 메뉴는 " + menu + " 세트 " + a + "개");
				System.out.println(", 가격은 " + (((1500*a) + (a*price)))+ "원 입니다.");
				break;
			case 2 : 
				System.out.println("단품으로 주문합니다.");
				System.out.print("\n주문하신 메뉴는 " + menu +" 단품 "+ a +"개");
				System.out.println(", 가격은 " + (price * a) + "원 입니다.");
				break;


					
					
			}
		} else if(num>=2 && num<=4) {
		    
			System.out.print("\n주문하신 메뉴는 " + menu + " " + a + "개");
			System.out.println(", 가격은 " + (price * a) + "원 입니다.");
		} else if(num<5){
			System.out.println(" ");
			System.out.println("해당하는 메뉴는 없습니다. 다시 선택해주세요");
		}
		
		
		
	}

}
}


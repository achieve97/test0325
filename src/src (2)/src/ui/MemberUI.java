package ui;

import java.util.Scanner;

import action.Action;
import action.MemberListAction;
import action.MemberRegistAction;
import contorller.MemberController;
import dto.Member;

public class MemberUI {

	public static Member memberArray[] = new Member[0];
	
	
	// 3. 메소드
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int menu = 0;
		MemberController controller = new MemberController();
		
		do {
			Action action = null;
			System.out.println("-------------------------------------------");
			System.out.println(" 1.회원가입       2.회원목록보기    3.회원정보수정");
			System.out.println(" 4.회원정보삭제    5.회원목록검색    6.프로그램종료");
			System.out.println("-------------------------------------------");
			System.out.print("메뉴 선택 >> ");
			menu = sc.nextInt();
			// DB -> CRUD : 저장하고C, 불러오고R, 수정하고U, 삭제하기D
			switch(menu) {
			case 1:
				// 회원가입 : C(Create)
				action = new MemberRegistAction();
				break;
			case 2:
				// 회원목록 : R(Read)
				action = new MemberListAction();
				break;
			case 3:
				// 회원수정 : U(Update)
				break;
			case 4:
				// 회원삭제 : D(Delete)
				break;
			case 5:
				// 회원검색 : R(Read)
				break;
			case 6:
				run = false;	// do-while문 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			default : 
				System.out.println("다시 입력해 주세요!");
				break;
			}
			
			if(action != null) {
				controller.processRequest(sc, action);
			}
			
		} while(run);

	}

}











package JDBC;

import java.util.Scanner;

public class jdbcMain {

	@SuppressWarnings("static-access")
	public static void main(String[] args)  {
//		DBCnnection conn = new DBCnnection();
//		conn.DBconnect();
//		
		
		CRUD crud = new CRUD();
		
		crud.delete();
		

		//CRUD crud1 = new CRUD();
		//crud.insert();
		//crud.select();
	
		
		
		
		
		
		
		System.out.println("==========================");
		System.out.println("     네이버 회원가입 페이지    ");
		
		System.out.println();
		
		boolean run = true;
		
		while(run) {
			System.out.println("==========================");
			System.out.println("1. 가입  2.조회  3.수정  4.삭제");
			System.out.println("선택 >> ");
			
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				crud.insert();
				break;
			case 2:
				crud.select();
				break;
			case 3:
				crud.update();
				break;
			case 4:
				crud.delete();
				break;
			case 5:
				run = false;
				break;
				default:
					System.out.println("값을 다시 입력해주세요");
					break;
			}
		}
		
	}

}
		
		
		
		
		
	


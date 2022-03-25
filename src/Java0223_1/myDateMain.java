package Java0223_1;

import java.util.Scanner;

public class myDateMain {

	public static void main(String[] args) {
		myDate date = new myDate();
		// year,month, day
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력 >>");
		int year = sc.nextInt();
		
		System.out.println("월 입력 >>");
		int month = sc.nextInt();
		
		System.out.println("일 입력 >>");
		int day = sc.nextInt();
		
		date.setYear(year);
		date.setMonth(month);
		date.setDay(day);
		
		System.out.println("입력한 날짜 확인!");
		System.out.println(date.toString());
		
		System.out.println(year + "년" + month + "월" + day + "일" );
		
		

		

	}

}

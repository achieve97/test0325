package java0215;

import java.util.Scanner;

public class ex05_switch {

	public static void main(String[] args) {
		/*
		  [Switch문-Case문 기본문법]
		  
		  switch(조건변수){
		  
		  case 변수값1 : 
		  	해당 조건이 맞을 경우 실행;
		  	break;
		  case 변수값2 : 
		  	해당 조건이 맞을 경우 실행;
		  	break;
		  case 변수값n : 
		  	해당 조건이 맞을 경우 실행;
		  	break;
		  default : 
		  	case에서 해당하는 조건이 없을 경우(else);
		  	break;
		  }
		  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 >> ");
		int sNum = sc.nextInt();
		
		switch(sNum) {
		
		case 1 : case 3 : case 5 : case 7 : case 9 :
			System.out.println("홀수를 입력!");
			break;
			
		case 2 :
		case 4 :
		case 6 :
		case 8 :
		case 10 :
			System.out.println("짝수를 입력!");
			break;

		default :
			System.out.println("그 외에 숫자를 입력했습니다.");
			break;
		}
		
		
		// 월별 날짜 계산기
		// 월을 입력받아서 해당 월에 대한 날짜 계산하기 ex) 1월 => 31일, 2월 => 28일..
		System.out.print("월을 입력해주세요 >> ");
		int month = sc.nextInt();
		int day = 0;
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;	
			break;
		default:
			
			System.out.println("월을 잘못 입력했습니다.");
			break;
		}
		
		if(month>0 && month<=12) {
			System.out.println(month + "월은 " + day + "일까지 있습니다.");
		}
		
		

	}

}

package java0215;

import java.util.Scanner;

public class ex09_forEx {

	public static void main(String[] args) {
		// Q. 두개의 정수(시작, 끝)을 입력받아서 
		// 두 수 사이의 숫자의 총합을 구하는 프로그램을 만들어 보시오.
		
		// ex) 3, 5를 입력시 => 3+4+5
		// ex) 2, 9를 입력시 => 2+3+4+5+6+7+8+9
		// sNum, lNum, sum 변수 사용
		
		Scanner sc = new Scanner(System.in);
		
		int sNum;
		int INum;
		int sum = 0;
		System.out.println("첫번째 수를 입력하세요.");
		sNum = sc.nextInt();
		System.out.println("두번째 수를 입력하세요.");
		INum = sc.nextInt();
		
		for(int i = sNum; i <= INum; i++) {
			sum += i;
			//sum = sum + i;
			//계산된 sum값 = 이전 sum값 + i
			if(i < INum) {
				System.out.print( i + " + ");
				
			}else { 
				System.out.println(i + " = " + sum );
				
			}
		}
		
	}

}

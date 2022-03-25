package Java0222.java0222;

import java.util.Scanner;

public class ex05_CalculatorMain1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// [Ctrl] + [Shift] + [m] => 커서를 클릭 후 단축키를 누르면 자동 import
		
		// 두개 숫자를 입력 받아서 계산
		System.out.print("숫자1 >> ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 >> ");
		int num2 = sc.nextInt();
		
		// calculator 객체 생성
		ex04_Calculator1 cal = new ex04_Calculator1();
		
		cal.excute(num1, num2);
	}

}







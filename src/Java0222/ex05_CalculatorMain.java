package Java0222;

import java.util.Scanner;

public class ex05_CalculatorMain {

	public static void main(String[] args) {
		// 두개 숫자를 입력 받아서 계산
		
		Scanner sc = new Scanner(System.in);
		// [Ctrl] + [Shift] + [m]
		
		System.out.println("숫자1 >> ");
		int num1 = sc.nextInt();
				System.out.println("숫자2 >> ");
		int num2 = sc.nextInt();
		
		// Calculator 객체 생성
		ex04_Calculator cal = new ex04_Calculator();
		
		System.out.println(num1+ "+" + num2 + " = " +cal.add(num1, num2));
		System.out.println(num1+ "와" + num2 + "의 평균 " + cal.avg(num1, num2));
		

	}

}

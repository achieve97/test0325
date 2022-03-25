package Java0223;

import java.util.Scanner;

public class ex02_FactMain {

	public static void main(String[] args) {
		// 숫자를 입력 받아서
		// getFactorial() 함수를 호출
		
		Scanner sc = new Scanner(System.in);
		
		ex01_Factorial factorial = new ex01_Factorial();
		// 한개 import 하는 방법 : [Ctrl] + [Shift] + [m]
		// 모두 import 하는 방법 : [Ctrl] + [Shift] + [0]
		
		System.out.println("숫자 입력 >>");
		int num = sc.nextInt();
		
		int result = factorial.getFactorial(num);
		System.out.println(num + "! 의 결과 : " + result);
		
		int result1 = factorial.getPower(num);
		System.out.println(num + "power 의 결과 : " + result1);
		

	}

}

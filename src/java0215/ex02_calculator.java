package java0215;

import java.util.Scanner;

public class ex02_calculator {

	public static void main(String[] args) {
		// num1, num2, result 변수를 선언해서
		// 두개의 숫자를 입력받고
		// 두수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지를 출력하시오.

		
		Scanner sc = new Scanner(System.in);
		int num1, num2, result;
		
		System.out.print("첫번째 숫자 입력 >> ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 입력 >> ");
		num2 = sc.nextInt();
		
		result = num1 + num2;
		System.out.println("덧셈결과 : " + result);
		
		result = num1 - num2;
		System.out.println("뺄셈결과 : " + result);
		
		result = num1 * num2;
		System.out.println("곱셈결과 : " + result);
		
		result = num1 / num2;
		System.out.println("나눗셈결과 : " + result);
		
		result = num1 % num2;
		System.out.println( "나머지결과 : " + result);
	}

}

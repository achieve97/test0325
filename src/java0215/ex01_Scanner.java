/**
   Date : 2022.02.15
   Author : inchoriya
   Description : 입력 Scanner
   version : 1.0
 */
package java0215;

import java.util.Scanner;

public class ex01_Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("print");
		System.out.println("println");
		System.out.println("print와 println의 차이점!");
		
		// ln : 줄바꿈
		
		System.out.print("이름 입력 >> ");
		String name = sc.next();	//  문자를 입력받을 때

		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();		//  숫자를 입력받을 때
		
		sc.nextLine().trim();		// 앞뒤 공백을 제거한다.
		System.out.print("주소 입력 >> ");
		String addr = sc.nextLine();	//  한 문장을 입력받을 때
		
		// 주소를 입력 받아서 출력하기!
		System.out.println();
		System.out.println("====== 출력 내용 ======");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);

	}

}

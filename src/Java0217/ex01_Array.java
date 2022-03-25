/**
   Date : 2022.02.17
   Author : yunseob
   Description : 배열(Array) 활용
   version : 1.0
 */
package Java0217;

import java.util.Scanner;

public class ex01_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num [] = {8,2,6,1,9,3,4,10,7,5};
		int idx = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 10사이의 숫자를 입력해주세요");
		
		int value = sc.nextInt();
		
			for(int i = 0; i<num.length; i++) {
				// 우리가 입력한 값 value
				//num[0] ~ num[9] 까지 비교
				if(value==num[i]) {
					idx = i;
					System.out.println("입력한 값 " + value + "는 index "+ i +"번에 있습니다.");
				} 
			}
		
		
	}

}

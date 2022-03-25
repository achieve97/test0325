package Java0223;

public class ex01_Factorial {
	
	/*  문제 : 40 - 32 / 2
	 * 
	 * 
	 * 
	 * 
	 * 
	 *  [3] 메소드
	 *   (1) int getFactorial(int num)
	 *   : 매개변수로 전송된 숫자의 팩토리얼 값을 구해서 리턴함
	 *    : ex) int num = 5인 경우 5*4*3*2*1
	 *    
	 *    (2) int gerPower(int num)
	 *     : 매개변수로 전송된 값 까지의 제곱을 구하여라
	 *     : ex) int num = 3인 경우 (1*1) + (2*2) + (3*3)
	 * */

		int fact;
		int num;
		
		int getFactorial(int num) {
			int fact = 1;
			System.out.println("num : " + num);
			System.out.println();
			
			for(int i=num; i>0; i--) {
				fact *= i; // fact = fact * i;
				
				System.out.println("i : " + i);
				System.out.println("fact : " + fact);
				System.out.println();
			}
			return fact;
		}
		
		int power;
		
		
		int getPower(int num) {
			int power = 0;
			
			for(int i=1; i<num; i++) {
				power += i*i;
				
				System.out.println("i*i : " + (i*i));
				System.out.println("power : " + power);
				System.out.println();
					
			}
			return power;
			
		}
}

/**
   Date : 2022.02.16
   Author : yunseob
   Description : loopwhile
   version : 1.0
 */
package Java0216;

public class ex03_loopwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*while문 : 반복횟수를 정하지 않고 사용할 때 
		 * 
		 * 초기화식
		 * while(반복조건){
		 * 
		 * 실행문;
		 * (증감식);
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * */
		System.out.println("for문을 이용한 반복문");
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("\nwhile문을 이용한 반복문");
		int j = 1;
		while(j<=10) {
			System.out.println(j);
			// 증감식
			j++;
		}
		
		boolean run = true;
		
		while(run) {
			
			int dice = (int)(Math.random() * 6) +1;
			
			if(dice==5) {
				run = false;
			}
			System.out.println("주사위 값 : " + dice);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

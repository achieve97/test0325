/**
   Date : 2022.02.16
   Author : yunseob
   Description : 중첩for문
   version : 1.0
 */
package Java0216;

public class ex01_forEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 중첩for문 : for문 안에 for문
		 * 기존 for문에서 실행문 대신 또 다른 for문을 실행
		 * 
		 * 내부 for문이 먼저 시작되고, 외부for문이 나중에 시작된다.
		 * 
		 * -continue문 : 반복문과 함께 사용, 반복문에서 continue문을 만나면
		 * 이후 내용을 실행하지 않고 증감식으로 이동한다.
		 * 
		 * -break문 : 반복문과 함께 사용, break문이 실행되면 반복문을 종료한다.
		 * */
		
		
		//2단 ~ 9단까지
		
		
			
			for(int i = 2; i<=9; i++) {
				System.out.println("===== " + i + " 단======");
				
				for( int j = 1; j<=9; j++) {
				
				System.out.println(i + "X" + j + " = " + (i*j));
			}
				
				System.out.println();
		}
		
	}

}

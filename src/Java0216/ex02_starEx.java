/**
   Date : 2022.02.16
   Author : yunseob
   Description : starEx
   version : 1.0
 */
package Java0216;

public class ex02_starEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for(int i=1; i <= 4; i++) {
		
			for(int j=1; j<=4-i; j++) {
			
				System.out.print(" ");
			}
		for(int k = 1; k <=i; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		} 
		
//		
//		for(int i=1; i<=5; i++) {
//			for(int j = 1; j<=5-i; j++) {
//				System.out.print("*");
//			}
//			for(int k=1; k<=i; k++) {
//				System.out.print(" ");
//				
//			}
//			System.out.println();
//		}
	}

}

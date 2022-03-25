package java0215;

public class ex03_condition {

	public static void main(String[] args) {
		/*
		 	[if문의 기본구조]
		 	
		 	if(조건식){
		 		조건식이 참일 경우 실행;
		 	} else {
		 		조건식이 거짓일 경우 실행;
		 	}
		 
		 */
		
		boolean condition = false;
		
		if(condition) {
			System.out.println("조건 만족!");
			System.out.println("condition : " + condition);
		} else {
			System.out.println("조건 불만족!");
			System.out.println("condition : " + condition);
		}
		
		int num1 = 5, num2 = 5;
		
		if(num1 > num2) {
			System.out.println("num1이 num2보다 크다");
		} else if(num1 < num2){
			System.out.println("num1이 num2보다 작다");
		} else {
			System.out.println("num1은 num2와 같다");
		}
		/*
		 [else if문 기본구조]
		 
		 if(조건식1){
		 	조건식1이 참일 경우 실행
		 } else if(조건식2){
		 	조건식2가 참일 경우 실행
		 } else {
		 	주어진 모든 조건식이 거짓일 경우 실행
		 }
		  
		 */
		
		
		

	}

}

/**
   Date : 2022.02.25
   Author : inchoriya
   Description : final의 정의
   version : 1.0
 */
package Java0225.java0225;

public class Final1 {
	
	/*
	  	final : 마지막이라는 의미, 더이상 수정할 수 없다!
	  	
	  	final 변수 : '상수 : 변하지 않는 수'를 의미 ex) PI = 3.14
	  	final 메소드 : final 메소드는 자식클래스에서 재정의 할 수 없다.
	  	final 클래스 : final 클래스는 상속할 수 없다.
	  	
	  	ex) JavaScript에서 변수를 선언할 때 let, const 사용
	  		그중 const가 Java에서 final에 해당한다.
	 */
	
	int num = 10;
	final int NUM = 100;
	
	// 메소드 
	public static void main(String[] args) {
		
		Final1 cons = new Final1();
		cons.num = 50;
	   cons.NUM = 200;
		// NUM은 final로 지정했기 때문에 값을 바꿀 수 없다.
		
		System.out.println("num : " + cons.num);
		System.out.println("NUM : " + cons.NUM);
	}
	
	

}

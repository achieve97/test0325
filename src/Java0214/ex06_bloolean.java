
/**
* Date : 2022. 02. 14
 * Author : yunseob
 * Description : Boolean 논리형 데이터 타입
 * Version : 1.0
 */package Java0214;

public class ex06_bloolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		boolean result;
		
		int num1 = 5, num2 = 3; 
		
		result = num1 > num2;
		
		System.out.println(result);
		
		result = num1 < num2;
		System.out.println("num1 < num2 : " + result);
		
		if(num1>num2) {
			result = true;
		} else {
			result = false;
		}
		
	}

}

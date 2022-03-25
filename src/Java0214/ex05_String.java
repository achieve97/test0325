/**
* Date : 2022. 02. 14
 * Author : yunseob
 * Description : String
 * Version : 1.0
 */
package Java0214;

public class ex05_String {
	public static void main(String[] args) {
		
		String str1 = "자바공부는 ";
		String str2 = "재미있어";
		String str3 = "너무 어려워";
		
		
		String result;
		
		result = str1 + str2;
		System.out.println(result); // 자바공부는 재미있어
		
		System.out.println(str1 + "너무 " + str2);
		
		String str4 = "Java";
		int num1 = 11;
		
		result = str4 + num1;
		System.out.println(result);
	}
	

}

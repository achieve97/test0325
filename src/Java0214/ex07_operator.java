/**
* Date : 2022. 02. 14
 * Author : yunseob
 * Description : operator
 *  * Version : 1.0
 */
package Java0214;

public class ex07_operator {
	public static void main(String[]args) {
		
		int num = 10;
		System.out.println("++num : " + ++num);
		System.out.println("num++ : " + num++);
		
		int age = 35;
		int age1 = 25;
		
		
		int numb1 = 20;
		int numb2 = 30;
		
		char resultChar;
		int resultInt;
		String resultStr;
		
		resultChar = numb1 > numb2 ? 'O' : 'X';
		
		resultInt = numb1 > numb2 ? 1 : 0 ;
		
		resultStr = numb1 > numb2 ? "참일경우" : "거짓일경우";
		
		System.out.println("resultChar : " + resultChar);
		System.out.println("resultInt : " + resultInt);
		System.out.println("resultStr : " + resultStr);
	}

}

/**
* Date : 2022. 02. 14
 * Author : yunseob
 * Description : 정수형 실수형 기본타입
 * Version : 1.0
 * 
 */package Java0214;

public class ex03_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		byte bNum1 = -128;
		byte bNum2 = 127;
		
		
		short sNum1 = -32768;
		short sNum2 = 32767;
		
		
		int iNum1 = -2147483648;
		int iNum2 = -2147483647;
		
		long lNum1 = -2147483649L;
		long lNum2 = -2147483648L;
		
		System.out.println("lNum : " + lNum1);
		System.out.println("lNum : " + lNum2);
		
		float fNum = 123.456f;
		double dNum = 123.456;
	}

}

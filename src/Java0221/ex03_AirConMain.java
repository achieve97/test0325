/**
   Date : 2022.02.21
   Author : yunseob
   Description : AirConMain
   version : 1.0
 */
package Java0221;

import java.util.Scanner;

import java0215.ex09_forEx;
// import java0221.ex02_Aircon;
// import 패키지명.클래스명;
public class ex03_AirConMain {

	public static void main(String[] args) {
		
		// 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// AirCon 객체 생성
		ex02_AirCon AirCon = new ex02_AirCon();
		
		// 다른 패키지의 클래스도 사용가능!
		ex09_forEx forEx = new ex09_forEx();
		// 객체에 대한 필드값 초기화
		// 객체 멤버(필드)에 접근하는 방법 : .(도트)연산자 사용
		
		AirCon.color = "white";
		AirCon.temp = 20;
		AirCon.price = 160;
		
		System.out.println("AirCon객체의 색상 : " + AirCon.color  );
		System.out.println("AirCon객체의 온도 : " + AirCon.temp  );
		System.out.println("AirCon객체의 가격 : " + AirCon.price  );  
		
		//객체의 메소드 호출
		// 객체의 멤버(메소드)에 접근하는 방법 : .(도트)연산자 사용
		System.out.println();
		System.out.println("============= 메소드 ===============");
		AirCon.onPower();
		AirCon.checkTemp();
		int temp21 = AirCon.upTemp(); // 온도를 1 올리기도 하지만 값 자체(숫자)가 될 수 있다.
		AirCon.checkTemp();
		AirCon.downTemp();
		AirCon.checkTemp();
		AirCon.offPower();
		System.out.println("현재온도는 " + temp21 + " 도 입니다.");
		
		
	}

}

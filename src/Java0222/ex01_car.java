/**
   Date : 2022.02.22
   Author : yunseob
   Description : 자바 클래스
   version : 1.0
 */
package Java0222;

public class ex01_car {

	// (1) 필드
	// 색상(color), 최고속도(speed), 연료타입(type), 모델명(model)
	
	String color;
	String type;
	String model;
	int speed;
	
	// (2) 생성자
	// 기본 생성자
   ex01_car(){
		
	}
	// 매개변수 : color, speed
   ex01_car(String color, int speed) {
	   this.color = color;
	   this.speed = speed;
   }
	// 매개변수 : color, type
   ex01_car(String color, String type) {
	   this.color = color;
	   this.type = type;
   }
   
	// 매개변수 : color, speed, type, model
   ex01_car(String color, int speed,String type, String model) {
	   this.color = color;
	   this.speed = speed;
	    this.type = type;
	   this.model = model;
	
   }
   
   int gas;
	// (3) 메소드
@Override
public String toString() {
	return "ex01_car [color=" + color + ", type=" + type + ", model=" + model + ", speed=" + speed + "]";
}
	// 연료충전 메소드
	void setGas(int gas) {
		this.gas = gas;
		System.out.println("현재 gas 잔량 : " + this.gas);
		
	}
	boolean isLeftGas() {
		if(gas <=0) {
			System.out.println("gas가 없습니다.");
			return false;
		}else {
			System.out.println("gas가 충분합니다.");
			return true;
		}
		
	}
	// 주행메소드
	void drive() {
		while(isLeftGas()) {
			
				System.out.println("달립니다. (gas 잔량 : " + gas + " ) ");
				gas -=1;      //gas가 1씩 줄어든다.
			}
			
		
	}
   
}



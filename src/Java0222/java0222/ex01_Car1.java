package Java0222.java0222;

public class ex01_Car1 {

	// (1) 필드
	// 색상(color), 최고속도(speed), 연료타입(type), 모델명(model)
	
	String color;
	int speed;
	String type;
	String model;
	
	// 필드추가
	int gas;
	
	// (2) 생성자
	
	// 기본생성자
	ex01_Car1() {ㅇ
		
	}
	
	// 매개변수 : color, speed
	ex01_Car1(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	// 매개변수 : color, type
	ex01_Car1(String color, String type) {
		this.color = color;
		this.type = type;
	}
	
	// 매개변수 : color, speed, type, model
	ex01_Car1(String color, int speed,String type, String model) {
		this.color = color;
		this.speed = speed;
		this.type = type;
		this.model = model;
	}

	
	
	// (3) 메소드
	
	// toString() 메소드
	@Override
	public String toString() {
		return "[color=" + color + ", speed=" + speed + ", type=" + type + ", model=" + model + "]";
	}
	
	// 연료충전 메소드
	void setGas(int gas) {
		
		this.gas += gas;
		System.out.println("현재 gas 잔량 : " + this.gas);
	}
	
	// 연료확인 메소드
	boolean isLeftGas() {
		
		if(gas<=0) {
			System.out.println("gas가 없습니다. 주행을 멈춥니다!");
			return false;
		} else if(gas<=5){
			System.out.print("gas가 부족합니다.");
			return true;
		} else {
			System.out.print("gas가 충분합니다.");
			return true;
		}
		
	}
	
	boolean run = true;
	
	// 주행메소드
	void drive() {
		
		if(isLeftGas()) {
			gas -= 1;	// gas가 1씩 줄어든다.
			System.out.println(" 달립니다.( gas 잔량 : " + gas + " )");
		}
		
		
	}
	
	
	
	
	
	
	
}

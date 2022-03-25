package Java0222.java0222;

public class ex02_CarMain1 {

	public static void main(String[] args) {
		// 자동차 객체 생성 4개!
		// color = white, speed = 180, 연료타입 = Gasoline , Model = Santafe

		// 기본생성자 car1
		ex01_Car1 car1 = new ex01_Car1();
		car1.color = "white";
		car1.speed = 180;
		car1.type = "Gasoline";
		car1.model = "Santafe";

		// 매개변수생성자 car2 : color, speed
		ex01_Car1 car2 = new ex01_Car1("white", 180);
		car2.type = "Gasoline";
		car2.model = "Santafe";

		// 매개변수생성자 car3 : color, type
		ex01_Car1 car3 = new ex01_Car1("white", "Gasoline");
		car3.speed = 180;
		car3.model = "Santefe";

		// 매개변수생성자 car4 : color, speed, type, model
		ex01_Car1 myCar = new ex01_Car1("white", 180, "Gasoline", "Santefe");
		
//		System.out.println("car1 : " + car1);
//		System.out.println("car2 : " + car2);
//		System.out.println("car3 : " + car3);
		System.out.println("myCar : " + myCar);
		
		// myCar객체 => 클래스에서 필드를 수정 또는 추가 
		// 내가 꿈꾸는 차를 만들어보기!
		
		myCar.setGas(10); // gas를 10만큼 충전
		myCar.setGas(10);
		myCar.drive();

	}

}

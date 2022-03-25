package Java0222;

public class ex02_carMain {

	public static void main(String[] args) {
		//기본생성자 Car
		ex01_car Car = new ex01_car();
		ex01_car myCar = new ex01_car();
		
		myCar.color = "BlACK";
		myCar.speed = 120;
		myCar.type = "Gasoline";
		myCar.model = "AVANTE";
		
		Car.color = "White";
		Car.speed = 180;
		Car.type = "Gasoline";
		Car.model = "Santafe";
		
		
		ex01_car Car1 = new ex01_car();
		Car1.type = "Gasoline";
		Car1.model = "Santafe";

		ex01_car Car2 = new ex01_car();
		Car2.speed = 180;
		Car2.model = "Santafe";
		
		ex01_car Car3 = new ex01_car("White", 180, "Gasoline", "Santafe");
		
		System.out.println("Car :" + Car);
		System.out.println("Car1 :"+ Car1);
		System.out.println("Car2 :"  + Car2);
		System.out.println("Car3 : "+ Car3);
		
				System.out.println(Car);
				System.out.println(myCar);
				
				myCar.setGas(10);     // gas를 10만큼 충전
				myCar.drive();
				
	}

}

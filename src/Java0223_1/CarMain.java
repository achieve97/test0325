package Java0223_1;

public class CarMain {

	public static void main(String[] args) {
		// Car클래스의 car 객체 생성
		
		Car car = new Car();

		// car에 대한 특성을 결정(값을 대입) 한 후
		//car.color = "White";
		car.setColor("White");
		car.setSpeed(180);
		car.setType("Gasoline");
		car.setModel("AVANTE");
		
		
		
		//showInfo() 메소드로 출력하기
		
		// System.out.println(car.model);
		System.out.println(car.getModel());
	}

}

package Java0222;



public class ex03_myCarMain {

	public static void main(String[] args) {
		
		
		
		ex03_myCar CAR = new ex03_myCar();
		
		CAR.color = "BlACK";
		CAR.speed = 120;
		CAR.type = "Gasoline";
		CAR.model = "AVANTE";
		
		System.out.println(CAR);
		
		CAR.setGas(10);
		CAR.drive();
	}

}

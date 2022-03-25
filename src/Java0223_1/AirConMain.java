package Java0223_1;

public class AirConMain {

	public static void main(String[] args) {
		// airCon 객체를 생성 후 
		AirCon airCon = new AirCon();
		
		airCon.setCompany("Samsung");
		airCon.setColor("White");
		airCon.setSize(60);
		airCon.setPrice(150);
		airCon.setTemp(25);
		
		
	System.out.println(airCon.getCompany());
	}

}

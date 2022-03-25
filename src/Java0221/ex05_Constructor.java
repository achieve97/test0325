package Java0221;

public class ex05_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex02_AirCon airCon = new ex02_AirCon();
		airCon.company = "Samsung";
		airCon.color = "White";
		airCon.price = 160;
		airCon.size = 25;
		airCon.temp = 20;
		
		
	// 매개변수 생성자를 활용한 방법!
		ex02_AirCon airCon2 = new ex02_AirCon("Samsung","White", 160, 25, 20);
		
		//회사, 색상, 가격 매개변수 생성자 만들기
		ex02_AirCon airCon3 = new ex02_AirCon("LG","BLACK", 220, 0, 0);
//		(1) 매개변수에 사이즈와 현재온도를 추가하는 방법
//		(2) 매개변수에 생상을 제거하는 방법
//		(3) AirCon 클래스에서 지정해준 매개변수 생성자에 따라서
//		넣을 수 있는 매개변수의 종류가 달라진다.
//		(4)매개변수를 넣r 때는 순서에 유의할 것
//		
//		
	}
	

}

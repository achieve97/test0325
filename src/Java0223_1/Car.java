package Java0223_1;

public class Car {
	
	// 필드 선언
	private String color;
	private int speed;
	private String type;
	private String model;
	
	//생성자 선언
	Car(){
		
	}
	// 메소드

	
	public void showInfo() {
		System.out.println("[color=" + getColor() + ", speed=" + getSpeed() + ", type=" + getType() + ", model=" + getModel() + "]");
	}

	// 필드 color에 대한 getter()메소드
	// 다른 클래스로 필드값 color를 불러올 때 사용
	public String getColor() {
		return color;
	}

	// 필드 color에 대한 setter()메소드
	// 다른 클래스에서 필드값 color에 값을 저장할 때 사용
	public void setColor(String color) {
		this.color = color;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
}

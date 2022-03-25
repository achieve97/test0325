package Java0224_2;

public abstract class Computer {
	
	// 일반 메소드
	public void turnOn() {
		System.out.println("전원을 켭니다.");
		
	}
	// 추상 메소드
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 추상 메소드
	public abstract void display();
	public abstract void typing();
}

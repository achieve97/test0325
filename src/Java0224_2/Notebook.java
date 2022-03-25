package Java0224_2;

public class Notebook extends Computer{

	@Override
	public void display() {
		System.out.println("Notebook display()");
		
	}

	@Override
	public void typing() {
		System.out.println("Notebook typing()");
		
	}

	// Computer클래스로부터 상속된 추상메소드
	// abstract void typing();
}

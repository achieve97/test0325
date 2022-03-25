package java0224;

public class Child extends Parent {

	// 필드
	int childVar = 20;

	// 메소드
	void childMethod() {
		System.out.println("자식클래스의 메소드");
	}

	// 필드
	int parentVar = 10;

	// 메소드
	void parentMethod(int a, int b, int c) {
		System.out.println("부모클래스의 메소드");
	}
	
	void parentMethod(int a, int b, int c, int d) {
		System.out.println("부모클래스의 메소드");
	}
	
	
}

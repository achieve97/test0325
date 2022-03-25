package Java0223;

public class B {

	public static void main(String[] args) {
		// A클래스의 객체 a 생성
		A a = new A();
		
		a.public1 = 10;
		a.protected1 = 10;
		a.default1 = 10;
		// a.private1 = 10;
	    // 접근제한자가 A클래스에서 private로 선언됐기 때문에 private1 필드는
		// A클래스에서만 사용할 수 있다.
		
		a.public2 ();
		a.protected2 ();
		a.default2 ();
		//a.private2 ();
		
		//private2()메소드는 A클래스에서만 사용가능!
		
	}

}

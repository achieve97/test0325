package Java0223_1;

import Java0223.A;

public class C {

	public static void main(String[] args) {
		// a객체 생성
		A a =  new A();
		
		a.public1 = 10;
//		a.protected1 = 10;
//		a.default1 = 10;
//		a.private1 = 10;
//		
		a.public2 ();
//		a.protected2 ();
//		a.default2 ();
//		a.private2 ();

		
		// protected : 패키지가 달라도 상속을 받는다면 사용 가능
		// default : 패키지가 다르면 사용 불가
	}

}

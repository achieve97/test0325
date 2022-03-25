package java0224;

public class Pr_Ch_Main {

	public static void main(String[] args) {
		Child child = new Child();
		
		// Child클래스의 변수와 메소드 확인
		System.out.println("child.childVar : " + child.childVar);
		child.childMethod();
		
		// Child클래스에 Parent클래스의 변수와 메소드를 상속받은 것을 확인
		System.out.println("child.parentVar : " + child.parentVar);
		child.parentMethod(1,2,3);
	}

}

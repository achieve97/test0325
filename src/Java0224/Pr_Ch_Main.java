package Java0224;

public class Pr_Ch_Main {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		
		
		//child클래스의 변수와 메소드 확인
		System.out.println("childVar : " + child.childVar);
		child.childMethod();
		
		// Child 클래스에 Parent클래스의 변수와 메소드를 상속받을 것을 확인
		System.out.println("child.parentVar : " + child.parentVar);
		child.parentMethod();
	}

}

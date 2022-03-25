package Java0224;

public class OverridingParent {
	
	// 필드
	String company;
	String color;
	int size = 17;
	int temp;
	
	String ParentMethod() {
		return "부모메소드 호출!";
	}
	
	void pM() {
		System.out.println("pM메소드 호출");
	}
}

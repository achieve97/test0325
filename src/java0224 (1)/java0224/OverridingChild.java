package java0224;

public class OverridingChild extends OverridingParent {

	// 필드
	String size = "20평";
	
	
	// 메소드
	String ParentMethod() {
		return "오버라이딩으로 자식 메소드 재정의";
	}
	
	void pM() {
		System.out.println("상속 후 pM메소드 호출");
	}
}

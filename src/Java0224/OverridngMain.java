package Java0224;

public class OverridngMain {

	public static void main(String[] args) {
		OverridingChild oc = new OverridingChild();
		
		System.out.println("size는 17이 출력될까?(parent)");
		System.out.println("아니면 20평이 출력될까?(child)");
		System.out.println("결과는 >>" + oc.size);
		
		oc.size = "30평";
		System.out.println("결과는 >>" + oc.size);
		
		System.out.println();
		System.out.println("오버라이딩 메소드 확인!!");
		System.out.println(oc.ParentMethod());
		
		oc.pM();
	}

}

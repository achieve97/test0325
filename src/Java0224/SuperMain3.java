package Java0224;

public class SuperMain3 {

	public static void main(String[] args) {
		
		Salesman3 man3 = new Salesman3();
		
		System.out.println("name : " + man3.name);
		System.out.println(man3.getNameLocal());
		System.out.println(man3.getNameThis());
		System.out.println(man3.getNameSuper());

	}

}

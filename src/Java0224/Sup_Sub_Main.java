package Java0224;

public class Sup_Sub_Main {

	public static void main(String[] args) {
		SubSub ss = new SubSub();
		
		System.out.println("ss.x : " + ss.x);
		System.out.println("ss.y :" + ss.y);
		System.out.println("ss.z : " + ss.z);
		
		ss.subMethod();
		ss.subMethod();
		ss.subSubMethod();

	}

}

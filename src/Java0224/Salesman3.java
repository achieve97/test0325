package Java0224;

public class Salesman3 extends Employee3{
	
	String name = "안녕하세요";
	
	String getNameLocal() {
		String name = "고윤섭";
		return name;
	}
	
	String getNameThis() {
		String name = "안녕";
		return this.name;
	
	
}
	
	String getNameSuper() {
		String name = "하이";
		return super.name;
	}
	
}
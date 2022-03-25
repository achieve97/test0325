package Java0221;

public class ex09_iciaStu {
	String name;
	String hobby;
	String addr;
	int birth;
	int age;
	
	
	
	
	public int age() {
		return --age;
	}
	
	public int birth() {
		return birth;
	}
	
	public void name() {
		System.out.println("이름은 " + name + " 입니다.");
	}
	
	public void hobby() {
		System.out.println("취미는 " + hobby + " 입니다.");
	}
	
	public void addr() {
		System.out.println("주소는 " + addr + "입니다.");
	}
	
	public void checkAge() {
		System.out.println("현재 나이는" + age +"살 입니다.");
	}

	
	public void checkBirth() {
		System.out.println("생년월일은 " + birth +" 입니다.");
	}


	@Override
	public String toString() {
		return "ex09_iciaStu [이름= " + name + ", 취미= " + hobby + ", 주소= " + addr + ", 생년월일= " + birth + ", 나이= "
				+ age + "]";
	}
	
}

package Java0221;

public class ex10_iciaStuMain {

	public static void main(String[] args) {
		ex09_iciaStu Stu = new ex09_iciaStu();
		ex09_iciaStu Stu1 = new ex09_iciaStu();
		ex09_iciaStu Stu2 = new ex09_iciaStu();
		ex09_iciaStu Stu3 = new ex09_iciaStu();
		
		
	//	System.out.println("Stu");
		
		Stu.name = "고윤섭";
		Stu.hobby = "영화감상";
		Stu.addr = "경기도 시흥시";
		Stu.birth = 970331;
		Stu.age = 26;
		
		Stu1.name = "김유경";
		Stu1.hobby = "카페탐방";
		Stu1.addr = "서울시 송파구";
		Stu1.birth = 960925;
		Stu1.age = 27;
		
		Stu2.name = "박진수";
		Stu2.hobby = "피아노";
		Stu2.addr = "인천 연수구";
		Stu2.birth = 950412;
		Stu2.age = 28;
		
		Stu3.name = "박경수";
		Stu3.hobby = "축구";
		Stu3.addr = "인천 부평구";
		Stu3.birth = 900430;
		Stu3.age = 33;
		

		System.out.println("======= 조원 1 =======");
		
		Stu.name();
		Stu.hobby();
		Stu.addr();
		Stu.age();
		Stu.checkBirth();
		Stu.checkAge();
		
System.out.println("======= 조원 2 =======");
		
		Stu1.name();
		Stu1.hobby();
		Stu1.addr();
		Stu1.age();
		Stu1.checkBirth();
		Stu1.checkAge();
		
System.out.println("======= 조원 3 =======");
		
		Stu2.name();
		Stu2.hobby();
		Stu2.addr();
		Stu2.age();
		Stu2.checkBirth();
		Stu2.checkAge();
		
System.out.println("======= 조원 4 =======");
		
		Stu3.name();
		Stu3.hobby();
		Stu3.addr();
		Stu3.age();
		Stu3.checkBirth();
		Stu3.checkAge();
		
		
		System.out.println();
		
		System.out.println(Stu);
		
		System.out.println(Stu1);
		
		System.out.println(Stu2);
		
		System.out.println(Stu3);
		
		
		
	}

}

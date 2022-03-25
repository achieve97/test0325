package Java0224;

public class IciaStudent extends IciaPerson {  // person 상속
	
	String classroom;
	int grade;
	
	@Override
	void finish() {
		System.out.println("교육생은 5시 30분에 퇴실합니다.");
	}
	
}

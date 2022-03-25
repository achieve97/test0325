package Java0224;

public class IciaTeacher extends IciaPerson{

	 String subject;
	 int commission;
	 
	 @Override
		void finish() {
			System.out.println("선생님은 5시 30분에 퇴근합니다.");
		}
}

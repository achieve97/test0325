package Java0224;

public class IciaWorker extends IciaPerson {
	
	String department;
	
	@Override
	public void finish() {
		System.out.println("직원들은 6시에 퇴근합니다.");
	}
}

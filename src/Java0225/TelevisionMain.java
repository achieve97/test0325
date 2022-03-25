package Java0225;

public class TelevisionMain {

	public static void main(String[] args) {
		
		
		
		// [1] 객체생성
		
		Television tv = new Television();
		
		
		tv.turnOn();
		tv.setVolume(50);
		tv.setMute(true);
		tv.turnOff();
		System.out.println();
		
		// [2] 자동 타입 변환
		RemoteControl rc = null;
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(-1);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		// [3] 유틸클래스 사용
		
		RemoteInfo remote = new RemoteInfo();
		remote.Info(new SmartTV(), "네이버",8,true);
		
		
		
		remote.Info(audio, 4, false);
		}
	
	// TV, Audio 유틸클래스 활용해보기
	
}






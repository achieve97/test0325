package Java0225.java0225;

public class RemoteMain1 {

	public static void main(String[] args) {
		
		// [1] 객체 생성
		Audio1 audio = new Audio1();
		
		audio.turnOn();
		audio.setVolume(50);
		audio.setMute(true);
		audio.turnOff();
		System.out.println();
		
		// [2] 자동 타입 변환
		RemoteControl1 rc = null;
		rc = new Television1();
		
		rc.turnOn();
		rc.setVolume(-1);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		// [3]유틸클래스 활용
		RemoteInfo1 remote = new RemoteInfo1();
		remote.Info(new SmartTV1(), "네이버", 8, true);
		
		// TV, Audio 유틸클래스 활용해보기!
		System.out.println();
		remote.Info(audio, 4, false);
		System.out.println();
		remote.Info(rc, -3, true);
		
		
		

	}

}

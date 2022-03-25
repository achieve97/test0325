package Java0225;

public class Television implements RemoteControl{
      // RemoteControl 인터페이스를 상속 받아서
	  // Television 클래스를 완성시켜 보세요

	// 필드 선언
	private int volume;
	
	// 추상메소드 오버라이딩
	
	@Override
	public void turnOn() {
		System.out.println("Television을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Television을 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Television 볼륨 : " + this.volume);
		
	}
	
	// default메소드 삭제
}
package Java0225.java0225;

public class Television1 implements RemoteControl1 {

	// RemoteControl 인터페이스를 상속 받아서
	// Television 클래스를 완성시켜 보세요!

	// 필드 선언
	private int volume;

	// 추상메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl1.MAX_VOLUME) {
			this.volume = RemoteControl1.MAX_VOLUME;
		} else if (volume < RemoteControl1.MIN_VOLUME) {
			this.volume = RemoteControl1.MIN_VOLUME;
		} else {
			this.volume = volume;
		}

		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

	// default메소드 setMute() 삭제

}

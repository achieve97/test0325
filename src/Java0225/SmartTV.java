package Java0225;

public class SmartTV implements RemoteControl,InternetSearch {
	
	//필드
	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "에서 검색합니다.");
		
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
	}
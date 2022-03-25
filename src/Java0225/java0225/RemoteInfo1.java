package Java0225.java0225;

public class RemoteInfo1 {

	void Info(RemoteControl1 remote, int volume, boolean mute) {
		remote.turnOn();
		remote.setVolume(volume);
		remote.setMute(mute);
		remote.turnOff();
	}
	
	void Info(RemoteControl1 remote, InternetSearch1 internet, String url, int volume, boolean mute) {
		remote.turnOn();
		internet.search(url);
		remote.setVolume(volume);
		remote.setMute(mute);
		remote.turnOff();
	}
	
	void Info(SmartTV1 smart, String url, int volume, boolean mute) {
		smart.turnOn();
		smart.search(url);
		smart.setVolume(volume);
		smart.setMute(mute);
		smart.turnOff();
	}
	
}

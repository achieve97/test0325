package Java0225;

public class RemoteInfo  {
	
	void Info(RemoteControl remote, int volume, boolean mute) {
		remote.turnOn();
		remote.setVolume(volume);
		remote.setMute(mute);
		remote.turnOff();
	}
	
	void Info(RemoteControl remote, InternetSearch internet, String url,int volume) {
		remote.turnOn();
		internet.search(url);
		remote.turnOff();
	}
	
	void Info(SmartTV smart, int volume, boolean mute) {
		smart.turnOn();
		smart.setVolume(volume);
		smart.setMute(mute);
		smart.turnOff();
	}

	
}



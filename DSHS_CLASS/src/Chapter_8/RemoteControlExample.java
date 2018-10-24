package Chapter_8;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc1 = new RemoteControl() {
			public void turnOn() {}
			public void turnOff() {}
			public void setVolume(int volume) {}
		};
		
		RemoteControl rc  = null;
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		RemoteControl.changeBattery();
	}
}

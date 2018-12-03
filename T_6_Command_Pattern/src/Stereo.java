
public class Stereo {

	public void on() {
		System.out.println("Turning ON stereo");

	}

	public void off() {
		System.out.println("Turning stereo OFF");

	}

	public void setCd() {
		System.out.println("Setting a CD in a stereo");
	}
	public void ejectCd() {
		System.out.println("Ejecting Cd.");
		
	}

	public void setDvd() {
		System.out.println("Setting a DVD in a stereo");

	}
	
	public void ejectDvd() {
		System.out.println("Ejecting DVD");
	}

	public void setRadio() {
		System.out.println("Setting Radio on a stereo");
	}

	public void setVolume(int glasnoca) {
		System.out.println("Setting stereo volume: " + glasnoca);
	}
	public void mute() {
		System.out.println("Stereo volume set to 0");
	}
}

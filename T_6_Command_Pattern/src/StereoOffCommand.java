
public class StereoOffCommand implements ICommand {

	Stereo st;

	public StereoOffCommand(Stereo st) {
		this.st = st;
	}

	@Override
	public void execute() {
		st.ejectDvd();
		st.mute();
		st.off();

	}

	@Override
	public void undo() {
		st.on();
		st.setDvd();
		st.setVolume(10);

	}

}

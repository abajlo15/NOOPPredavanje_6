
public class StereOnCommand implements ICommand {

	Stereo st;

	public StereOnCommand(Stereo st) {
		this.st = st;
	}

	@Override
	public void execute() {
		st.on();
		st.setDvd();
		st.setVolume(10);

	}

	@Override
	public void undo() {
		st.ejectDvd();
		st.mute();
		st.off();

	}

}

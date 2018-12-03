
public class GarageDoorClosedCommand implements ICommand {

	// Receiver
	GarageDoor garDoor;

	public GarageDoorClosedCommand(GarageDoor gd) {
		garDoor = gd;
	}

	@Override
	public void execute() {
		garDoor.down();
		garDoor.lightOff();

	}

	@Override
	public void undo() {

		garDoor.up();
		garDoor.lightOn();
		garDoor.stop();

	}

}

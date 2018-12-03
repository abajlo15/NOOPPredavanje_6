
public class RemoteController {

	ICommand[] SlotCmdOn;
	ICommand[] SlotCmdOff;
	ICommand nc = new NoCommand();
	int slot;

	ICommand undoCommand;

	public RemoteController() {

		SlotCmdOff = new ICommand[7];
		SlotCmdOn = new ICommand[7];

		for (int k = 0; k < SlotCmdOff.length; k++) {
			SlotCmdOn[k] = nc;
			SlotCmdOff[k] = nc;

		}

		undoCommand = nc;

	}

	public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {

		SlotCmdOn[slot] = onCommand;
		SlotCmdOff[slot] = offCommand;

	}

	public void buttonOnPressed(int slot) {
		SlotCmdOn[slot].execute();
		undoCommand = SlotCmdOn[slot];
	}

	public void undoButtonWasPressed() {
		undoCommand.undo();
	}

	public void buttonOffPressed(int slot) {
		SlotCmdOff[slot].execute();
		undoCommand = SlotCmdOff[slot];

	}

	public String toString() {

		StringBuffer sbuf = new StringBuffer();
		sbuf.append("\n ********** Remote Controller **********\n");
		for (int k = 0; k < SlotCmdOn.length; k++) {
			sbuf.append("[Slot " + k + "]" + SlotCmdOn[k].getClass().getName() + "\t\t"
					+ SlotCmdOff[k].getClass().getName() + "\n");
		}
		return sbuf.toString();
	}
}

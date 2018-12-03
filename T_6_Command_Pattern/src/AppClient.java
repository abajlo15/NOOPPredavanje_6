import java.awt.peer.LightweightPeer;

public class AppClient {

	public static void main(String[] args) {

		RemoteController remote = new RemoteController();
		Light light = new Light();
		GarageDoor gar = new GarageDoor();

		LightOnCommand lightOnCmd = new LightOnCommand(light);
		LightOffCommand lightOffCmd = new LightOffCommand(light);
		// remote.setCommand(lightOnCmd);
		// remote.buttonOnPressed();

		GarageDoorOpenCommand GarDorOpenCmd = new GarageDoorOpenCommand(gar);
		GarageDoorClosedCommand GarDorClosedCmd = new GarageDoorClosedCommand(gar);
		// remote.setCommand(GarDorCmd);
		// remote.buttonOnPressed();

		remote.setCommand(0, lightOnCmd, lightOffCmd);
		remote.setCommand(1, GarDorOpenCmd, GarDorClosedCmd);

		System.out.println(remote.toString());
		System.out.println("*********SLOT 0*********");
		remote.buttonOnPressed(0);
		System.out.println("**********SLOT 1**********");
		remote.buttonOffPressed(1);
		remote.undoButtonWasPressed();
		

	}

}

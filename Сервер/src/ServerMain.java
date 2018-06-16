import javax.swing.*;

public class ServerMain {

	public static void main(String[] args) {
		
		ServerApp server = new ServerApp();
		server.setSize(400,250);
		server.setVisible(true);
		server.setTitle("Checkers Server");
		server.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//start Connection
		server.startRunning();
	}
}

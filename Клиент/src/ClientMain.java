import javax.swing.*;

import Model.Player;
import View.BoardPanel;

public class ClientMain {

	public static void main(String[] args) {

		ClientApp client = new ClientApp();
		client.setTitle(client.getPlayerName());
		client.pack();
		client.setVisible(true);
		client.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}

package usantatecla.tictactoe.views.console;

import usantatecla.tictactoe.controllers.StartController;
import usantatecla.tictactoe.models.Turn;
import usantatecla.tictactoe.views.MessageView;
import usantatecla.utils.PlayersDialog;

class StartView extends WithConsoleView {

    void interact(StartController startController) {
		startController.start();
		this.console.writeln(MessageView.START_GAME.getMessage());
		int numberOfUsers = new PlayersDialog().read(Turn.NUM_PLAYERS);
		startController.createPlayers(numberOfUsers);
	}
}
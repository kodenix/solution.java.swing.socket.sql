package usantatecla.tictactoe.views;

import usantatecla.tictactoe.models.Game;
import usantatecla.utils.Console;
import usantatecla.utils.LimitedIntDialog;

class StartView extends SubView {

    StartView(Game game) {
		super(game);
	}

    void interact() {
		Console.getInstance().writeln(Message.TITLE.getMessage());
		int users = new LimitedIntDialog(0, 
			this.game.getMaxPlayers()).read(Message.NUMBER_PLAYERS.getMessage());
		this.game.setUsers(users);
		new GameView(this.game).write();
	}

}

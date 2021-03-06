package usantatecla.tictactoe.views.console;

import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.views.Message;
import usantatecla.utils.YesNoDialog;

class ResumeView extends SubView {

	ResumeView(Game game) {
		super(game);
	}

	boolean interact() {
		boolean isResumed = new YesNoDialog().read(Message.RESUME.getMessage());
		if (isResumed){
			this.game.reset();
		}
		return isResumed;
	}

}

package usantatecla.tictactoe.views.console;

import usantatecla.tictactoe.types.Error;

class ErrorView extends usantatecla.tictactoe.views.ErrorView {

	ErrorView(Error error) {
		super(error);
	}
	
	void writeln() {
		new Console().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}

}

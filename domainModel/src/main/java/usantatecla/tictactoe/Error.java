package usantatecla.tictactoe;

import usantatecla.utils.Console;

enum Error {

	NOT_EMPTY("The square is not empty"),
	NOT_OWNER("There is not a token of yours"),
	SAME_COORDINATES("The origin and target squares are the same"),
	WRONG_COORDINATES("The coordinates are wrong"),
	NULL;

	private String message;

	Error(){
	}

	Error(String message){
		this.message = message;
	}

	void writeln() {
		if (this != Error.NULL){
			Console.getInstance().writeln(this.message);
		}
	}

}

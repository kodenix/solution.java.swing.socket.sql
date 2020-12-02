package usantatecla.utils;

public class PlayersDialog {

	private static final String USERS_ERROR = "Wrong number of users";

	public int read(int players) {
		int users = 0;
		do {
			users = Console.getInstance().readInt("Number of users [0-" + players + "] ");
			assert users >= 0 && users < 3;
			if (users < 0 || users > 2) {
				Console.getInstance().writeln(PlayersDialog.USERS_ERROR);
			}
		} while(users < 0 || users > 2);
		return users;
	}
    
}
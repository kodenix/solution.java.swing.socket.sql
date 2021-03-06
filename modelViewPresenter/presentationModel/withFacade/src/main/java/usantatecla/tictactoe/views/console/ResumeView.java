package usantatecla.tictactoe.views.console;

import usantatecla.tictactoe.controllers.Logic;
import usantatecla.tictactoe.views.Message;
import usantatecla.utils.YesNoDialog;

class ResumeView extends SubView {

    public ResumeView(Logic logic) {
        super(logic);
    }

    boolean interact() {
        boolean isResumed = new YesNoDialog().read(Message.RESUME.getMessage());
        if (isResumed) {
            this.logic.reset();
        }
        return isResumed;
    }

}

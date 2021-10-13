package racinggame.exception;

import racinggame.view.Script;

public class WrongInputException extends Exception {
    public WrongInputException() {
        System.out.println(Script.error.getMent());
    }

}

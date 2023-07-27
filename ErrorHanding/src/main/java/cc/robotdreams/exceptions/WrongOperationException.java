package cc.robotdreams.exceptions;

public class WrongOperationException extends Exception {
    public WrongOperationException() {
        super("The account does not have enough funds");
    }
}

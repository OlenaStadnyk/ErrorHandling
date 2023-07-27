package cc.robotdreams.exceptions;
public class WrongAccountException extends Exception {
    public WrongAccountException() {
        super("This account does not exist");
    }
}
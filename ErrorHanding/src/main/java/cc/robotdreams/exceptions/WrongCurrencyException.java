package cc.robotdreams.exceptions;

public class WrongCurrencyException extends Exception {
    public WrongCurrencyException() {
        super("This account has another currency");
    }
}

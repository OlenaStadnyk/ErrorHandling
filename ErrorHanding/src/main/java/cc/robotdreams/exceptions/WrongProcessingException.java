package cc.robotdreams.exceptions;

public class WrongProcessingException extends Exception {
    public WrongProcessingException() {
        super("An error occurred during processing, please try again");
    }
}

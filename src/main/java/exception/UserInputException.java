package exception;

public class UserInputException extends RuntimeException {

    public void idException() throws UserInputException {
        throw new UserInputException();
    }

    public void passwordException() throws UserInputException {
        throw new UserInputException();
    }
}

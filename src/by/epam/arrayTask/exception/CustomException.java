package by.epam.arrayTask.exception;

public class CustomException extends Exception {
    public CustomException(){}

    public CustomException(String str)
    {
        super(str);
    }

    public CustomException(String str, Throwable cause)
    {
        super(str, cause);
    }

    public CustomException(Throwable cause) {
        super(cause);
    }
}

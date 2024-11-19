package co.com.rocketchat.exceptions;

public class MessageException extends Error {

    public static final String ERROR = "Error";

    public MessageException(String message, Throwable cause) {
        super(message, cause);
    }


}

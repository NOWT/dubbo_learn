package com.example.consumer.exceptions;

/**
 * @program: dubbo_learn
 * @description:
 * @author: mjw
 * @create: 2022-05-02 20:11
 */
public class MockException extends Exception {
    private String message;

    public MockException(String message) {
        this.message = message;
    }

    public MockException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public MockException(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
    }

    public MockException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    public MockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.message = message1;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

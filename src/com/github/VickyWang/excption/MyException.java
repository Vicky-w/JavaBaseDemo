package com.github.VickyWang.excption;

import java.util.Date;
/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class MyException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private Date errorTime;

    public MyException() {
        super();
        this.errorTime = new Date();
    }

    public MyException(Date errorTime) {
        super();
        this.errorTime = errorTime;
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public Date getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(Date errorTime) {
        this.errorTime = errorTime;
    }

}

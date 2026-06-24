package com.model.exceptions;

public class WithdrawLimitException extends RuntimeException {

    public WithdrawLimitException(String msg) {
        super(msg);
    }
}

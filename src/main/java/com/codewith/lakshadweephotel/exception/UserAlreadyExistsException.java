package com.codewith.lakshadweephotel.exception;

/**
 * @author Nehal Ansari
 */

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

package com.codewith.lakshadweephotel.exception;

/**
 * @author Nehal Ansari
 */

public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message);
    }
}

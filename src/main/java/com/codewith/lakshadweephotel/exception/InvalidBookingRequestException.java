package com.codewith.lakshadweephotel.exception;

/**
 * @author Nehal Ansari
 */

public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}

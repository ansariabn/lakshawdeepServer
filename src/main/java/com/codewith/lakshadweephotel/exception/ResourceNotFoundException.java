package com.codewith.lakshadweephotel.exception;

/**
 * @author Nehal Ansari
 */

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}

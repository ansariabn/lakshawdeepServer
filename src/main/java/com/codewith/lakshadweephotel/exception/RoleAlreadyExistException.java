package com.codewith.lakshadweephotel.exception;

/**
 * @author Nehal Ansari
 */

public class RoleAlreadyExistException extends RuntimeException {
    public RoleAlreadyExistException(String message) {
        super(message);
    }
}

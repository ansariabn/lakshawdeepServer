package com.codewith.lakshadweephotel.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author Nehal Ansari
 */
@Data
public class LoginRequest {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}

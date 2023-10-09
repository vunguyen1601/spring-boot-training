package tech.outsource.training.pratice002.controller.api.models;

import jakarta.validation.constraints.NotBlank;

public record LoginRequest(
        @NotBlank
        String user_name,
        @NotBlank
        String password
) {
}

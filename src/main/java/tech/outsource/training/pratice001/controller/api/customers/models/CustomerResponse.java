package tech.outsource.training.pratice001.controller.api.customers.models;

import jakarta.validation.constraints.NotBlank;

public record CustomerResponse(Integer id,
                               @NotBlank String customerCode,
                               @NotBlank String firstName,
                               @NotBlank String lastName,
                               @NotBlank String email) {
}

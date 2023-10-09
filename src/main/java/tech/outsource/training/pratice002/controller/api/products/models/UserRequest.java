package tech.outsource.training.pratice002.controller.api.products.models;

import jakarta.validation.constraints.NotBlank;

public record UserRequest(
                            @NotBlank
                            String name,
                            @NotBlank
                            String password,
                            @NotBlank
                            String firstName,
                            @NotBlank String lastName) {

}

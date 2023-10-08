package tech.outsource.training.pratice001.controller.api.products.models;

import jakarta.validation.constraints.NotBlank;

public record ProductRequest( @NotBlank String code ,
                             @NotBlank String name,
                             @NotBlank String category) {

}

package tech.outsource.training.pratice001.controller.api.products.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record ProductResponse(
        Integer id,
        @NotBlank String code ,
        @NotBlank String name,
        @NotBlank String category,
        @NotBlank @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        LocalDateTime createdAt,
        @NotBlank @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        LocalDateTime updatedAt ){
}


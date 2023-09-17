package tech.outsource.training.pratice001.controller.api.products.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import tech.outsource.training.pratice001.domain.exercise001.Product;

import java.time.LocalDateTime;

public record ProductResponse (
        Integer id,
        String code,
        String name,
        String category,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        LocalDateTime createdAt,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        LocalDateTime updatedAt){

    public static ProductResponse of(Product product) {
        return new ProductResponse(product.id(),
        product.code(),
        product.name(),
        product.category(),
        product.createdAt(),
        product.updatedAt());
    }
}


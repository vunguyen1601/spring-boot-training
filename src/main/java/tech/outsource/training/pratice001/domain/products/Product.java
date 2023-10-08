package tech.outsource.training.pratice001.domain.products;

import com.fasterxml.jackson.annotation.JsonFormat;
import tech.outsource.training.pratice001.controller.api.products.models.ProductRequest;

import java.time.LocalDateTime;

public record Product(String code,
                      String name,
                      String category,
                      @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                      LocalDateTime createdAt,
                      @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                      LocalDateTime updatedAt) {
    public static Product of(ProductRequest productRequest) {
        return new Product(productRequest.code(),
                productRequest.name(),
                productRequest.category(),
                LocalDateTime.now(),
                LocalDateTime.now());
    }
}

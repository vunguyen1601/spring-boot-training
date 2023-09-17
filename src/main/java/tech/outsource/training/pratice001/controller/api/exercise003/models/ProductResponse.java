package tech.outsource.training.pratice001.controller.api.exercise003.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import tech.outsource.training.pratice001.domain.exercise003.Products;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public record ProductResponse(Integer id,
                              String code,
                              String name,
                              String category,
                              @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                              LocalDateTime createdAt,
                              @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                              LocalDateTime updatedAt){


    public static List<ProductResponse> of(Products list) {
        return list.getProducts().stream()
                .map(product -> new ProductResponse(product.id(), product.code(),product.name(),product.category(),product.createdAt(),
                        product.updatedAt()))
                .collect(Collectors.toList());
    }
}

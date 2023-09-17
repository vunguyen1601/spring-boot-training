package tech.outsource.training.pratice001.controller.api.products.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record ProductResponse(
        Integer id,
         String code ,
        String name,
        String category,
        LocalDateTime createAt,
        LocalDateTime updateAt ){
}


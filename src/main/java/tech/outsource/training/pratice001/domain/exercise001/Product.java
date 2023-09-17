package tech.outsource.training.pratice001.domain.exercise001;

import java.time.LocalDateTime;

public record Product (
        Integer id,
        String code,
        String name,
        String category,
        LocalDateTime createdAt,
        LocalDateTime updatedAt){

    public static Product ofEmpty() {
        return new Product(0, "", "", "", LocalDateTime.MIN, LocalDateTime.MIN);
    }

}

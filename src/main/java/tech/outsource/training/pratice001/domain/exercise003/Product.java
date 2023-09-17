package tech.outsource.training.pratice001.domain.exercise003;

import lombok.RequiredArgsConstructor;
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
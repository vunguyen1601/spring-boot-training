package tech.outsource.training.pratice002.domain.users;

import com.fasterxml.jackson.annotation.JsonFormat;
import tech.outsource.training.pratice002.controller.api.products.models.UserRequest;
import java.time.LocalDateTime;

public record Users(String name,
                    String password,
                    String firtsName,
                    String lastName,
                    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                   LocalDateTime createdAt,
                    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                   LocalDateTime updatedAt) {
    public static Users of(UserRequest userRequest) {
        return new Users(userRequest.name(),
                userRequest.password(),
                userRequest.firstName(),
                userRequest.lastName(), LocalDateTime.now(), LocalDateTime.now());
    }
}

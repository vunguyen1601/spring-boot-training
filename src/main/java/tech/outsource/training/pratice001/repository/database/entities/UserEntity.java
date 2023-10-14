package tech.outsource.training.pratice001.repository.database.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;
import tech.outsource.training.pratice001.domain.users.Users;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@Builder
public class UserEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    Integer usersId;
    @Column(name = "user_name")
    String userName;
    @Column(name = "password")
    String password;
    @Column(name = "firts_name")
    String firtsName;
    @Column(name = "last_name")
    String lastName;
    @Column(name = "create_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    LocalDateTime createdAt;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "update_at")
    LocalDateTime updatedAt;

    public static UserEntity of(Users users) {
        return UserEntity.builder()
                .userName(users.name())
                .password(users.password())
                .firtsName(users.firtsName())
                .lastName(users.lastName())
                .createdAt(users.createdAt())
                .updatedAt(users.updatedAt())
                .build();
    }
}

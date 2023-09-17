package tech.outsource.training.pratice001.domain.excercise001;

import java.time.LocalDateTime;

public record Product( Integer id,
                        String code ,
                       String name,
                       String category,
                       LocalDateTime createAt,
                       LocalDateTime updateAt) {

}

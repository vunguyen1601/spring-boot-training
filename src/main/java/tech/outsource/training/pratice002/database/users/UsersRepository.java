package tech.outsource.training.pratice002.database.users;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.outsource.training.pratice002.database.entities.UsersEntity;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<UsersEntity, Integer> {

    UsersEntity findByuserName (String username);

}

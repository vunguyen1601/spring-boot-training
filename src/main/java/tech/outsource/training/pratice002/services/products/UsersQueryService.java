package tech.outsource.training.pratice002.services.products;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.outsource.training.pratice001.domain.customers.Customer;
import tech.outsource.training.pratice002.database.entities.UsersEntity;
import tech.outsource.training.pratice002.database.users.UsersRepository;
import tech.outsource.training.pratice002.domain.users.Users;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersQueryService {
    // Read data
    final UsersRepository repository;
    Optional<UsersEntity> findById(Integer id){
        return repository.findById(id);
    }

    List<UsersEntity> findAll(){
        return repository.findAll();
    }
}

package tech.outsource.training.pratice002.services.products;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import tech.outsource.training.pratice002.database.entities.UsersEntity;
import tech.outsource.training.pratice002.database.users.UsersRepository;
import tech.outsource.training.pratice002.domain.users.Users;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersCommandService {
    /*Writte data*/

    @NonNull
    final UsersRepository repository;
    void save(Users users){
        UsersEntity usersEntity = UsersEntity.of(users);
        repository.save(usersEntity);
    }
    void update (Integer id, Users users){
        Optional<UsersEntity> usersEntity = repository.findById(id);

        UsersEntity updateUser = usersEntity.get();
        updateUser.setUserName(users.name());
        updateUser.setPassword(users.password());
        updateUser.setFirtsName(users.firtsName());
        updateUser.setLastName(users.lastName());
        updateUser.setCreatedAt(LocalDateTime.now());
        updateUser.setUpdatedAt(LocalDateTime.now());
        repository.save(updateUser);
    }
    void delete(Integer id) {
        repository.deleteById(id);
    }
    String login(String user_name, String password) {
       UsersEntity usersEntity = repository.findByuserName(user_name);
       if(usersEntity==null){
          return "User not found with username: " + user_name ;
       }else{
           if(usersEntity.getPassword().equals(password)){
               return "Log in successfully";
           }else{
               return "Log in unsuccessfully";
           }
       }
    }

}

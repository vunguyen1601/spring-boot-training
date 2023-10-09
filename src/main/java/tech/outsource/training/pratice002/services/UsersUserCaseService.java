package tech.outsource.training.pratice002.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.outsource.training.pratice002.database.entities.UsersEntity;
import tech.outsource.training.pratice002.domain.users.Users;


import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersUserCaseService {
    final UsersCommandService usersCommandService;

    final UsersQueryService usersQueryService;

    public void save (Users users){
        usersCommandService.save(users);
    }


    public Optional<UsersEntity> findById(Integer id){
        return usersQueryService.findById(id);
    }

    public void update (Integer id, Users users){
        usersCommandService.update(id, users);
    }

    public List<UsersEntity> findAll(){

        return usersQueryService.findAll();
    }
    public void delete(Integer id){
        usersCommandService.delete(id);
    }
    public String login(String username, String password){
       return usersCommandService.login(username, password);
    }
}

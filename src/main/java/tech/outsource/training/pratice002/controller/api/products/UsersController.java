package tech.outsource.training.pratice002.controller.api.products;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tech.outsource.training.pratice002.controller.api.products.models.LoginRequest;
import tech.outsource.training.pratice002.controller.api.products.models.UserRequest;
import tech.outsource.training.pratice002.controller.api.products.models.UserResponse;
import tech.outsource.training.pratice002.database.entities.UsersEntity;
import tech.outsource.training.pratice002.domain.users.Users;
import tech.outsource.training.pratice002.services.products.UsersUserCaseService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UsersController implements UsersApi {
    final UsersUserCaseService usersUserCaseService;

    @Override
    public UserResponse findById(Integer id) {
        Optional<UsersEntity> foundUser = usersUserCaseService.findById(id);
        return new UserResponse(foundUser.get().getUsersId(),
                 foundUser.get().getUserName(),
                foundUser.get().getPassword(),
                foundUser.get().getFirtsName(),
                foundUser.get().getLastName(),
                foundUser.get().getCreatedAt(),
                foundUser.get().getUpdatedAt());
    }

    @Override
    public List<UserResponse> list() {
        List<UsersEntity> usersEntityList = usersUserCaseService.findAll();
        List<UserResponse> userResponses = new ArrayList();
        for (UsersEntity usersEntity : usersEntityList) {
            UserResponse user = new UserResponse(
                    usersEntity.getUsersId(),
                    usersEntity.getUserName(),
                    usersEntity.getPassword(),
                    usersEntity.getFirtsName(),
                    usersEntity.getLastName(),
                    usersEntity.getCreatedAt(),
                    usersEntity.getUpdatedAt()
            );
            userResponses.add(user);
        }

        return userResponses;
    }



    @Override
    public void createUser(UserRequest usersRequest) {
        usersUserCaseService.save(new Users(
                usersRequest.name(),
                usersRequest.password(),
                usersRequest.firstName(),
                usersRequest.lastName(),
                LocalDateTime.now(),
                LocalDateTime.now()));
    }

    @Override
    public void updateUser(Integer id, UserRequest userRequest) {
        usersUserCaseService.update(id, Users.of(userRequest));
    }

    @Override
    public void deleteUser(Integer id) {
        usersUserCaseService.delete(id);
    }

    @Override
    public String login(LoginRequest loginRequest) {
       return usersUserCaseService.login(loginRequest.user_name(), loginRequest.password());
    }

}













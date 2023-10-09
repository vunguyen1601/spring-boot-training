package tech.outsource.training.pratice002.controller.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tech.outsource.training.pratice002.controller.api.models.UserResponse;
import tech.outsource.training.pratice002.controller.api.models.LoginRequest;
import tech.outsource.training.pratice002.controller.api.models.UserRequest;

import java.util.List;

@Tag(name = "Area", description = "the area API")
@RequestMapping("/v1/api/users")
public interface UsersApi {
    @GetMapping("{id}")
    UserResponse findById(@PathVariable("id") Integer id);
    @GetMapping
    List<UserResponse> list();
    @PostMapping
    void createUser(@RequestBody UserRequest usersRequest);

    @PutMapping("{id}")
    void updateUser(@PathVariable("id") Integer id, @RequestBody UserRequest userRequest);

    @DeleteMapping("{id}")
    void deleteUser(@PathVariable("id")Integer id);

    @PostMapping("login")
    String login(@RequestBody LoginRequest loginRequest);
}



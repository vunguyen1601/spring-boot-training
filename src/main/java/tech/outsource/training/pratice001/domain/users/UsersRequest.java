package tech.outsource.training.pratice001.domain.users;

public class UsersRequest {
    String password;
    String firstName;
    String lastname;
    String name ;
    public String lastName() {
        return lastname;
    }


    public String password() {
        return this.password;

    }


    public String name() {
        return  name;

    }
    public String firstName() {
        return this.firstName;
    }
}

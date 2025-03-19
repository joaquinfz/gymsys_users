package com.project.gymsystem.UserService.Dto;


import com.project.gymsystem.UserService.Entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private String fullName;
    private String email;
    private String username;
    private String password;

    public UserDto(User user){
        this.fullName = user.getFullName();
        this.email = user.getEmail();
        this.username = user.getUsername();
    }
}

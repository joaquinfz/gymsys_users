package com.project.gymsystem.UserService.Service;

import com.project.gymsystem.UserService.Entity.User;
import com.project.gymsystem.UserService.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public User createUser(UserDto userDto){

    }
}

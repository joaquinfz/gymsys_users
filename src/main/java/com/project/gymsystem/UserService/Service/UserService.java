package com.project.gymsystem.UserService.Service;

import com.project.gymsystem.UserService.Dto.UserDto;
import com.project.gymsystem.UserService.Entity.User;
import com.project.gymsystem.UserService.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.Optional;

@Service
public class UserService {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserDto getUser(Long id){

        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            return new UserDto(user.get());
        } else {
            throw new ResourceNotFoundException();
        }
    }


    public String createUser(UserDto userDto){
        if(userRepository.findByUsername(userDto.getUsername()).isPresent()){
            throw new ResourceAccessException("ya existe usuario con el mismo username, por favor elija otro");
        }

        User newUser = new User(userDto);
        userRepository.save(newUser);

        return newUser.getId();
    }
}

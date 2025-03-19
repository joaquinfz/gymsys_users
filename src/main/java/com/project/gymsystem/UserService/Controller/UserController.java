package com.project.gymsystem.UserService.Controller;

import com.project.gymsystem.UserService.Dto.UserDto;
import com.project.gymsystem.UserService.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public UserDto getUserProfile(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PutMapping("/update")
    public String updateUserProfile() {
        return "User profile updated";
    }

    @PostMapping("/create")
    public ResponseEntity<String> createUserProfile(@RequestBody UserDto user){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            String loggedInUser = ((UserDetails) principal).getUsername();
            System.out.println("Request by: " + loggedInUser);
        }

        // Save user in the database
        String newId = userService.createUser(user);
        return ResponseEntity.ok(newId);
    }
}
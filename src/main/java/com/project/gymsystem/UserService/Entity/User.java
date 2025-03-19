package com.project.gymsystem.UserService.Entity;


import com.project.gymsystem.UserService.Dto.UserDto;
import org.springframework.data.annotation.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")  // Replaces @Entity and @Table
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id  // Marks this field as the primary key in MongoDB
    private String id;  // MongoDB uses String/ObjectId for IDs

    private String fullName;
    private String email;
    private String username;
    private String password;

    public User(UserDto userDto){
        this.fullName = userDto.getFullName();
        this.email = userDto.getEmail();
        this.username = userDto.getUsername();
        this.password = userDto.getPassword();
    }
}

package com.project.gymsystem.UserService.Repository;

import com.project.gymsystem.UserService.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

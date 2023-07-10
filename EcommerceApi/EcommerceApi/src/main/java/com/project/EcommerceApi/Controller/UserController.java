package com.project.EcommerceApi.Controller;

import com.project.EcommerceApi.Model.User;
import com.project.EcommerceApi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("User")

    public Iterable<User> getAllUser(){
        return userService.getAllUser();

    }

    @GetMapping("User/{userId}")

    public Optional<User> getUserByUserId(@PathVariable Long userId){
        return userService.getUserByUserId(userId);

    }

    @PostMapping("createUser")

    public String createUser(@RequestBody User user){
        return userService.createUser(user);
    }

}

package com.rinku.backoffice.controller;

import com.rinku.backoffice.persistence.model.User;
import com.rinku.backoffice.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }

    @GetMapping("/users")
    public List<User> getUsers(@RequestParam(required = false)String rol){
        return userService.getUsers(rol);
    }

    @PostMapping("/users")
    public ResponseEntity<?> createUsers(@RequestBody User user){
        return userService.createUser(user);
    }
}

package com.termproj.Flitey.controller;

import com.termproj.Flitey.model.User;
import com.termproj.Flitey.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //read user info from id
    @GetMapping("{userId}")
    public User getUserInfo(@PathVariable("userId") int userId){
        return userService.getUser(userId);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    public String createUserInfo(@RequestBody User user){
        userService.createUser(user);
        return "created user succesfully";
    }

    @PutMapping({"userId"})
    public String updateMemberStatus(@PathVariable("userId") int userId){
        return userService.updateMem(userId);
    }

}

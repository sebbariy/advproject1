package com.younesseb.advproject1.controller;

import com.younesseb.advproject1.model.User;
import com.younesseb.advproject1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        User userToFind = userService.getUserByUserName(user.getUsername());
        if ( userToFind.getPassword().equals(user.getPassword()) ) {
            return userToFind;
        }
        return null;
    }

    @PostMapping("/addUser")
    public String add(@RequestBody User user){
        userService.saveUser(user);
        return "New User is added";
    }
    @GetMapping("/getAllUsers")
    public List<User> list(){
        return userService.getAllUsers();
    }

    @GetMapping("/{userid}")
    public Optional<User> getUserById(@PathVariable int userid){
        return userService.getUserById(userid);
    }

    @PutMapping("/{userid}")
    public User updateUser(@PathVariable int userid, @RequestBody User user){
        return userService.updateUser(userid, user);
    }

    @DeleteMapping("/{userid}")
    public void deleteUser(@PathVariable int userid){
        userService.deleteUser(userid);
    }
}


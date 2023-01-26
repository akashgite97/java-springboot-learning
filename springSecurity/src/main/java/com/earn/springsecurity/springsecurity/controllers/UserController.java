package com.earn.springsecurity.springsecurity.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.earn.springsecurity.springsecurity.models.User;
import com.earn.springsecurity.springsecurity.services.UserSerivce;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserSerivce userSerivce;

 
    @GetMapping("/all")
    public List<User> getAllusers(){
        return userSerivce.getAllusers();
    }

   // @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") String userName){
        return userSerivce.getUser(userName);
    }

    @PostMapping("/add")
    public User addUser(@RequestBody  User user){
        return userSerivce.adduser(user);
    
    }


}

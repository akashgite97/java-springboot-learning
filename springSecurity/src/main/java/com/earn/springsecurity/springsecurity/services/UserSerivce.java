package com.earn.springsecurity.springsecurity.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.earn.springsecurity.springsecurity.models.User;

@Service
public class UserSerivce {
    
    List<User> userList = new ArrayList<>();

    public UserSerivce() {
        userList.add(new User("root","root","root@gmail.com"));
        userList.add(new User("abc","abc","abc@gmail.com"));
    }

    public List<User> getAllusers(){
        return this.userList;
    }

    public User getUser(String userName){
        return this.userList.stream().filter((user)->user.getUserName().equals(userName)).findAny().orElse(null);
    }
    public User adduser(User user){
        this.userList.add(user);
        return user;
    }
    
}

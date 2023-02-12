package com.lcwd.User.service;

import com.lcwd.User.model.User;

import java.util.List;

public interface UserService {

    //save user

    public User saveuser(User user);

    public List<User> allUsers();

    public User user(String id);
}

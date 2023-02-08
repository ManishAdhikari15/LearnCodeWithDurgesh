package com.lcwd.User.service;

import com.lcwd.User.model.User;
import com.lcwd.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repo;

    @Override
    public User saveuser(User user) {
        return repo.save(user);
    }

    @Override
    public List<User> allUsers() {
        return repo.findAll();
    }

    @Override
    public Optional<User> user(String id) {
        return repo.findById(id);
    }
}

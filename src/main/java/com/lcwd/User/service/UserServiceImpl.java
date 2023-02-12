package com.lcwd.User.service;

import com.lcwd.User.exception.ResourceNotFoundException;
import com.lcwd.User.model.User;
import com.lcwd.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repo;

    @Override
    public User saveuser(User user) {
        String randomUserId= UUID.randomUUID().toString();
        user.setId(randomUserId);
        return repo.save(user);
    }

    @Override
    public List<User> allUsers() {
        return repo.findAll();
    }

    @Override
    public User user(String id) {
        return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("user id not availabele"));
    }
}

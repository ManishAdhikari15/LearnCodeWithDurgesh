package com.lcwd.User.repository;

import com.lcwd.User.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String>{
}

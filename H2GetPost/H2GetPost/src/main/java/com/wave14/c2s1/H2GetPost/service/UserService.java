package com.wave14.c2s1.H2GetPost.service;

import com.wave14.c2s1.H2GetPost.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUsers();
}

package com.coffee.shop.api.service;

import com.coffee.shop.api.entity.User;
import com.coffee.shop.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void addNewUser(User s) {
        Optional<User> userByEmail = userRepository.findByEmail(s.getEmail());
        if(userByEmail.isPresent()) {
            throw new IllegalStateException("Email is already taken!");
        }
        userRepository.save(s);
    }

    public User getUser(Long userId) {
        return userRepository.findById(userId).orElseThrow(
                () -> new IllegalStateException("User with ID : " + userId + " Does not exist!")
        );
    }


}

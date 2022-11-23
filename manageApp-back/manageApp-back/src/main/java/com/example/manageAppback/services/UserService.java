package com.example.manageAppback.services;

import com.example.manageAppback.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.manageAppback.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return this.userRepository.findAll();
    }

    public User getByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    public void addUser(User newUser) {
        this.userRepository.save(newUser);
    }
}

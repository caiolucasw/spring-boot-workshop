package com.caiosilveira.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiosilveira.course.entities.User;
import com.caiosilveira.course.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();

    }

    public User findById(Long id) {
        return repository.findById(id).get();
    }
    
}

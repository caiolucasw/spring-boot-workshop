package com.caiosilveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiosilveira.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}

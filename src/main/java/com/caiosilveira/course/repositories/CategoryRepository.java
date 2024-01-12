package com.caiosilveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiosilveira.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}

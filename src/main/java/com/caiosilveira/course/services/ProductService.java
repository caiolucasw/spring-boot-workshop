package com.caiosilveira.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiosilveira.course.entities.Product;
import com.caiosilveira.course.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    public Product findById(Long id) {
        return this.productRepository.findById(id).get();
    }
}

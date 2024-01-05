package com.caiosilveira.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.caiosilveira.course.entities.Order;
import com.caiosilveira.course.repositories.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository repository;

    public Order findById(Long id) {
        return repository.findById(id).get();
    }

    public List<Order> findAll() {
        return repository.findAll();
    }
}

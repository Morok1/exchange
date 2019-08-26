package com.smagin.exchange.exchange.service;

import com.smagin.exchange.exchange.model.Order;
import com.smagin.exchange.exchange.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> getAll(){
        return repository.findAll();
    }

}

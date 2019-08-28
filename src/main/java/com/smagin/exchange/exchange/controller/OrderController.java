package com.smagin.exchange.exchange.controller;

import com.smagin.exchange.exchange.dto.OrderDto;
import com.smagin.exchange.exchange.model.Order;
import com.smagin.exchange.exchange.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService service;

    @GetMapping("/orders")
    public List<OrderDto> orders(){
        return service.getAll();
    }
}

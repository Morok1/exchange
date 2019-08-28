package com.smagin.exchange.exchange.service;

import com.smagin.exchange.exchange.converters.OrderConterter;
import com.smagin.exchange.exchange.dto.OrderDto;
import com.smagin.exchange.exchange.repository.OrderRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log
public class OrderService {
    private OrderRepository repository;
    private OrderConterter converter;

    @Autowired
    public OrderService(OrderRepository repository, OrderConterter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    public List<OrderDto> getAll(){
        log.info("Orders " + repository.findAll());
        return repository.findAll().stream().map(s -> converter.convert(s)).collect(Collectors.toList());
    }

}

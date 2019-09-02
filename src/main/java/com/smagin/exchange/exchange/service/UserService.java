package com.smagin.exchange.exchange.service;

import com.smagin.exchange.exchange.converters.UserConverter;
import com.smagin.exchange.exchange.dto.UserDto;
import com.smagin.exchange.exchange.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private UserRepository repository;
    private UserConverter converter;

    @Autowired
    public UserService(UserRepository repository, UserConverter converter) {
        this.repository = repository;
    }

    public List<UserDto> findAll(){
        return repository.findAll().stream().map(s -> converter.convert(s)).collect(Collectors.toList());
    }
}

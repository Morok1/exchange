package com.smagin.exchange.exchange.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class OrderDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

}

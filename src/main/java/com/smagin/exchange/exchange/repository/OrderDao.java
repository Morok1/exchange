package com.smagin.exchange.exchange.repository;

import com.smagin.exchange.exchange.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
@Profile("dao")
public class OrderDao {
    private JdbcTemplate jdbcTemplate;
    private final static String SELECT_ALL = "SELECT * FROM ORDERR";

    @Autowired
    public OrderDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Order> findAll(){
           return jdbcTemplate.query(SELECT_ALL, new OrderRawMapper());
    }


    public class OrderRawMapper implements RowMapper<Order>{

        @Override
        public Order mapRow(ResultSet rs, int i) throws SQLException {
            Order order =  new Order();
            order.setId((long) rs.getInt("ID"));
            order.setNumber(rs.getLong("NUMBER"));
            order.setPrice(rs.getBigDecimal("PRICE"));
            order.setVolume(rs.getLong("VOLUME"));
            return order;
        }
    }
}

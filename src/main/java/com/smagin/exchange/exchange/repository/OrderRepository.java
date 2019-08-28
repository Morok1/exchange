package com.smagin.exchange.exchange.repository;

import com.smagin.exchange.exchange.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAll();

    Optional<Order> findById(@Param("id") Long id);
}

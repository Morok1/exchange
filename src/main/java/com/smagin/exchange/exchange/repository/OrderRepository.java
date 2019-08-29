package com.smagin.exchange.exchange.repository;

import com.smagin.exchange.exchange.model.Order;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

@Profile("nodao")
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAll();

    Optional<Order> findById(@Param("id") Long id);
}

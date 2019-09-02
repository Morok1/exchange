package com.smagin.exchange.exchange.repository;

import com.smagin.exchange.exchange.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

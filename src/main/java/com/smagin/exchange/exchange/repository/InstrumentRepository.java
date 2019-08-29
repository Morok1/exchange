package com.smagin.exchange.exchange.repository;

import com.smagin.exchange.exchange.model.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstrumentRepository extends JpaRepository<Instrument, Long> {
    List<Instrument> findAll();
}

package com.smagin.exchange.exchange.service;

import com.smagin.exchange.exchange.converters.InstrumentConverter;
import com.smagin.exchange.exchange.dto.InstrumentDTO;
import com.smagin.exchange.exchange.model.Instrument;
import com.smagin.exchange.exchange.repository.InstrumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InstrumentService {
    private InstrumentRepository repository;
    private InstrumentConverter converter;

    @Autowired
    public InstrumentService(InstrumentRepository repository, InstrumentConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    public List<InstrumentDTO> findAll(){
        return repository.findAll().stream().map(s->converter.convert(s)).collect(Collectors.toList());
    }
}

package com.smagin.exchange.exchange.controller;

import com.smagin.exchange.exchange.dto.InstrumentDTO;
import com.smagin.exchange.exchange.service.InstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InstrumentController {
    private InstrumentService service;

    @Autowired
    public InstrumentController(InstrumentService service) {
        this.service = service;
    }
    @GetMapping("/instruments")
    public List<InstrumentDTO> findAll(){
        return service.findAll();
    }
}

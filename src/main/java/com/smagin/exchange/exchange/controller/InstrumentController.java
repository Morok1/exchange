package com.smagin.exchange.exchange.controller;

import com.smagin.exchange.exchange.dto.InstrumentDTO;
import com.smagin.exchange.exchange.service.InstrumentService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log
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

    @ExceptionHandler(value = Exception.class)
    public void handleException(Exception e){
        log.info("Cause of exception " + e.getCause());
    }
}

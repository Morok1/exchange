package com.smagin.exchange.exchange.converters;

import com.smagin.exchange.exchange.converters.api.Converter;
import com.smagin.exchange.exchange.dto.InstrumentDTO;
import com.smagin.exchange.exchange.model.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class InstrumentConverter implements Converter<Instrument, InstrumentDTO> {
    private OrderConterter converter;

    @Autowired
    public InstrumentConverter(OrderConterter converter) {
        this.converter = converter;
    }

    @Override
    public InstrumentDTO convert(Instrument it) {
        InstrumentDTO dto = new InstrumentDTO();

        dto.setId(it.getId());
        dto.setOrders(it
                .getOrders()
                .stream()
                .map(s-> converter.convert(s))
                .collect(Collectors.toList()));
        dto.setStatusBlocking(it.getStatusBlocking());

        return dto;
    }
}

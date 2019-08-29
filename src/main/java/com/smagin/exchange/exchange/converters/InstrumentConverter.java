package com.smagin.exchange.exchange.converters;

import com.smagin.exchange.exchange.converters.api.Converter;
import com.smagin.exchange.exchange.dto.InstrumentDTO;
import com.smagin.exchange.exchange.model.Instrument;
import org.springframework.stereotype.Component;

@Component
public class InstrumentConverter implements Converter<Instrument, InstrumentDTO> {

    @Override
    public InstrumentDTO convert(Instrument it) {
        InstrumentDTO dto = new InstrumentDTO();

        dto.setId(it.getId());
        dto.setOrders(it.getOrders());
        dto.setStatusBlocking(it.getStatusBlocking());

        return dto;
    }
}

package com.smagin.exchange.exchange.converters;

import com.smagin.exchange.exchange.dto.OrderDto;
import com.smagin.exchange.exchange.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderConterter implements Converter<Order, OrderDto> {

    @Override
    public OrderDto convert(Order order) {
        OrderDto dto = new OrderDto();

        dto.setId(order.getId());
        dto.setNumber(order.getNumber());
        dto.setVolume(order.getVolume());
        dto.setPrice(order.getPrice());

        return dto;
    }
}

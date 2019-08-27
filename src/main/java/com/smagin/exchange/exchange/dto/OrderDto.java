package com.smagin.exchange.exchange.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderDto {
    private Long id;

    private Long volume;

    private BigDecimal price;

    private Long number;
}

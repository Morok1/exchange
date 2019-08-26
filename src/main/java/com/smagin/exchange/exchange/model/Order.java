package com.smagin.exchange.exchange.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity(name = "ORDER")
@Data
public class Order {
    @Id
    private Long id;

    @Column(name = "volume")
    private Long volume;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "number")
    private Long number;

}

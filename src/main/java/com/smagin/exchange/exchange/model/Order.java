package com.smagin.exchange.exchange.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "ORDERR")
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

    @ManyToOne
    @JoinColumn(name="order_id")
    private Instrument instrument;
}

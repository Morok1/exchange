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

    @ManyToOne(optional = false,  cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Instrument instrument;

}

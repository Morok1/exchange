package com.smagin.exchange.exchange.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Instrument")
public class Instrument {

    @Id
    private Long id;

    @Column(name = "STATUS_BLOCKING")
    private Integer statusBlocking;

    @OneToMany(mappedBy = "instrument")
    private List<Order>  orders;
}
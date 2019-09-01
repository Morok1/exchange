package com.smagin.exchange.exchange.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity(name = "Instrument")
@Data
public class Instrument {
    @Id
    @NotEmpty
    private Long id;

    @Column(name = "STATUS_BLOCKING")
    private Integer statusBlocking;

    @OneToMany(mappedBy = "instrument")
    private List<Order>  orders;
}

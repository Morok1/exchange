package com.smagin.exchange.exchange.dto;

import com.smagin.exchange.exchange.model.Order;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
public class InstrumentDTO {
    private Long id;

    private Integer statusBlocking;

    private List<Order> orders;

}

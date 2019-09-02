package com.smagin.exchange.exchange.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "AUSER")
@Data
public class User {
    @Id
    private Long id;

    @Column(name = "NAME")
    private String name;

}

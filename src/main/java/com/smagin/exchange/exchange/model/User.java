package com.smagin.exchange.exchange.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "AUSER")
public class User {
    @Id
    private Long id;

    @Column(name = "NAME")
    private String name;

}

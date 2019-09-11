package com.gpch.login.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "master")
public class Master {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_id")
    private int itemId;

    @Column(name = "item_name")
    @NotEmpty(message = "*Please provide your item_name")
    private String itemName;

    @Column(name = "price")
    @NotEmpty(message = "*Please provide your price")
    private int price;

    @Column(name = "rate")
    @Max(1)
    @Min(0)
    private double rate;

}

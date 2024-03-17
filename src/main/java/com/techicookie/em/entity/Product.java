package com.techicookie.em.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private String category;
    private double price;
    private int quantity;
    private String group;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}

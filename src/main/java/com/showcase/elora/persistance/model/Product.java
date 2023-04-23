package com.showcase.elora.persistance.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name="shop_id")
    private String shopId;
    @Column(name="category_id")
    private String categoryId;
    private String name;
    private double price;
    private int stock;
    private String description;
}

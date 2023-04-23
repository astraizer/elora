package com.showcase.elora.persistance.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "product_images")
@Data
public class ProductImage {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name="product_id")
    private String productId;
    private int priority;
}

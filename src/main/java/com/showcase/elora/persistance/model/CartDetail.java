package com.showcase.elora.persistance.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "cart_details")
@Data
public class CartDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name="user_id")
    private String userId;
    @Column(name="product_id")
    private String productId;
}

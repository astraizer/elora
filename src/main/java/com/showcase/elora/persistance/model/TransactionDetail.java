package com.showcase.elora.persistance.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;


@Entity
@Table(name = "transaction_details")
@Data
public class TransactionDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name="transaction_id")
    private String transactionId;
    @Column(name="product_id")
    private String productId;
    private int quantity;
    private double price;
}

package com.showcase.elora.persistance.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;


@Entity
@Table(name = "transactions")
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String status;
    private Date date;
    private String payment;
    private String invoiceNumber;
    private String paymentAccount;
    private String address;
}

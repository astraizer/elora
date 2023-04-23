package com.showcase.elora.persistance.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "shops")
@Data
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    @Column(name="owner_id")
    private String ownerId;
    @Column(name="logo_path")
    private String logoPath;
    private String password;
}

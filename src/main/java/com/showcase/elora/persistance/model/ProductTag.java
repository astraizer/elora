package com.showcase.elora.persistance.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "product_tags")
@Data
public class ProductTag {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name="product_id")
    private String productId;
    @Column(name="tag_id")
    private String tagId;

}

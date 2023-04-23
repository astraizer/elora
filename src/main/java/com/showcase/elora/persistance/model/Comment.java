package com.showcase.elora.persistance.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "comments")
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String comment;
    @Column(name="user_id")
    private String userId;
    @Column(name="product_id")
    private String productId;
    @Column(name="comment_id")
    private String comment_id;
}

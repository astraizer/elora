package com.showcase.elora.persistance.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "advertisement")
@Data
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name="target_url")
    private String targetUrl;
    @Column(name="click_count")
    private String clickCount;

}

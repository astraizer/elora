package com.showcase.elora.persistance.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "tags")
@Data
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;

}

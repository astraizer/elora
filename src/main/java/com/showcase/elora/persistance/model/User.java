package com.showcase.elora.persistance.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    @Column(name="role_id")
    private String roleId;
    private String email;
    private String password;
}

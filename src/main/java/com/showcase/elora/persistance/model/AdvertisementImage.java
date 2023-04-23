package com.showcase.elora.persistance.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "advertisement_images")
@Data
public class AdvertisementImage {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name="advertisement_id")
    private String advertisementId;
    @Column(name="image_path")
    private String imagePath;

}

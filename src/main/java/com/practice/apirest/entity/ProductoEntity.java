package com.practice.apirest.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Double price;

}

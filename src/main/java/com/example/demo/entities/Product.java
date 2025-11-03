package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "product", schema = "slaughter_house")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //TODO [Reverse Engineering] generate columns from DB
}
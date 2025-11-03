package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "animal", schema = "slaughter_house")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "origin", length = 50)
    private String origin;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "type", length = 20)
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
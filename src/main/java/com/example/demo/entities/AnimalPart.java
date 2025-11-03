package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "animal_part", schema = "slaughter_house")
public class AnimalPart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "typepart", length = 20)
    private String typepart;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "animal_id")
    private Animal animal;

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

    public String getTypepart() {
        return typepart;
    }

    public void setTypepart(String typepart) {
        this.typepart = typepart;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

}
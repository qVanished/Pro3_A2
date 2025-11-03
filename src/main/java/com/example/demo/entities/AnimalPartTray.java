package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "animal_part_tray", schema = "slaughter_house")
public class AnimalPartTray {
    @Id
    @Column(name = "animal_part_id", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "animal_part_id", nullable = false)
    private AnimalPart animalPart;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tray_id")
    private Tray tray;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AnimalPart getAnimalPart() {
        return animalPart;
    }

    public void setAnimalPart(AnimalPart animalPart) {
        this.animalPart = animalPart;
    }

    public Tray getTray() {
        return tray;
    }

    public void setTray(Tray tray) {
        this.tray = tray;
    }

}
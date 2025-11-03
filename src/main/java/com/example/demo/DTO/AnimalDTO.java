package com.example.demo.DTO;

import com.example.demo.entities.Animal;

import java.time.LocalDate;

public class AnimalDTO {
    private int id;
    private LocalDate date;
    private int weight;
    private String origin;

    public AnimalDTO() {

    }

    public AnimalDTO(int id, LocalDate date, int weight, String origin) {
        this.id = id;
        this.date = date;
        this.weight = weight;
        this.origin = origin;
    }

    public AnimalDTO(Animal animal) {
        this(animal.getId(), animal.getDate(), animal.getWeight(), animal.getOrigin());
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}

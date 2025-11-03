package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "product_part", schema = "slaughter_house")
public class ProductPart {
    @EmbeddedId
    private ProductPartId id;

    @MapsId("productId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @MapsId("animalPartId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "animal_part_id", nullable = false)
    private AnimalPart animalPart;

    public ProductPartId getId() {
        return id;
    }

    public void setId(ProductPartId id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public AnimalPart getAnimalPart() {
        return animalPart;
    }

    public void setAnimalPart(AnimalPart animalPart) {
        this.animalPart = animalPart;
    }

}
package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProductPartId implements Serializable {
    private static final long serialVersionUID = 124942353211463439L;
    @Column(name = "product_id", nullable = false)
    private Integer productId;

    @Column(name = "animal_part_id", nullable = false)
    private Integer animalPartId;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getAnimalPartId() {
        return animalPartId;
    }

    public void setAnimalPartId(Integer animalPartId) {
        this.animalPartId = animalPartId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductPartId entity = (ProductPartId) o;
        return Objects.equals(this.animalPartId, entity.animalPartId) &&
                Objects.equals(this.productId, entity.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalPartId, productId);
    }

}
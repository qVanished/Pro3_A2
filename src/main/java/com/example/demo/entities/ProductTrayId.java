package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProductTrayId implements Serializable {
    private static final long serialVersionUID = 5342673828667493250L;
    @Column(name = "product_id", nullable = false)
    private Integer productId;

    @Column(name = "tray_id", nullable = false)
    private Integer trayId;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getTrayId() {
        return trayId;
    }

    public void setTrayId(Integer trayId) {
        this.trayId = trayId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductTrayId entity = (ProductTrayId) o;
        return Objects.equals(this.productId, entity.productId) &&
                Objects.equals(this.trayId, entity.trayId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, trayId);
    }

}
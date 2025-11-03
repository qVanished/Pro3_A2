package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "product_tray", schema = "slaughter_house")
public class ProductTray {
    @EmbeddedId
    private ProductTrayId id;

    @MapsId("productId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @MapsId("trayId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tray_id", nullable = false)
    private Tray tray;

    public ProductTrayId getId() {
        return id;
    }

    public void setId(ProductTrayId id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Tray getTray() {
        return tray;
    }

    public void setTray(Tray tray) {
        this.tray = tray;
    }

}
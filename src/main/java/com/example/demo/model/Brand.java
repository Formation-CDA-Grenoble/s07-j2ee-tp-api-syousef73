package com.example.demo.model;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "brand")
@EntityListeners(AuditingEntityListener.class)
public class Brand {

    private final int brandId = 0;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "serial_number", nullable = false)
    private String serialNumber;

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Column(name = "description", nullable = false)
    private String description;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "picture", nullable = false)
    private String picture;

    public String getPicture() {
        return this.picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Column(name = "product_id", nullable = false)
    private int ProductId;
    
    public int getProductId() {
        return this.brandId;
    }

    public void setProductId(int productId) {
    }
    
}

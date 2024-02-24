package com.example.SuperShop.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor

public class Product {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productID;
    private String proName;
    private String proDescriptive;
    private Long proStock;
    private String proBarcode;
    private Long costPrice;
    private Long sellingPrice;
    private boolean status;


    private String createdBY;
    @CreationTimestamp
    private LocalDateTime createdAT;
    private String updatedBY;

    @UpdateTimestamp
    private LocalDateTime updatedAT;
    private boolean active;



}

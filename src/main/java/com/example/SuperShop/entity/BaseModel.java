package com.example.SuperShop.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

public class BaseModel {


    private String createdBY;
    @CreationTimestamp
    private LocalDateTime createdAT;
    private String updatedBY;

    @UpdateTimestamp
    private LocalDateTime updatedAT;
    private boolean active;

}

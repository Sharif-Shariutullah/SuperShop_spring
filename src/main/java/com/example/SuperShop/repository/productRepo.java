package com.example.SuperShop.repository;

import com.example.SuperShop.entity.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepo extends JpaRepository<product, Long> {



}

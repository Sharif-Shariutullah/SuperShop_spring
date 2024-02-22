package com.example.SuperShop.service;


import com.example.SuperShop.entity.product;
import com.example.SuperShop.repository.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class poroductService {

    @Autowired
    public productRepo repo;


//  to see Data

    public List<product> getAllData() {

        return repo.findAll();
    }


// save data

    public product save(product product) {
        return repo.save(product);
    }

    ;

// Delete Data
    public void deleteData(Long id) {
        repo.deleteById(id);
    }

    ;

//    get Data By ID

    public product getDataByID(Long id) {

        return repo.findById(id).get();
    }

    ;


    // Update

    public product update(Long id, product product) {
        product.setProductID(id);

        return repo.save(product);
    };



}

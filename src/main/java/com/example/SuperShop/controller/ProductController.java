package com.example.SuperShop.controller;

import com.example.SuperShop.entity.product;
import com.example.SuperShop.service.poroductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/pro")
@CrossOrigin(value = "http://localhost:4200/", allowCredentials = "true")
public class ProductController {

    @Autowired
    public poroductService service;


//    public product service;


    //Read

//    @GetMapping
//    public List<product> getData() {
//
//        List<product> products = new ArrayList<>();
//        products = service.getAllData();
//
//        return products;
//    }    ;



//    // Create
//    @PostMapping
//    public product addData(@RequestBody product product) {
//
//        return service.save(product);
//    }
//
//    ;
//
//
////get by ID
//
//
//    @GetMapping("/{id}")
//    public product getDataByID(@PathVariable("id") Long id) {
//
//        return service.getDataByID(id);
//    }
//
//
//    //Edit_Update
//
//
//    @PutMapping
//    public product updateData(@RequestBody product product) {
//
//        return service.save(product);
//    }
//
//
////Delete data
//
//    @DeleteMapping("/{id}")
//    public void deleteByID(@PathVariable("id") Long id) {
//
//        service.deleteData(id);
//    }






// save
    @PostMapping("/add")
    public ResponseEntity<?> save(@RequestBody product product) {

        return ResponseEntity.ok(service.save(product));
    }    ;


// Read
    @GetMapping
    public ResponseEntity<?> GetAll() {

        return ResponseEntity.ok(service.getAllData());
    } ;


    //Update
    @PutMapping("/{id}")
    public ResponseEntity<?> Update(@PathVariable("id") Long id, @RequestBody product product) {

          return ResponseEntity.ok(service.update(id, product));
    } ;



    //Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<?> Delete(@PathVariable("id") Long id) {

        service.deleteData(id);
        return ResponseEntity.ok("Delete Sucessfull!!!");
    } ;





}

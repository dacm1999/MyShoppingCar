package com.dacm.shopping_car.controller;

import com.dacm.shopping_car.model.Producto;
import com.dacm.shopping_car.persistence.ProductoDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/productos")
public class ProductoController {


    @Autowired
    ProductoDBRepository repository;



    @RequestMapping(value = "/")
    public String getName() {
        return "productos";
    }
}

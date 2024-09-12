package com.dacm.shopping_car.service;


import com.dacm.shopping_car.exception.ProductNotFoundException;
import com.dacm.shopping_car.model.Producto;

public interface IShoppingCart {
    double getBalance();

    void addItem(Producto item);

    void removeItem(Producto item)
            throws ProductNotFoundException;

    int getItemCount();

    void empty();

    void comprar();
}

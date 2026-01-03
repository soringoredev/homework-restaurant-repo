package com.example.demo.vasileHW.common;

import com.example.demo.ionwork.common.Product;

public class MenuProduct {

    private String name;
    private double price;

    public MenuProduct(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

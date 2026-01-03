package com.example.demo.ionwork.common;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class MenuComponent implements Menu {

    // set the initial menu
    @Override
    public List<Product> getMenu() {
        return List.of(
                new Product("Kebab", 120),
                new Product("Pizza", 140),
                new Product("Burger", 90)
        );
    }

    //set the discount menu
    @Override
    public List<Product> getMenuReduction() {
        return getMenu().stream()
                .map(p -> new Product(
                        p.getName(),
                        p.getPrice()*0.5
                )).toList();
    }

}

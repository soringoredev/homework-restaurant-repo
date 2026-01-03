package com.example.demo.ionwork.rest;

import com.example.demo.ionwork.common.MenuComponent;
import com.example.demo.ionwork.common.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MenuControler {

    private final MenuComponent menuComponent;

    public MenuControler(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    @GetMapping("/menu")
    public List<Product> menu() {
        return menuComponent.getMenu();
    }

    @GetMapping("/discount-menu")
    public List<Product> menuReduction() {
        return menuComponent.getMenuReduction();
    }
}

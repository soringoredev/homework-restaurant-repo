package com.example.demo.vasileHW.rest;

import com.example.demo.vasileHW.common.Menu1;
import com.example.demo.vasileHW.common.MenuProduct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuController {
    private final Menu1 menu1;
    public MenuController(Menu1 menu1){
        this.menu1 = menu1;
    }
    @GetMapping("/meniu")
    public List<MenuProduct> getMenu1() {
        return menu1.getMenu1();
    }
    @GetMapping("/meniu-reducere")
    public List<MenuProduct> getMenu1Reducere() {
        return menu1.getMenu1Reducere();
    }
}

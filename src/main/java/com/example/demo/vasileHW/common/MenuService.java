package com.example.demo.vasileHW.common;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService implements Menu1 {

    @Override
    public List<MenuProduct> getMenu1() {
        return List.of(
                new MenuProduct("Pizza", 150),
                new MenuProduct("Kebab", 90),
                new MenuProduct("Double Kebab", 180)
        );
    }
    @Override
    public List<MenuProduct> getMenu1Reducere() {
        return getMenu1()
                .stream()
                .map(MenuProduct -> new MenuProduct(
                        MenuProduct.getName(),
                        MenuProduct.getPrice() * 0.5
                ))
                .toList();
//        return List.of(
//                new MenuProduct("Pizza",130), // -20%
//                new MenuProduct("Kebab",75) // -15
//        )
    }
}

package com.devsenior;

import java.util.ArrayList;
import java.util.List;

public class CarShopping {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public boolean isVacio() {
        return products.isEmpty();
    }

    public void clear() {
        products.clear();
    }
}

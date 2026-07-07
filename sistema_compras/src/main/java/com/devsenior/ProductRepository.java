package com.devsenior;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {
    private Map<String, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public Product getProductById(String id) {
        return products.get(id);
    }
}

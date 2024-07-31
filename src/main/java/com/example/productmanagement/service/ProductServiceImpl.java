package com.example.productmanagement.service;

import com.example.productmanagement.model.Product;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Pen", 10));
        products.put(2, new Product(2, "Pencil", 5));
        products.put(3, new Product(3, "Rubber", 5));
        products.put(4, new Product(4, "Note", 20));
        products.put(5, new Product(5, "Notebook", 15));
        products.put(6, new Product(6, "Ruler", 10));
    }

    @Override
    public List<Product> findAll() {
        return Collections.emptyList();
    }

    @Override
    public void create(Product product) {

    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }
}

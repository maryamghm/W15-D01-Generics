package org.dci;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository<T> {
    private List<T> products;

    public ProductRepository() {
        this.products = new ArrayList<>();
    }

    public void addProduct(T product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }

        products.add(product);
        System.out.println("Product added successfully.");
    }

    public void removeProduct(T product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        if (products.isEmpty()) {
            System.out.println("Product List is empty");
            return;
        }

        products.remove(product);
        System.out.println("Product was successfully removed from the list");
    }

    public List<T> getAllProducts() {
        return products;
    }

}

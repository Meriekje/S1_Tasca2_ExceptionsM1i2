package org.example.nivell1;

import java.util.ArrayList;
import java.util.List;

public class Sale {

    private List<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void calculateTotal() throws EmptySaleException {
        if (products.isEmpty()) {
            throw new EmptySaleException();
        }
        totalPrice=0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        System.out.println("The total price is: " + totalPrice + "€");
    }

}

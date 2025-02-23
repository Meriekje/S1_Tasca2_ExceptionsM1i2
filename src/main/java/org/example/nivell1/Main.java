package org.example.nivell1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();

        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        sale.addProduct(new Product("Computer", 500.002));
        sale.addProduct(new Product("Mouse", 10.2));
        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        try {
            System.out.println(numbers.get(0));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Access out of the list limits");
        }
    }

}
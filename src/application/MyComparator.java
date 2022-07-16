package application;

import entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {


    @Override
    public int compare(Product prod1, Product prod2) {
        return prod1.getName().toUpperCase().compareTo(prod2.getName().toUpperCase());
    }
}

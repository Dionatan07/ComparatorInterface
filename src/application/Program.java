package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {


        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 400.00));
        list.add(new Product("Refrigerator", 600.00 ));
        list.add(new Product("Sofa", 2000.00 ));

        list.sort(new MyComparator());


        for (Product p : list){
            System.out.println("Product: " + p.getName() + ", Price: " + String.format("%.2f", p.getPrice()));
        }
    }
}

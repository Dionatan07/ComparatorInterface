package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        String filePath = "C:\\temp\\products.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line = br.readLine();

            while (line != null){
                String[] fields = line.split(";");

                String name = fields[0];
                double price = Double.parseDouble(fields[1]);

                Product product = new Product(name, price);

                list.add(product);

                line = br.readLine();

            }

            list.sort(new MyComparator());


            for (Product p : list) {
                System.out.println("Product: " + p.getName() + ", Price: " + String.format("%.2f", p.getPrice()));
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

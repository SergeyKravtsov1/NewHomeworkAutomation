package org.Homework2;

import java.util.ArrayList;
import java.util.List;

public class Product {

    public static void main(String[] args) {
        Product product = new Product("prod1", 3);
        Product product2 = new Product("prod2",4);
        Product product3 = new Product("prod3",11);

        List<Product> list = new ArrayList<>();
        list.add(product);
        list.add(product2);
        list.add(product3);

        }

    private String name;
    private int price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
   }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setPrice(int price) {
        this.price = price;


        }
    }



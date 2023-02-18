package org.Homework2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ProductMarket extends Product{


    private List<Product> product;


    public ProductMarket(List<Product> product) {
        this.product = product;
    }


    public Product getNames() {
        List<Product> names = new ArrayList<>();
        for (Product b : product) {
            names.add(b.getName());
        }
        return names;

        public List<String> getNames () {
            List<Product> names = new ArrayList<>();
            for (Product b : product) {
                names.add(b.getName());
            }
            Collections.sort(names);
            return names;
        }
        public List<String> getNames () {
            List<Product> names = new ArrayList<>();
            for (Product b : product) {
                if (b.getPrice() > 10) ;
            }
            return names;


        }
        public List<String> getNames () {
            List<Product> names = new ArrayList<>();
            for (Product b : product) {
                if (b.getPrice() < 5) ;
            }
            return names;

        }
        public Product getNames () {
            List<Product> names = new ArrayList<>();
            int k = 10;
            for (Product b : product) {
                names.add(b.getName());
                Integer.toString(k);
            }
            return names;
        }
    }
}




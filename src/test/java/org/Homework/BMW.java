package org.Homework;

public class BMW extends Car {

   private int years;
   private String type;

    public BMW(String color, int speed, double price, int years, String type) {
        super(color, speed, price);
        this.years = years;
        this.type = type;
    }

    @Override
    public Object getDescription() {
        return "BMW:" + getSpeed() + type;
    }

    public void  calculatePrice() {
            double price = getPrice();
            for (int i = 0; i < years; i++) {
                price += 1;
            }
            setPrice(price);


       }
    }


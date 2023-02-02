package org.Homework;

public abstract class Car {

  private  String color;
  private  int speed;
  private  double price;

    public interface Drive {
        void drive();
    }

    public Car(String color, int speed, double price) {
        this.color = color;
        this.speed = speed;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }
    public abstract Object drive();
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }
}




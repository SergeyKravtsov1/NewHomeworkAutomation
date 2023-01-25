package org.example;

import com.sun.source.tree.ContinueTree;

public class Cat {
    private String name;
    private int age;
    private int weight;



    public String getName() {
        return name;


    }

    public void setName(String name) {
        this.name = name;
        if (name == "Empty") {
            System.out.println("Wrong number");
        }
    }

    public int getAge() {
        return age;

        }


    public void setAge(int age) {
        this.age = age;
        if (age <= 0) {
            System.out.println("Wrong number");
        }
    }

    public int getWeight() {
        return weight;

    }

    public void setWeight(int weight) {
        this.weight = weight;
        if (weight <= 0) {
            System.out.println("Wrong number");
        }
        }




    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    }


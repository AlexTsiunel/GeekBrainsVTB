package main.java.com.geekbrains.lesson1.homework;

import main.java.com.geekbrains.lesson1.homework.animals.*;

public class startApp {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Sharik", 200, 20),
                new Dog("Bobik", 220, 18),
                new Dog("Mukhtar", 180, 22),
                new HomeCat("Murzik", 150),
                new HomeCat("Barsik", 120),
                new Tiger("Sherkhan", 500, 15)

        };

        for (Animal animal : animals) {
            animal.run(200);
            animal.swim(15);
        }
        System.out.println("Animals total - " + Animal.getCount());
        System.out.println("Dogs total - " + Dog.getCount());
        System.out.println("Cats total - " + Cat.getCount());
        System.out.println("Home Cats total - " + HomeCat.getCount());
        System.out.println("Tigers total - " + Tiger.getCount());
    }
}

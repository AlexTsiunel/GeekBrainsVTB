package main.java.com.geekbrains.lesson4.homework.homework_3;

import main.java.com.geekbrains.lesson4.homework.homework_3.fruits.Apple;
import main.java.com.geekbrains.lesson4.homework.homework_3.fruits.Orange;

public class AppStart {
    public static void main(String[] args) {
        Apple apple1 = new Apple(1.0f);
        Apple apple2 = new Apple(1.1f);
        Apple apple3 = new Apple(0.9f);
        Apple apple4 = new Apple(1.2f);
        Apple apple5 = new Apple(0.9f);

        Orange orange1 = new Orange(1.4f);
        Orange orange2 = new Orange(1.2f);
        Orange orange3 = new Orange(1.1f);
        Orange orange4 = new Orange(1.2f);
        Orange orange5 = new Orange(1.0f);

        Box<Apple> appleBox = new Box<>();
        appleBox.putFruit(apple1, apple2, apple3);

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.putFruit(apple4, apple5);

        Box<Orange> orangeBox = new Box<>();
        orangeBox.putFruit(orange1, orange2, orange3, orange4, orange5);

//        System.out.println(appleBox.compare(appleBox));
//        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());

        appleBox.transfer(appleBox);

        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());

    }
}

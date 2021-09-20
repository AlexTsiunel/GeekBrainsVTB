package main.java.com.geekbrains.lesson1.homework.animals;

public class Dog extends Animal {
    public static int count;
    public Dog(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        count++;
    }

    public static int getCount() {
        return count;
    }
}

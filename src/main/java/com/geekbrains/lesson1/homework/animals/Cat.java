package main.java.com.geekbrains.lesson1.homework.animals;

public abstract class Cat extends Animal {
    private static int count;
    public Cat(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        count++;
    }

    public static int getCount() {
        return count;
    }
}

package main.java.com.geekbrains.lesson1.homework.animals;

public class HomeCat extends Cat {
    private static int count;
    public HomeCat(String name, int maxRunDistance) {
        super(name, maxRunDistance, 0);
        count++;
    }

    public static int getCount() {
        return count;
    }
}

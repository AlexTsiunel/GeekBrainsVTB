package main.java.com.geekbrains.lesson1.homework.animals;

public class Tiger extends Cat {
    private static int count;
    public Tiger(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        count++;
    }

    public static int getCount() {
        return count;
    }
}

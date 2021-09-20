package main.java.com.geekbrains.lesson1.homework.animals;

public abstract class Animal {
    private  String type;
    private String name;
    private int maxRunDistance;
    private int maxSwimDistance;
    private static int count;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.type = this.getClass().getSimpleName();
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        count++;
    }

    public void swim(int swimDistance) {
        if (maxSwimDistance == 0) {
            System.out.println(type + " " + name + " can't swim");
            return;
        }
        if(maxSwimDistance >= swimDistance)
            System.out.println(type + " " + name + " swam a distance of " + swimDistance + " m");
        else
            System.out.println(type + " " + name + " couldn't swim a distance of " + swimDistance + " m");
    }

    public void run (int runDistance) {
        if (maxRunDistance == 0) {
            System.out.println(type + " " + name + " can't run");
            return;
        }
        if(maxRunDistance >= runDistance)
            System.out.println(type + " " + name + " ran a distance of " + runDistance + " m");
        else
            System.out.println(type + " " + name + " couldn't run a distance of " + runDistance + " m");
    }

    public String getName() {
        return name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    public static int getCount() {
        return count;
    }
}

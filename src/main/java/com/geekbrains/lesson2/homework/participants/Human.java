package main.java.com.geekbrains.lesson2.homework.participants;

import main.java.com.geekbrains.lesson2.homework.participants.interfaces.Participant;

public class Human implements Participant {
    private String type;
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        this.type = this.getClass().getSimpleName();
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    @Override
    public boolean jump(int height) {
        if (maxJumpHeight >= height) {
            System.out.println(type + " " + name + " jumped over the wall");
            return true;
        } else {
            System.out.println(type + " " + name + " didn't jump over the wall. Leaves the race");
            return false;
        }
    }

    @Override
    public boolean run(int distance) {

        if (maxRunDistance >= distance) {
            System.out.println(type + " " + name + " ran the treadmill");
            return true;
        }
        else {
            System.out.println(type + " " + name + " didn't run the treadmill. Leaves the race");
            return false;
        }
    }
}

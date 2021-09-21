package main.java.com.geekbrains.lesson2.homework.obstacles;

import main.java.com.geekbrains.lesson2.homework.obstacles.interfaces.Obstacle;
import main.java.com.geekbrains.lesson2.homework.participants.interfaces.Participant;

public class Treadmill implements Obstacle {
    private String name;
    private int lengthTreadmill;

    public Treadmill(String name, int lengthTreadmill) {
        this.name = name;
        this.lengthTreadmill = lengthTreadmill;
    }

    public String getName() {
        return name;
    }

    public int getLengthTreadmill() {
        return lengthTreadmill;
    }

    @Override
    public boolean isObstaclePassed(Participant participant) {
        return participant.run(lengthTreadmill);
    }
}


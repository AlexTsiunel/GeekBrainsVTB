package main.java.com.geekbrains.lesson2.homework.obstacles;

import main.java.com.geekbrains.lesson2.homework.obstacles.interfaces.Obstacle;
import main.java.com.geekbrains.lesson2.homework.participants.interfaces.Participant;

public class Wall implements Obstacle {
    private  String name;
    private int heightWall;

    public Wall(String name, int heightWall) {
        this.name = name;
        this.heightWall = heightWall;
    }

    public String getName() {
        return name;
    }

    public int getHeightWall() {
        return heightWall;
    }

    @Override
    public boolean isObstaclePassed(Participant participant) {
        return participant.jump(heightWall);
    }
}

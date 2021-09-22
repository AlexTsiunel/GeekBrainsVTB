package main.java.com.geekbrains.lesson2.homework;

import main.java.com.geekbrains.lesson2.homework.obstacles.interfaces.Obstacle;
import main.java.com.geekbrains.lesson2.homework.participants.interfaces.Participant;
import main.java.com.geekbrains.lesson2.homework.obstacles.Treadmill;
import main.java.com.geekbrains.lesson2.homework.obstacles.Wall;
import main.java.com.geekbrains.lesson2.homework.participants.Cat;
import main.java.com.geekbrains.lesson2.homework.participants.Human;
import main.java.com.geekbrains.lesson2.homework.participants.Robot;

public class AppStart {
    public static void main(String[] args) {

        Participant[] participants = {
                new Cat("Vaska", 100, 5),
                new Human("Alex", 80, 8),
                new Robot("Elektronik", 120, 15)
        };

        Obstacle[] obstacles = {
                new Treadmill("Treadmill_1",50),
                new Wall("Wall_1",3),
                new Treadmill("Treadmill_2",60),
                new Wall("Wall_1",7),
                new Treadmill("Treadmill_3",110),
                new Wall("Wall_1",16)
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!(obstacle.isObstaclePassed(participant)))
                    break;
            }
        }
    }
}

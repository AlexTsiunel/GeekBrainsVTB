package main.java.com.geekbrains.lesson2.homework;

public class Human implements Runables, Jumpables {
    private String type;
    private String name;
    private int maxRunDistance;
    private  int maxJumpHeight;
    private boolean isOvercameObstacle;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        this.type = this.getClass().getSimpleName();
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.isOvercameObstacle = true;
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
    public void jump(Wall wall) {
        if (!isOvercameObstacle) return;
        if(maxRunDistance >= wall.getHeightWall())
            System.out.println(type + " " + name + " jumped over the wall");
        else {
            System.out.println(type + " " + name + " did not jump over the wall. Leaves the race");
            isOvercameObstacle = false;
        }

    }

    @Override
    public void run(Treadmill treadmill) {

    }
}

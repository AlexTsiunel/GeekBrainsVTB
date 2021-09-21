package lecture_1.homework;

public class Dog extends Animal {

    private int swimDistance;
    private static int countDog;

    public Dog(String name, int runDistance, int swimDistance) {
        super(name, runDistance);
        this.swimDistance = swimDistance;
        countDog++;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public static int getCountDog() {
        return countDog;
    }

    public void swim(int swimDistance) {
        if (swimDistance <= this.swimDistance) {
            System.out.println(this.getName() + " проплыл(а) " + swimDistance + " м");
        } else {
            System.out.println(this.getName() + " не смог(а) проплыть " + swimDistance + " м");
        }
    }
}

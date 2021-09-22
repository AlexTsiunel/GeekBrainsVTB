package lecture_1.homework;

public abstract class Animal {
    private String name;
    private int runDistance;
    private static int countAnimal;

    public Animal(String name, int runDistance) {
        this.name = name;
        this.runDistance = runDistance;
        countAnimal++;
    }

    public String getName() {
        return name;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    public void run(int runDistance) {
        if (runDistance <= this.getRunDistance()) {
            System.out.println(this.getName() + " пробежал(а) " + runDistance + " м");
        } else {
            System.out.println(this.getName() + " не смог(а) пробежать " + runDistance + " м");
        }
    }
}

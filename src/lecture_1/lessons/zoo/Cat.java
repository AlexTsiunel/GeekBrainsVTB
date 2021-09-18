package lecture_1.lessons.zoo;

public class Cat extends Animal {
    private int clawsLength;


    public Cat(String name, String color, int age, int clawsLength) {
        super(name, color, age);
        this.clawsLength = clawsLength;
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Мяу-мяу!!!");
    }

    public void catMethod() {
        System.out.println("catMethod");
    }
}

package lecture_1.lessons.zoo;

public class Dog extends Animal {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Гав-гав!!!");
    }

    public void dogMethod() {
        System.out.println("dogMethod");
    }

}

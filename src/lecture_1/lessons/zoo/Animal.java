package lecture_1.lessons.zoo;

public abstract class Animal {
    private String name;
    private String color;
    private int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void voice (){
        System.out.println("Животное издаёт звук. ");
    }
}

package lecture_1.lessons.zoo;

public class MaineCoon extends Cat {
    String catCollar;

    public MaineCoon(String name, String color, int age, int clawsLength, String catCollar) {
        super(name, color, age, clawsLength);
        this.catCollar = catCollar;
    }
}

package lecture_1.lessons.zoo;

public class startApp {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Шарик", "Серый", 2);
        Dog dog2 = new Dog("Бобик", "Чёрный", 7);
        Dog dog3 = new Dog("Барбос", "Белый", 4);
        Cat cat1 = new Cat("Барсик", "Белый", 5, 2);
        Cat cat2 = new Cat("Мурка", "Белый", 3, 1);

    Animal[] animals = new Animal[5];
    animals[0] = dog1;
    animals[1] = dog2;
    animals[2] = dog3;
    animals[3] = cat1;
    animals[4] = cat2;
        for (Animal animal: animals) {
            if(animal instanceof Cat) ((Cat)animal).catMethod();
            if(animal instanceof Dog) ((Dog)animal).dogMethod();
            animal.voice();
        }
    }
}

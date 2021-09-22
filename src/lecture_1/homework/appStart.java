package lecture_1.homework;

public class appStart {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик", 500, 10);
        Dog dog2 = new Dog("Барбос", 450, 12);
        Dog dog3 = new Dog("Шарик", 350, 15);
        HomeCat homeCat1 = new HomeCat("Барсик", 200);
        HomeCat homeCat2 = new HomeCat("Мурка", 220);
        Tiger tiger1 = new Tiger("Шерхан", 1500);

        Animal[] animals = {
                dog1,
                dog2,
                dog3,
                homeCat1,
                homeCat2,
                tiger1
        };
        int runDistance = 300;
        int swimDistance = 10;
        for (Animal animal : animals) {
            animal.run(runDistance);
            if (animal instanceof Dog) {
                ((Dog) animal).swim(swimDistance);
            }
            if (animal instanceof Cat) {
                System.out.println(animal.getName() + " не умеет плавать" );
            }
        }
        System.out.println("Общее количество животных " + Animal.getCountAnimal() +
                "\n количество собак " + Dog.getCountDog() +
                "\n количество кошек " + HomeCat.getCountHomeCat() +
                "\n количество тигров " + Tiger.getCountTiger()
        );
    }
}

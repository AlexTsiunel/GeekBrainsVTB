package main.java.com.geekbrains.lesson4.homework.homework_3;

import main.java.com.geekbrains.lesson4.homework.homework_3.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruitBox;

    public Box() {
        fruitBox = new ArrayList<>();
    }

    public void putFruit(T... fruits) {
        for (T fruit : fruits) {
            fruitBox.add(fruit);
        }
    }

    public boolean takeFruit(T fruit) {
        return fruitBox.remove(fruit);
    }

    public float getWeight() {
        float weight =0.0f;
        if (fruitBox.size() != 0) {
            for (T fruit : fruitBox) {
                weight += fruit.getWeight();
            }
        }
        return weight;
    }

    /*
    Метод пересыпает фрукты из одной коробки в другую, причём другая может быть как пустая, так и сфруктами.
     */
    public void transfer (Box<T> another) {
        if (this != another) {
            another.fruitBox.addAll(this.fruitBox);
            this.fruitBox.clear();
        }
    }

    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001f;
    }
}

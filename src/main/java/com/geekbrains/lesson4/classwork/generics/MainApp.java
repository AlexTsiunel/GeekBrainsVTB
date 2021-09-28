package main.java.com.geekbrains.lesson4.classwork.generics;

public class MainApp  {
    public static void main(String[] args) {
//        SimpleBox intBox1 = new SimpleBox(10);
//        SimpleBox intBox2 = new SimpleBox(10);
//
//        int sum = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
//        System.out.println("sum: " + sum);

//        GenBox<String> stringBox = new GenBox<>("Java");
//        GenBox<Integer> intBox1 = new GenBox<>(1);
//        GenBox<Integer> intBox2 = new GenBox<>(20);
//        intBox1.setObj(10);
//        int sum = intBox1.getObj()+ intBox2.getObj();

        BoxWithNumbers <Integer> intBox = new BoxWithNumbers<>(1,2,3,4,5);
        BoxWithNumbers <Integer> intBox2 = new BoxWithNumbers<>(1,2,3,4,5);
        BoxWithNumbers <Float> flotBox = new BoxWithNumbers<>(1.0f, 2.0f, 3.0f, 4.0f, 5.0f);
        System.out.println(intBox.average());
        System.out.println(flotBox.average());
        System.out.println(intBox.compareAverage(intBox2));




    }
}
/*
  Проблемы при отсутствии обобщённых типов при создании контейнера
  для хранения различных объектов
     - каждый раз делать каст, чтобы узнать что лежит в объекте
     - в объект может попасть не тот тип с которым мы собераемся работать.
     Каждый раз при вызове метода необходимо делать instanceof проверку
*/

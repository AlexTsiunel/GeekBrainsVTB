package main.java.com.geekbrains.lesson3.homework;

import main.java.com.geekbrains.lesson3.homework.myexeption.MyArrayDataException;
import main.java.com.geekbrains.lesson3.homework.myexeption.MyArraySizeException;
import main.java.com.geekbrains.lesson3.homework.myexeption.MyException;

public class startApp {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1f", "1", "1", "1"}
        };
        try {
            System.out.println(sum(array));
        }catch (MyException e){
            System.out.println("Ignored");
        }
    }

    public static int sum(String[][] array) {
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < 4; i++) {
            if (array[i].length != 4)
                throw new MyArraySizeException();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array);
                }
            }
        }
            return sum;
    }
}


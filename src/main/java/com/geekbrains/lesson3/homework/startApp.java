package main.java.com.geekbrains.lesson3.homework;

import main.java.com.geekbrains.lesson3.homework.myexeption.MyArrayDataException;
import main.java.com.geekbrains.lesson3.homework.myexeption.MyArraySizeException;

public class startApp {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1f"}
        };
        System.out.println(sum(array));

    }

    public static int sum(String[][] array) {
        if (array.length == 4 &&
                array[0].length == 4 && array[1].length == 4 &&
                array[2].length == 4 && array[3].length == 4) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(String.format("For input string: \"%s\" in cell [%d][%d]", array[i][j], i, j));
                    }
                }
            }
            return sum;

        } else {
            throw new MyArraySizeException();
        }
    }
}


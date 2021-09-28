package main.java.com.geekbrains.lesson4.homework.homework_1_2;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        String[]arr = {
                "aaa",
                "bbb",
                "ccc",
                "ddd",
                "eee"
        };
        MyArray.swap(arr, 0, 4);
        System.out.println(MyArray.arrayToAList(arr));
    }
}

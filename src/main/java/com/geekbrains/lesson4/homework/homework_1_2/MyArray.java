package main.java.com.geekbrains.lesson4.homework.homework_1_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyArray {
    public static void swap (Object [] arr, int i, int j){
        if ( i < arr.length && i>=0 &&
                j < arr.length && j>=0){
            Object temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static <T> ArrayList<T> arrayToAList (T [] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }
}

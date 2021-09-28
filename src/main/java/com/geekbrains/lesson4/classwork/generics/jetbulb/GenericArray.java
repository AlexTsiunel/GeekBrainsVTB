package main.java.com.geekbrains.lesson4.classwork.generics.jetbulb;

import java.lang.reflect.Array;
import java.util.List;

public class GenericArray {
    public static void main(String[] args) {
        String[] strings = GenericArray.convert(
                String.class,
                List.of("Val1", "Val2", "Val3")
        );
        showArray(strings);
    }

    public static <T> T[] convert(Class<T> clazz, List<T> value) {
        T[] result = (T[]) Array.newInstance(clazz, value.size());
        for (int i = 0; i < value.size(); i++) {
            result[i] = value.get(i);
        }
        return result;
    }

    public static void showArray (String[] arr){
        for (String str : arr) {
            System.out.print(str + " ");
            System.out.println();
        }
    }

}

package main.java.com.geekbrains.lesson5.homework.homework_1;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String[] arrString = {
                "aaa",
                "sss",
                "aaa",
                "sss",
                "ddd",
                "ddd",
                "ggg",
                "ccc",
                "aaa",
                "ccc",
                "aaa",
                "sss",
                "aaa",
                "sss",
                "ddd",
                "ddd",
                "ggg",
                "ccc",
                "aaa",
                "ccc"
        };
        Map<String, Integer> map = new HashMap<>();
        for (String value : arrString) {
            if (!map.containsKey(value)) {
                map.put(value, 1);
            } else {
                int count = map.get(value);
                map.put(value, ++count);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

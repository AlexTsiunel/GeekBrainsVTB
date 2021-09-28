package main.java.com.geekbrains.lesson5.homework.homework_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private Map<String, String> phonebook;

    public Phonebook() {
        phonebook = new HashMap<>();
    }

    public void add(String number, String surname) {
        phonebook.put(number, surname);
    }

    public ArrayList<String> get(String surname) {
        ArrayList<String> result = new ArrayList<>();
        if (phonebook.containsValue(surname)) {
            for (Map.Entry<String, String> entry : phonebook.entrySet()) {
                if (surname.equals(entry.getValue())) {
                    result.add(entry.getKey());
                }
            }
        }else {
            System.out.println("Абонент с фамилией " + surname + " в телефонном справочнике не найден!");
        }

        return result;
    }
}

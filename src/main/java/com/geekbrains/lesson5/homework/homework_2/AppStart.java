package main.java.com.geekbrains.lesson5.homework.homework_2;

public class AppStart {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("134561", "Ivanov");
        phonebook.add("134562", "Petrov");
        phonebook.add("134563", "Ivanov");
        phonebook.add("134564", "Sidorov");
        phonebook.add("134565", "Ivanov");
        phonebook.add("134566", "Abramov");
        phonebook.add("134567", "Abramov");
        phonebook.add("134568", "Abramov");

        System.out.println(phonebook.get("Ivanov"));
        System.out.println(phonebook.get("Ivanauskas"));
    }

}

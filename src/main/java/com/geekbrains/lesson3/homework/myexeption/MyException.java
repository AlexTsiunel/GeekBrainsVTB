package main.java.com.geekbrains.lesson3.homework.myexeption;

public class MyException extends RuntimeException {

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}

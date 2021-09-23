package main.java.com.geekbrains.lesson3.homework.myexeption;

public class MyArraySizeException extends MyException  {
    public MyArraySizeException() {
        super("Incorrect array size");
    }

    public MyArraySizeException(String message) {
        super(message);
    }
}

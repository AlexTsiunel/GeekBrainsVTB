package main.java.com.geekbrains.lesson3.homework.myexeption;

public class MyArrayDataException extends MyException {
    private int row;
    private int column;
    private Object[][] value;

    public MyArrayDataException() {
    }

    public MyArrayDataException(String message) {
        super(message);
    }

    public MyArrayDataException(int row, int column, Object[] [] value) {
        super(String.format("For input string: \"%s\" in cell [%d][%d]", value[row][column], row, column));
        this.row = row;
        this.column = column;
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Object[][] getValue() {
        return value;
    }
}

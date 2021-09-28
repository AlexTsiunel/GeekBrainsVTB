package main.java.com.geekbrains.lesson4.classwork.generics;

public class GenBox<T> {
    T obj; //Тип данных определяется в момент создания объекта

    public GenBox(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}


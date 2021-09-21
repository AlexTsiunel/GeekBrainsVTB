package lecture_1.homework;

public class Tiger extends Cat {
    private static int countTiger;

    public Tiger(String name, int runDistance) {
        super(name, runDistance);
        countTiger++;
    }

    public static int getCountTiger() {
        return countTiger;
    }
}

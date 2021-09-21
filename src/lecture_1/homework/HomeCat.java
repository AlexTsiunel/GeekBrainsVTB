package lecture_1.homework;

public class HomeCat extends Cat {
    private static int countHomeCat;

    public HomeCat(String name, int runDistance) {
        super(name, runDistance);
        countHomeCat++;
    }

    public static int getCountHomeCat() {
        return countHomeCat;
    }
}

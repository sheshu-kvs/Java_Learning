
class methover {

    public static void add(int a, int b) {
        int c = a + b;
        System.out.println("Addition of two Numbers:" + c);
    }

    public static void add(int a, int b, int c) {

        System.out.println("Addition of two Numbers:" + (a + b + c));

    }

    public static void add(int a, float b) {
        System.out.println("Addition of two Numbers:" + (a + b));

    }
}

public class DayFive01 {

    public static void main(String[] args) {
            
        methover.add(10, 20);
        methover.add(20, 30, 50);
        methover.add(30, 10.5f);

    }
}

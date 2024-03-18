package HomeWork9;

public class Test2 {
    int a = 1;
    static int b = 2;
    public static void abc (final int a ) {
        System.out.println(a);
        System.out.println(Test2.b);
    }

    public static void main(String[] args) {
        abc(5);
    }
}

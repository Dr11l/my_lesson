package HomaWork8;

public class Zadacha11 {
    static double umnojenie(double a, double b, double c) {
        return a * b * c;
    }

    static void delenie(int a, int b) {
        System.out.println("Целое частное = " + a / b + " остаток = " + a % b);
    }
}

class ZadachaTest11 {
    public static void main(String[] args) {
        System.out.println(Zadacha11.umnojenie(2, 3, 4));
        Zadacha11.delenie(9, 2);
        System.out.println(Zadacha11.umnojenie(2.5, 3.5, 4));
        Zadacha11.delenie(15, 4);

    }
}

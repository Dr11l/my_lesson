package HomaWork8;



public class Zadacha0 {
    static double umnojenie(double a, double b, double c) {
        return a * b * c;
    }

    static void delenie(int a, int b) {
        System.out.println("Целое число " + a / b + " остаток= " + 13 % 4);

    }

}

    class ZadachaTest1 {
        public static void main(String[] args) {
            System.out.println(Zadacha0.umnojenie(2, 3, 5));
            Zadacha0.delenie(9, 2);
            System.out.println(Zadacha0.umnojenie(2.4, 7.2, 3.1));
            Zadacha0.delenie(18, 3);

        }
    }















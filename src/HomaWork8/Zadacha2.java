package HomaWork8;

public class Zadacha2 {
    public final static double PI = 3.14;

    public double ploshad(double radius) {
        double pl = PI * radius * radius;
        return pl;
    }

    public static double dlina(double radius2) {
        double dl = 2 * PI * radius2;
        return dl;


    }

    public void info(double radius3) {
        System.out.println("Радиус = " + radius3);
        System.out.println("Площадь круга = " + ploshad(radius3));
        System.out.println("Длина окружности = " + dlina(radius3));

    }


}

class ZadachaTest {
    public static void main(String[] args) {


        Zadacha2 z = new Zadacha2();
        z.ploshad(4);
        Zadacha2.dlina(6.4);
        z.info(3);
    }
}

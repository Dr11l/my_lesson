package Lesson22.p1;
import Lesson22.Chelovek;
public class Test1 {
    public static void main(String[] args) {


        Chelovek c = new Chelovek("maale");
        c.setName("Kolya");
        c.setVes(50);
        c.setVozrast(15);
        System.out.println(c.getName());
        System.out.println(c.getVozrast());
        System.out.println(c.getVes());
    }
}
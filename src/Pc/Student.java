package Pc;

public class Student {

        int studNumber;
        String name;
        String surname;
        int course;
        double avgMath;
        double avgEconomic;
        double avgRuss;


}
class StudentTest {

    double sredneArifmOcenka (Student st) {

        double sredneOcenka = (st.avgEconomic + st.avgMath + st.avgRuss)/3;
        System.out.println("Srednyaya Arifmeticheskaya Ocenka Studenta " + st.name + " "+ st.surname + ": " + sredneOcenka);
        return sredneOcenka;


    }




    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        st1.studNumber = 1;
        st1.name = "Aktam";
        st1.surname = "Turdiev";
        st1.course = 2;
        st1.avgRuss = 4.6;
        st1.avgMath = 3.9;
        st1.avgEconomic = 8.1;

        st2.studNumber = 2;
        st2.name = "Milena";
        st2.surname = "Turdieva";
        st2.course = 3;
        st2.avgMath = 18.2;
        st2.avgEconomic = 8.3;
        st2.avgRuss = 9.1;

        st3.studNumber = 3;
        st3.name = "Emiliya";
        st3.surname = "Turdieva";
        st3.course = 2;
        st3.avgMath = 28.2;
        st3.avgEconomic = 18.3;
        st3.avgRuss = 6.1;

        StudentTest sTest = new StudentTest();
        sTest.sredneArifmOcenka(st1);
        sTest.sredneArifmOcenka(st2);
        sTest.sredneArifmOcenka(st3);

    }
}

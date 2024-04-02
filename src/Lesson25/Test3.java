package Lesson25;



public class Test3 {
    public static void main(String[] args) {
        Employee1 emp1 = new Doctor1();
        Employee1 emp2 = new Teacher1();
        Employee1 emp3 = new Driver1();
        Employee1 emp4 = new Employee1();
        Employee1 [] array = {emp1,emp2,emp3,emp4};

        for ( Employee1 e:array){
            if (e instanceof Driver1){
                System.out.println(((Driver1)e).nazvanieMashini);
                ((Driver1) e).vodit();
            }
        }



        }
}

class Employee1 extends java.lang.Object{
    double salary=100;
    String name = "Kolya";
    int age;
    int experience;
    void eat () {
        System.out.println("kushat");
    }
    void sleep () {
        System.out.println("spat");
    }
}

class Doctor1 extends Employee1 implements Help_able {
    String specializacia="xirurg ";
    void lechit () {
        System.out.println("lechit");
    }
    public void help () {
        System.out.println("Doctor okazivaet pomosh");
    }
}
class Teacher1 extends Employee1 {
    int kolichestvoUchenikov;
    void uchit () {
        System.out.println("uchit");
    }
}

class Driver1 extends Employee1 {
    String nazvanieMashini="mercedes";
    void vodit () {
        System.out.println("vodit");
    }
}

interface Help_able {
    void help();
}
package Lesson7_Test;

public class Employee{
    public String surname;
    int id;
    private double salary;



    public Employee (int id, String surname, double salary){
    this.surname =
    }

    public void dvoinayaZP() {
         double result = salary*2;
         System.out.println("Novaya Z/P= " + result);
    }

    public void methodOne() {
        System.out.println(id);
    }
// eowijw
    public void methodToo () {
        System.out.println(surname);
    }

    public void methodFree () {
        System.out.println(salary);
    }


    public Employee (double salary2) {
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoinayaZP();
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoinayaZP();
    }
}
package Lesson7;

import javax.imageio.stream.ImageInputStream;

public class Employee{
    public double salary;
    public void dvoinayaZP() {
         double result = salary*2;
         System.out.println("Novaya Z/P= " + result);
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
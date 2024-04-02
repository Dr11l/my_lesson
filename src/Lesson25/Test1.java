//package Lesson25;
//
//import p4.D;
//
//public class Test1 {
//    public static void main(String[] args) {
//
//        Employee m1 = new Teacher();
//        Employee m2 = new Driver();
//        Employee m3 = new Doctor();
//        Help_able h = new Teacher();
//        Employee[] array2 = {m1, m2, m3};
//        String s = null;
//        Object o = new Object();
//
////        for (Employee m : array2) {
////            m.work();
////        }
//        System.out.println(o instanceof Teacher);
//    }
//}
//
//
//abstract class Employee {
//    void sleep() {
//        System.out.println("Employee sleeps");
//    }
//
//    abstract void work();
//}
//
//class Teacher extends Employee implements Help_able {
//    void work() {
//        System.out.println("Teachers work");
//    }
//
//    public void help() {
//        System.out.println("Teachers helps");
//    }
//}
//
//class Driver extends Employee implements Help_able {
//    void work() {
//        System.out.println("Driver work");
//    }
//
//    public void help() {
//        System.out.println("Driver helps");
//    }
//
//}
//
//
//class Doctor extends Employee implements Help_able {
//    void work() {
//        System.out.println("Doctor work");
//    }
//
//    public void help() {
//        System.out.println("Doctor helps");
//    }
//
//}
//
//interface Help_able {
//    void help();
//}
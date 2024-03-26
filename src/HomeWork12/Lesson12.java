package HomeWork12;

import Lesson11.Student;

public class Lesson12 {
}

class StudentTest {
    public static void method(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Студенты одинаковые");
        } else {
            System.out.println("Студенты не одинаковые");
        }
    }

}
//    }

//    public static void meethod2(Student st1, Student st2) {
//        if (st1.name.equals(st2.name)) {
//            if (st1.course == st2.course) {
//                if (st1.grade == st2.grade) {
//                    System.out.println("Имена студентов, курсы и оценки одинаковые");
//                } else {
//                    System.out.println("Имена студентов и курсы одинаковые, а оценки различаются");
//                }
//            }else{
//                    System.out.println("Имена студентов одинаковые, но курсы различаются");
//
//                }
//            }
//        }
//    }
//}


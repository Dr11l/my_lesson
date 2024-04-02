package Lesson23;

public class Test1 {

    void abc (Animal a) {
        System.out.println("A");
    }
     void abc (Mouse m){
         System.out.println("M");
     }

    public static void main(String[] args) {
        Test1 t = new Test1();
        Animal an = new Mouse();
        t.abc(an);
    }

}

class Animal {
    void getName () {
        System.out.println("Animal");
    }
}

class Mouse extends Animal{
    void getName () {
        System.out.println("Mouse");
    }
}
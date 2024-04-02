package Lesson26;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("red", "v6");
        Car c2 = new Car("red", "v6");
        Car c3 = new Car("black", "v8");
        System.out.println(c1.equals(c3));

    }
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c2 = (Car) obj;
            return (color.equals(c2.color) && engine.equals(c2.engine));
        } else {
            boolean b = false;
            return b;
        }

    }
}


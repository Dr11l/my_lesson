package Lesson24;

public class Test2 {

    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvoStoron);
        f1.ploshad();
    }




}

abstract class Figura {
    int kolichestvoStoron = 0;

    abstract void perimetr();


    abstract void ploshad();

    void showInfo () {
        System.out.println("Eto Figura");
    }


}

class Kvadrat extends Figura {
    int kolichestvoStoron = 4;
    int storona1=10;
public void perimetr () {
    System.out.println("Perimetr kvadrata= " + 4*storona1);
}
    public void ploshad () {
        System.out.println("Ploshad kvadrata= " + storona1*storona1);
    }
}

class Pryamougolnik extends Figura {
    int kolichestvoStoron = 4;
    int storona1=8;
    int storona2=5;
    public void perimetr () {
        System.out.println("Perimetr pryamougolnika= " + 2*(storona1+storona2));
    }
    public void ploshad () {
        System.out.println("Ploshad pryamougolnika= " + storona1*storona2);
    }
}

class Okrujnost extends Figura {
    int kolichestvoStoron = 0;
    int radius = 3;
    public void perimetr () {
        System.out.println("Perimetr okrujnosti= " + 2*3.14*radius);
    }
    public void ploshad () {
        System.out.println("Ploshad okrujnosti= " + 3.14*radius*radius);
    }
}

abstract class ChetirehUgolnik extends Figura {
    void def (){
        System.out.println("Eto Chetirehugolnik");
    }
}
public class Mashina {
   void Mashina(String cvet, String motor){
        color = cvet;
        engine = motor;
        System.out.println("Цвет машины: "+color+" мотор машины:"+ engine);

    }
    String color;
    String engine;
}

class mashinaTest {
    public static void main(String[] args) {
        Mashina m1 = new Mashina();

        Mashina m2 = new Mashina();

    }

}

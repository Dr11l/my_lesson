package HomeWork13;

public class Month {
}

class Lesson13 {
    public static void dayQuantity(int n) {
        switch (n) {
            case 2:
                System.out.println("Кол-во дней в месяце 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Кол-во дней в месяце 30");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Кол-во дней в месяце 31");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

    public static void main(String[] args) {
        Lesson13.dayQuantity(0);
        dayQuantity(2);
        Lesson13.dayQuantity(5);
        dayQuantity(8);
        Lesson13.dayQuantity(14);
    }
}

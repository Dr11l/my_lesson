public class BankAccount {
    int id=10;
    String name="Ti";

    double balance=100;

void popolneniyaScheta (double summaPopolneniya){
    System.out.println("Balans do poplneniya: " + balance);
    System.out.println("Balans popolnilsya na: " + balance);
    balance += summaPopolneniya;
    System.out.println("Balans posle popolneniya: " + balance);
    System.out.println();
}
    void snyatiyaSoScheta (double summaSnyatiya){
        System.out.println("Balans do snyatiya: " + balance);
        System.out.println("Balans umenschilsya na: " + summaSnyatiya);
        balance -= summaSnyatiya;
        System.out.println("Balans posle snyatiya: " + balance);
        System.out.println();
    }
}


class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        MyAccount.popolneniyaScheta(20.2);
        MyAccount.snyatiyaSoScheta(40.1);
    }

}






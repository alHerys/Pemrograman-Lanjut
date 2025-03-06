package Praktikum.LiveCoding;

public class BankAccountMain {
    public static void main(String[] args) {

//        Instansiasi Objek
        BankAccount Brimo = new BankAccount("1572865564865", "Daniel", 1_000_000);
        BankAccount BCA = new BankAccount("1274892783454", "Andarias");

//        Memanggil Method Objek Brimo
        Brimo.displayInfo();
        Brimo.withdraw(100_000_000);
        Brimo.withdraw(100_000);
        Brimo.deposit(2_000_000);
        Brimo.deposit(-1);
        Brimo.withdraw(-1);

//        NewLine
        System.out.println();

//        Memanggil Method Objek BCA
        BCA.displayInfo();
        BCA.withdraw(100_000_000);
        BCA.withdraw(1_000_000);
        BCA.withdraw(0);
        BCA.deposit(0);
        BCA.deposit(100_000);
    }
}

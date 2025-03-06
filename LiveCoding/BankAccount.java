package Praktikum.LiveCoding;

public class BankAccount {
    // Field Class
    String noRek, namaPemilik;
    double saldo = 0;

    // Constructor
    BankAccount(
            String noRek,
            String namaPemilik,
            double saldo
    ){
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }
    BankAccount(
            String noRek,
            String namaPemilik
    ){
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
    }

    // Instance Method
    void displayInfo() {
        System.out.printf("""
                Nomor Rekening  : %s
                Nama Pemilik    : %s
                Saldo           : %.2f
                """, noRek, namaPemilik,saldo);
    }
    void deposit(double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal deposit harus lebih dari 0");
        }
        else {
            saldo += nominal;
            System.out.printf("Uang %.2f berhasil didepositkan\n", nominal);
        }
    }
    void withdraw(double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal penarikan harus lebih dari 0");
        }
        else if (nominal > saldo) {
            System.out.println("Saldo tidak mencukupi!");
        }
        else {
            saldo -= nominal;
            System.out.printf("Uang sebesar %.2f berhasil ditarik\n",nominal);
        }
    }
}

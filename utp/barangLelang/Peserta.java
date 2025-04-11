package UTP.realUTP.utp.barangLelang;

public class Peserta {
    private String nama;
    private double saldo;

    public Peserta(String nama, double saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    String getNama() {
        return nama;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    double getSaldo() {
        return saldo;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void tawar(BarangLelang barang, double jumlah) {
        barang.terimaPenawaran(this, jumlah);
    }
}

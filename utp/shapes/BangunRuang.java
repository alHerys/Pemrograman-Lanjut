package UTP.realUTP.utp.shapes;

public abstract class BangunRuang {
    private String nama;
    private double tinggi;
    public BangunRuang(){

    }

    public void setNama(String inputNama) {
        this.nama = inputNama;
    }

    public String getNama() {
        return nama;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double inputTinggi) {
        this.tinggi = inputTinggi;
    }

    abstract double getLuasPermukaan();
    abstract double getVolume();

    public void printInfo() {
        System.out.printf("""
                Nama            : %s
                Luas permukaan  : %f
                Volume          : %f
                """, getNama(), getLuasPermukaan(), getVolume());
    }
}

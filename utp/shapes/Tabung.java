package UTP.realUTP.utp.shapes;

public class Tabung extends BangunRuang {
    private double radius;
    private final int PEMBILANG = 22;
    private final int PENYEBUT = 7;

    public Tabung() {

    }

    public void setRadius(double inputRadius) {
        this.radius = inputRadius;
    }

    @Override
    public double getLuasPermukaan() {
        return 2 * getLuasAlas() + getKeliling() * getTinggi();
    }

    @Override
    public double getVolume() {
        return getLuasAlas() * getTinggi();
    }

    public double getLuasAlas() {
        return Math.pow(radius, 2) * ((double) PEMBILANG / PENYEBUT);
    }

    public double getKeliling() {
        return 2 * radius * ((double) PEMBILANG/PENYEBUT);
    }
}

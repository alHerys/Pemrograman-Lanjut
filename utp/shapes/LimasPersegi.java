package UTP.realUTP.utp.shapes;

public class LimasPersegi extends BangunRuang {
    private double sisi;

    public LimasPersegi(double sisi, double tinggi) {
        this.sisi = sisi;
        setTinggi(tinggi);
    }

    @Override
    public double getLuasPermukaan() {
        return 4 * getLuasSegitiga() + getLuasAlas();
    }

    @Override
    public double getVolume() {
        return getLuasAlas() * getTinggi()/3;
    }

    public double getTinggiSegitiga() {
        return Math.sqrt(Math.pow(getTinggi(), 2) + Math.pow(sisi, 2));
    }

    public double getLuasSegitiga() {
        return getTinggiSegitiga() * sisi/2;
    }

    public double getLuasAlas() {
        return sisi * sisi;
    }
}

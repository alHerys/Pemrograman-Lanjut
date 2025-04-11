package UTP.realUTP.utp.shapes;

import UTP.latihanUTP.modulClassroom.manusia.Manager;

public class PrismaSegitigaSamaKaki extends BangunRuang{
    private double alas;
    private double kaki;

    public PrismaSegitigaSamaKaki(double alas, double kaki, double tinggi) {
        this.alas = alas;
        this.kaki = kaki;
        setTinggi(tinggi);
    }

    @Override
    public double getVolume() {
        return getLuasAlas() * getTinggi();
    }

    public double getLuasAlas() {
        return getTinggiAlas() * alas/2;
    }

    public double getTinggiAlas() {
        return Math.sqrt(Math.pow(kaki, 2) - Math.pow(alas/2, 2));
    }

    public double getKeliling() {
        return 2 * kaki + alas;
    }

    @Override
    public double getLuasPermukaan() {
        return 2 * getLuasAlas() * getKeliling() * getTinggi();
    }
}

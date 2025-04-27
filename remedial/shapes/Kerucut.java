package remedial.shapes;

import remedial.bases.BangunRuang;
import remedial.interfaces.MemilikiBerat;
import remedial.interfaces.MemilikiGarisPelukis;
import remedial.interfaces.MemilikiVolume;

/**
 * Kelas untuk representasi objek Kerucut.
 */
public class Kerucut extends BangunRuang implements MemilikiGarisPelukis, MemilikiVolume, MemilikiBerat {
    private double radius;
    private final int PI_PEMBILANG = 22;
    private final int PI_PENYEBUT = 7;

    public Kerucut(double radius) {
        this.radius = radius;
    }

    /**
     * Mendapatkan radius kerucut.
     * @return Radius kerucut.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Menghitung volume kerucut.
     * @return Volume kerucut.
     */
    @Override
    public double hitungVolume() {
        return 1/(double) 3 * PI_PEMBILANG/(double) PI_PENYEBUT * Math.pow(getRadius(), 2) * getTinggi();
    }

    /**
     * Menghitung garis pelukis kerucut.
     * @return Panjang garis pelukis kerucut.
     */
    @Override
    public double hitungGarisPelukis() {
        return Math.sqrt(Math.pow(getRadius(), 2) + Math.pow(getTinggi(), 2));
    }

    /**
     * Menghitung berat kerucut.
     * @return Berat kerucut.
     */
    @Override
    public double hitungBerat() {
        return getMassa() * g;
    }

    /**
     * Menampilkan informasi kerucut.
     */
    @Override
    public void printInfo() {
        System.out.printf("""
                Nama            : %s
                Radius          : %.2f
                Tinggi          : %.2f
                Massa           : %.2f
                Volume          : %.2f
                Berat           : %.2f
                Garis pelukis   : %.2f
                """, getNama(), getRadius(), getTinggi(), getMassa(), hitungVolume(), hitungBerat(), hitungGarisPelukis());
    }
}
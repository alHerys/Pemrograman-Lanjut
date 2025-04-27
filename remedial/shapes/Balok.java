package remedial.shapes;

import remedial.bases.BangunRuang;
import remedial.interfaces.MemilikiBerat;
import remedial.interfaces.MemilikiVolume;

/**
 * Kelas untuk representasi objek Balok.
 */
public class Balok extends BangunRuang implements MemilikiBerat, MemilikiVolume {
    private double panjang;
    private double lebar;

    public Balok(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    /**
     * Mendapatkan panjang balok.
     * @return Panjang balok.
     */
    public double getPanjang() {
        return panjang;
    }

    /**
     * Mendapatkan lebar balok.
     * @return Lebar balok.
     */
    public double getLebar() {
        return lebar;
    }

    /**
     * Menghitung volume balok.
     * @return Volume balok.
     */
    @Override
    public double hitungVolume() {
        return getPanjang() * getLebar() * getTinggi();
    }

    /**
     * Menghitung berat balok.
     * @return Berat balok.
     */
    @Override
    public double hitungBerat() {
        return getMassa() * g;
    }

    /**
     * Menampilkan informasi balok.
     */
    @Override
    public void printInfo() {
        System.out.printf("""
                Nama            : %s
                Panjang         : %.2f
                Lebar           : %.2f
                Tinggi          : %.2f
                Massa           : %.2f
                Volume          : %.2f
                Berat           : %.2f
                """, getNama(), getPanjang(), getLebar(), getTinggi(), getMassa(), hitungVolume(), hitungBerat());
    }
}
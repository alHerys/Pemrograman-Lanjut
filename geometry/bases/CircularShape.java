package praktic.geometry.bases;

/**
 * Kelas abstrak representasi bentuk lingkaran.
 * Menyediakan properti radius dan konstanta PI (22/7) untuk perhitungan turunan.
 */
public abstract class CircularShape extends Shape {
    private double radius; // Radius lingkaran
    protected final int PI_NUMERATOR = 22;  // Pembilang PI (22/7)
    protected final int PI_DENOMINATOR = 7; // Penyebut PI (22/7)

    /** Konstruktor no-arg class */
    public CircularShape() {

    }

    /**
     * Mengatur nilai radius.
     * @param inputRadius Nilai radius yang akan diatur.
     */
    public void setRadius(double inputRadius) {
        radius = inputRadius;
    }

    /**
     * Mendapatkan nilai radius.
     * @return Nilai radius.
     */
    public double getRadius() {
        return radius;
    }
}
package praktic.geometry.interfaces;

/**
 * Interface untuk objek yang dapat dihitung beratnya (massa × gravitasi).
 */
public interface Weightable {
    double g = 9.8; // Konstanta gravitasi

    /**
     * Menghitung berat objek.
     * @return Berat objek.
     */
    double getWeight();
}
package remedial.interfaces;

/**
 * Interface untuk objek yang memiliki berat.
 */
public interface MemilikiBerat {
    double g = 9.8; // Konstanta gravitasi

    /**
     * Method untuk menghitung berat.
     * @return Berat objek.
     */
    double hitungBerat();
}
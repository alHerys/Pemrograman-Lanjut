package praktic.geometry.interfaces;

/**
 * Interface untuk bentuk 2D dengan kemampuan hitung luas dan keliling.
 */
public interface TwoDimensional {
    /**
     * Menghitung luas bentuk.
     * @return Luas bentuk.
     */
    double getArea();

    /**
     * Menghitung keliling bentuk.
     * @return Keliling bentuk.
     */
    double getPerimeter();
}
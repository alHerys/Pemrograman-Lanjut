package praktic.geometry.interfaces;

/**
 * Interface untuk bentuk 3D dengan kemampuan hitung luas permukaan dan volume.
 */
public interface ThreeDimensional {
    /**
     * Menghitung luas permukaan.
     * @return Luas permukaan.
     */
    double getSurfaceArea();

    /**
     * Menghitung volume.
     * @return Volume.
     */
    double getVolume();
}
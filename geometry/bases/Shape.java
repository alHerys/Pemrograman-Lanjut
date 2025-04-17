package praktic.geometry.bases;

/**
 * Kelas abstrak dasar untuk semua bentuk geometri.
 * Mengandung properti nama dan method abstrak untuk menampilkan informasi.
 */
public abstract class Shape {
    private String name; // Nama bentuk geometri

    /** Konstruktor no-arg untuk kelas Shape */
    public Shape() {
        // Tidak ada inisialisasi khusus
    }

    /**
     * Mengatur nama bentuk geometri.
     * @param inputName Nama bentuk yang akan diatur.
     */
    public void setName(String inputName) {
        name = inputName;
    }

    /**
     * Mendapatkan nama bentuk geometri.
     * @return Nama bentuk.
     */
    public String getName() {
        return name;
    }

    /**
     * Menampilkan informasi bentuk.
     * Harus diimplementasikan oleh subclass.
     */
    public abstract void printInfo();
}
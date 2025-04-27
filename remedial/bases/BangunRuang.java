package remedial.bases;

/**
 * Kelas dasar untuk semua bangun ruang.
 */
public abstract class BangunRuang {
    private String nama;
    private double tinggi;
    private double massa;

    public BangunRuang() {
    }

    /**
     * Mengatur nama bangun ruang.
     * @param inputNama Nama bangun ruang yang akan diatur.
     */
    public void setNama(String inputNama) {
        nama = inputNama;
    }

    /**
     * Mendapatkan nama bangun ruang.
     * @return Nama bangun ruang.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengatur tinggi bangun ruang.
     * @param inputTinggi Tinggi bangun ruang yang akan diatur.
     */
    public void setTinggi(double inputTinggi) {
        tinggi = inputTinggi;
    }

    /**
     * Mendapatkan tinggi bangun ruang.
     * @return Tinggi bangun ruang.
     */
    public double getTinggi() {
        return tinggi;
    }

    /**
     * Mengatur massa bangun ruang.
     * @param inputMassa Massa bangun ruang yang akan diatur.
     */
    public void setMassa(double inputMassa) {
        massa = inputMassa;
    }

    /**
     * Mendapatkan massa bangun ruang.
     * @return Massa bangun ruang.
     */
    public double getMassa() {
        return massa;
    }

    /**
     * Method untuk menampilkan informasi bangun ruang (harus diimplementasikan oleh kelas anak).
     */
    public abstract void printInfo();
}
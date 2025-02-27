package Praktikum1_ClassAndObject.Tugas;

/**
 * Berikut adalah class Gudang yang berisi identitas dan pencatatan keluar-masuk barang dari gudang.
 * Terdapat attribut nama dan pemilik gudang sebagai identitas.
 * Terdapat juga 3 attribut yang digunakan sebagai pencatatan keluar-masuk barang.
 */
public class Gudang {

// Field dari class Gudang
    private int jumlahBarang = 0; // Jumlah barang saat ini di gudang.
    private int jumlahBarangMasuk = 0; // Jumlah barang yang pernah masuk ke gudang
    private int jumlahBarangKeluar = 0; // Jumlah barang yang dikeluarkan dari gudang
    String namaGudang, pemilikGudang; // Attribut tambahan sebagai identitas gudang

// Method dari class Gudang
    /**
     * Merupakan method yang digunakan untuk menambahkan barang ke dalam gudang.
     * Jumlah barang yang ditambahkan, dimasukkan ke dalam parameter.
     * Setelah itu, attribut jumlahBarang dan jumlahBarangMasuk akan bertambah.
     * Terakhir, ditampilkan jumlah barang yang ditambahkan dan nama gudangnya.
     */
    void tambahBarang(int jumlah) {
        jumlahBarang += jumlah; // Menambahkan jumlahBarang dengan parameter jumlah.
        jumlahBarangMasuk += jumlah; // Menambahkan jumlahBarangMasuk dengan parameter jumlah.
        System.out.printf("Menambahkan %d barang ke %s\n", jumlah, namaGudang); // Output
    }

    /**
     * Method yang digunakan untuk mengambil barang dari gudang.
     * Jumlah barang yang diambil sesuai dengan parameter jumlah
     */
    void ambilBarang(int jumlah) {
        // Selama jumlah barang yang ada di gudang > jumlah barang yang ingin diambil, maka proses pengambilan barang dilanjutkan.
        if (jumlah < jumlahBarang) {
            jumlahBarang -= jumlah; // Mengurangi jumlahBarang sebanyak parameter jumlah.
            jumlahBarangKeluar += jumlah; // Menambahkan jumlahBarangKeluar sebanyak parameter jumlah.
            System.out.printf("Mengambil %d barang dari %s\n", jumlah, namaGudang); // Output
        }

        // Jika tidak, maka barang tidak akan berkurang dari gudang.
        else {
            System.out.println("Maaf, barang yang ingin diambil melebihi kapasitas"); // Output
        }
    }

    /**
     * Method yang digunakan untuk mengosongkan gudang.
     */
    void kosongkanGudang() {
        jumlahBarangKeluar += jumlahBarang; // Meningkatkan jumlahBarangKeluar dengan seluruh jumlahBarang yang ada di gudang.
        jumlahBarang = 0; // Memberi nilai 0 untuk jumlahBarang yang berarti gudang dalam keadaan kosong.
        System.out.println("Mengosongkan " + namaGudang); // Output
    }

    /**
     * Method yang digunakan untuk menampilkan identitas dan kondisi gudang saat ini.
     */
    void catatanGudang() {
        System.out.printf("""
                \nStatistik Gudang:
                Nama                    : %s
                Pemilik                 : %s
                Jumlah barang masuk     : %d
                Jumlah barang keluar    : %d
                Jumlah barang saat ini  : %d
                """, namaGudang, pemilikGudang, jumlahBarangMasuk, jumlahBarangKeluar, jumlahBarang);
    }
}
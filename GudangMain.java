package Praktikum1_ClassAndObject.Tugas;

public class GudangMain {
    public static void main(String[] args) {
        // Instansiasi object dengan nama Perpustakaan.
        Gudang Perpustakaan = new Gudang();

            // Pemberian nilai attribut nama dan pemilik gudang.
            Perpustakaan.namaGudang = "Gudang Ilmu";
            Perpustakaan.pemilikGudang = "Universitas Brawijaya";

            // Mengambil 5 barang dari gudang. Attribut tidak akan berubah karena barang yang diambil < jumlah barang yang ada di gudang
            Perpustakaan.ambilBarang(5);

            Perpustakaan.tambahBarang(10); // Menambahkan 10 barang ke gudang. Attribut jumlahBarang dan jumlahBarangMasuk bertambah.
            Perpustakaan.ambilBarang(5); // Mengambil 5 barang dari gudang. Attribut jumlahBarang berkurant, sedangkan attribut jumlahBarangKeluar bertambah.
            Perpustakaan.tambahBarang(7);

            Perpustakaan.catatanGudang(); // Menampilkan seluruh attribut gudang.

        System.out.println(); // Newline untuk memisahkan output kedua object

        // Instansiasi object kedua dari class Gudang
        Gudang RubanahFilkom = new Gudang();

            // Pemberian nilai attribut nama dan pemilik Gudang
            RubanahFilkom.namaGudang = "Gudang Komputasi";
            RubanahFilkom.pemilikGudang = "Fakultas Ilmu Komputer";

            // Proses keluar-masuk barang dari Gudang Komputasi
            RubanahFilkom.tambahBarang(50); // Barang masuk sebanyak 50 barang
            RubanahFilkom.ambilBarang(25); // Barang keluar sebanyak 25 barang
            RubanahFilkom.tambahBarang(5); // Barang masuk sebanyak 5 barang
            RubanahFilkom.ambilBarang(20); // Barang keluar sebanyak 20 barang
            RubanahFilkom.tambahBarang(15); // Barang masuk sebanyak 15 barang
            RubanahFilkom.tambahBarang(3); // Barang masuk sebanyak 15 barang

            // Mengosongkan seluruh isi Gudang Komputasi
            RubanahFilkom.kosongkanGudang();

            RubanahFilkom.catatanGudang(); // Menampilkan seluruh attribut object RubanahFilkom.
    }
}
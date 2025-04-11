package UTP.realUTP.utp.barangLelang;

public class BarangLelang {
    private String namaBarang;
    private double hargaAwal;
    private double penawaranTertinggi;
    private Peserta pemenang;
    private boolean statusLelang;

    public BarangLelang(
            String namaBarang,
            double hargaAwal
    ) {
        this.namaBarang = namaBarang;
        this.hargaAwal = hargaAwal;
        this.statusLelang = true;
    }

    void mulaiLelang() {
        System.out.printf("""
                Nama Barang             : %s
                Harga Awal              : %f
                """, namaBarang, hargaAwal);
    }

    void terimaPenawaran(Peserta peserta, double jumlah) {
        if (statusLelang) {
            if (peserta.getSaldo() < hargaAwal) {
                if (hargaAwal < jumlah) {
                    System.out.printf("""
                            Penawaran disetujui!
                            %s menawar Rp %f
                            """, peserta.getNama(), jumlah);
                } else {
                    System.out.printf("Penawaran tidak valid!! Penawaran harus lebih tinggi dari %f\n", hargaAwal);
                }
            } else {
                System.out.printf("Penawaran tidak valid!! Saldo %s tidak cukup\n", peserta.getNama());
            }
        } else {
            System.out.println("Penawaran tidak valid!! Lelang sudah tutup");
        }
    }

    void tutupLelang() {
        statusLelang = false;
        System.out.printf("Lelang ditutup! %s terjuan dengan harga Rp %f kepada %s\n", namaBarang, penawaranTertinggi, pemenang.getNama());
    }
}

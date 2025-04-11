package UTP.realUTP.utp.barangLelang;

public class Elektronik extends BarangLelang{
    private int garansi;

    public Elektronik(String namaBarang, double hargaAwal, int garansi) {
        super(namaBarang, hargaAwal);
        this.garansi = garansi;
    }

    @Override
    public void mulaiLelang() {
        super.mulaiLelang();
        System.out.printf("Barang elektronik ini memiliki garansi: %d tahun\n", garansi);
    }
}

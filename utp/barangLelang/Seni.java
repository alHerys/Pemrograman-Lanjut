package UTP.realUTP.utp.barangLelang;

public class Seni extends BarangLelang {
    private String seniman;

    public Seni(String namaBarang, double hargaAwal, String seniman) {
        super(namaBarang, hargaAwal);
        this.seniman = seniman;
    }

    @Override
    void mulaiLelang() {
        super.mulaiLelang();
        System.out.printf("Karya seni ini dibuat oleh: %s", seniman);
    }
}

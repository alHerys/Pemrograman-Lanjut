package UTP.realUTP.utp.barangLelang;

public class SistemLelang {
    public static void main(String[] args) {
        Elektronik kamera = new Elektronik(
                "Kamera DSLR Canon",
                4_000_000,
                2
        );

        Seni lukisan = new Seni(
                "Lukisan Abstrak Modern",
                8_000_000,
                "Seniman Lokal"
        );

        Peserta andi = new Peserta(
                "Andi",
                9_000_000
        );
        Peserta budi = new Peserta(
                "Budi",
                25_000_000
        );
        Peserta iwan = new Peserta(
                "Iwan",
                30_000_000
        );
        Peserta dina = new Peserta(
                "Dina",
                10_000_000
        );
        Peserta eka = new Peserta(
                "Eka",
                5_000_000
        );

        kamera.mulaiLelang();
        budi.tawar(kamera, 4_500_000);
        dina.tawar(kamera,5_000_000);
        andi.tawar(kamera,5_500_000);
        budi.tawar(kamera,6_000_000);
        kamera.tutupLelang();
        iwan.tawar(kamera, 6_500_000);
    }
}

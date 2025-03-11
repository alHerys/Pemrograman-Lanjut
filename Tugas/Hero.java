package Relationship.Tugas;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String namaHero;
    private List<Weapon> senjata; // Kepemilikan Hero terhadap Weapon (Composition)
    private Trainer pelatih; // Kepemilikan Hero terhadap Trainer (Aggregation)

//    Constructor
    Hero(String namaHero) {
        this.namaHero = namaHero;
        this.senjata = new ArrayList<>(); // Ins
    }

//    Relasi Aggregation: Hero Memiliki Trainer
    void tambahTrainer(Trainer trainer) {
        pelatih = trainer;
    }

//    Penerapan Composition menggunakan anonymous object
    void ambilSenjata(String namaSenjata) {
        senjata.add(new Weapon(namaSenjata));
    }

    String getNamaHero() {
        return namaHero;
    }

    void statistikHero() {
        System.out.printf("""
                \nStatistik Hero:
                Nama: %s
                Pelatih: %s
                Jumlah Senjata: %d
                """, namaHero, pelatih.getNamaTrainer(), this.senjata.size());

        int j = 1; // Sebagai nomor urut daftar senjata

        for (Weapon i : senjata ) {
            System.out.printf("%d. %s\n", j, i.getWeaponName());
            j++;
        }
    }
}

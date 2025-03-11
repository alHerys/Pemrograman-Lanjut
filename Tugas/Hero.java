package Relationship.Tugas;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String namaHero;
    private List<Weapon> senjata; // Kepemilikan Hero terhadap Weapon (Composition)
    private Health Hp; // Kepemilikan Hero terhadap Health

//    Constructor
    Hero(String namaHero, int HP) {
        this.namaHero = namaHero;
        this.senjata = new ArrayList<>();

        // Relasi Composition: Hero memiliki HP, dan HP tidak dapat eksis tanpa Hero
        this.Hp = new Health(HP); // Instansiasi anonymous object
    }

//    Relasi Aggregation: Hero memiliki senjata, tetapi objek senjata tetap dapat berdiri sendiri
    void ambilSenjata(Weapon namaSenjata) {
        senjata.add(namaSenjata);
    }

    String getNamaHero() {
        return namaHero;
    }

    void statistikHero() {
        System.out.printf("""
                \nStatistik Hero:
                Nama: %s
                HP: %d
                Jumlah Senjata: %d
                """, namaHero, Hp.getHealthPoint(),this.senjata.size());

        int j = 1; // Sebagai nomor urut daftar senjata

        for (Weapon i : senjata ) {
            System.out.printf("%d. %s\n", j, i.getWeaponName());
            j++;
        }
    }
}

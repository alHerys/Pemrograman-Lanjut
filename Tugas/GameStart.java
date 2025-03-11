package Relationship.Tugas;

public class GameStart {
    public static void main(String[] args) {
        // Instansiasi Objek Trainer
        Trainer pelatih = new Trainer("Bayu");

//        Instansiasi Objek Hero
        // Composition -> Hero memiliki HP dan HP tidak dapat eksis tanpa Hero
        Hero assassin = new Hero("Hayabusa", 100);
        Hero marksman = new Hero("Clint", 50);

//        Instansiasi Objek Weapon
        Weapon Pedang = new Weapon("Katana");
        Weapon Kunai = new Weapon("Kunai Kematian");
        Weapon Pistol = new Weapon("Revolver");
        Weapon LarasPanjang = new Weapon("Shotgun");
        Weapon Perangkap = new Weapon("Jaring Besi");

//        Association -> Trainer Mengajar Hero
        pelatih.mengajar(assassin);
        pelatih.mengajar(marksman);

//        Aggregation -> Hero memiliki Weapon, tetapi Weapon tetap dapat berdiri sendiri
        assassin.ambilSenjata(Pedang);
        assassin.ambilSenjata(Kunai);

        marksman.ambilSenjata(Pistol);
        marksman.ambilSenjata(LarasPanjang);
        marksman.ambilSenjata(Perangkap);

        // Meskipun menjadi milik Hero, Weapon tetap dapat berdiri sendiri.
        Pedang.tambahSkill("Sayatan Maut");
        Pedang.tambahSkill("Api Neraka");
        Pedang.statistikWeapon();

//        Menampilkan Statistik Hero
        assassin.statistikHero();
        marksman.statistikHero();
    }
}
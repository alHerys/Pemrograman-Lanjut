package Relationship.Tugas;

public class GameStart {
    public static void main(String[] args) {
        // Instansiasi Objek
        Trainer pelatih = new Trainer("Bayu");
        Hero assassin = new Hero("Hayabusa");
        Hero marksman = new Hero("Clint");

        // Association -> Trainer Mengajar Hero
        pelatih.mengajar(assassin);
        pelatih.mengajar(marksman);

        // Aggregation -> Hero memiliki Trainer
        assassin.tambahTrainer(pelatih);
        marksman.tambahTrainer(pelatih);

        // Composition -> Hero memiliki Weapon
        assassin.ambilSenjata("Katana");
        assassin.ambilSenjata("Kunai");

        marksman.ambilSenjata("Pistol");
        marksman.ambilSenjata("Shotgun");
        marksman.ambilSenjata("Jaring Perangkap");

        // Menampilkan Statistik Hero
        assassin.statistikHero();
        marksman.statistikHero();
    }
}

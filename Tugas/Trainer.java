package Relationship.Tugas;

public class Trainer {
    private String nama;

    Trainer(String nama) {
        this.nama = nama;
    }

//    Relasi Association: Trainer Mengajar Hero
    void mengajar(Hero hero) {
        System.out.printf("%s sedang mengajar %s\n", nama, hero.getNamaHero());
    }

    String getNamaTrainer() {
        return nama;
    }
}
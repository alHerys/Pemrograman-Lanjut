package remedial.mains;

import remedial.bases.BangunRuang;
import remedial.shapes.Balok;
import remedial.shapes.Kerucut;

import java.util.Scanner;

/**
 * Kelas utama untuk menjalankan aplikasi kalkulator bangun ruang.
 */
public class KalkulatorBangunRuangMini {
    public static void main(String[] args) {
        // Kode warna untuk output terminal
        String green = "\u001B[32m";
        String white = "\u001B[0m";
        String yellow = "\u001B[33m";
        String blue = "\u001B[94m";

        // Menampilkan header aplikasi
        System.out.printf("""
                %s=============================================%s
                Kalkulator Bangun Ruang Mini Versi A
                Alvianto Hery Sarborn
                245150700111022
                %s=============================================%s
                Kerucut
                %s=============================================%s
                """, green, yellow, green, blue, green, white);

        // Membuat scanner untuk input pengguna
        Scanner scan = new Scanner(System.in);
        System.out.print("Isikan nama     : ");
        String nama = scan.nextLine(); // Membaca nama dari input
        System.out.print("Isikan radius   : ");
        double radius = scan.nextDouble(); // Membaca radius dari input
        System.out.print("Isikan tinggi   : ");
        double tinggi = scan.nextDouble(); // Membaca tinggi dari input
        System.out.print("Isikan massa    : ");
        double massa = scan.nextDouble(); // Membaca massa dari input

        System.out.printf("%s=============================================%s\n", green, white);

        // Membuat objek Kerucut
        BangunRuang kerucut = new Kerucut(radius);
        kerucut.setNama(nama); // Mengatur nama kerucut
        kerucut.setTinggi(tinggi); // Mengatur tinggi kerucut
        kerucut.setMassa(massa); // Mengatur massa kerucut
        kerucut.printInfo(); // Menampilkan info kerucut

        // Bagian untuk menghitung dan menampilkan informasi Balok
        System.out.printf("""
                %s=============================================%s
                Balok
                %s=============================================%s
                """, green, blue, green, white);

        scan.nextLine(); // Membersihkan newline

        System.out.print("Isikan nama     : ");
        String namaBalok = scan.nextLine(); // Membaca nama balok dari input
        System.out.print("Isikan panjang  : ");
        double panjang = scan.nextDouble(); // Membaca panjang dari input
        System.out.print("Isikan lebar    : ");
        double lebar = scan.nextDouble(); // Membaca lebar dari input
        System.out.print("Isikan tinggi   : ");
        double tinggiBalok = scan.nextDouble(); // Membaca tinggi balok dari input
        System.out.print("Isikan massa    : ");
        double massaBalok = scan.nextDouble(); // Membaca massa balok dari input

        System.out.printf("%s=============================================%s\n", green, white);

        // Membuat objek Balok
        BangunRuang balok = new Balok(panjang, lebar);
        balok.setNama(namaBalok); // Mengatur nama balok
        balok.setTinggi(tinggiBalok); // Mengatur tinggi balok
        balok.setMassa(massaBalok); // Mengatur massa balok
        balok.printInfo(); // Menampilkan info balok
        System.out.printf("%s=============================================%s\n", green, white);
    }
}
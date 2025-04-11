package UTP.realUTP.utp.mains;

/* Alvianto Hery Sarborn - 245150700111022
##     ## ######## ########  ##    ##
##     ## ##       ##     ##  ##  ##
##     ## ##       ##     ##   ####
######### ######   ########     ##
##     ## ##       ##   ##      ##
##     ## ##       ##    ##     ##
##     ## ######## ##     ##    ##
 */

import UTP.realUTP.utp.shapes.LimasPersegi;
import UTP.realUTP.utp.shapes.PrismaSegitigaSamaKaki;
import UTP.realUTP.utp.shapes.Tabung;

import java.util.Scanner;



public class Main {

    public static String GREEN = "\u001B[32m";
    public static String WHITE = "\u001B[0m";
    public static String YELLOW = "\u001B[33m";
    public static String BLUE ="\u001B[94m";
    public static void printGaris() {
        System.out.println("=================================");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        printGaris();

        System.out.print(YELLOW + """
                ALVIANTO HERY SARBORN
                245150700111022
                """ + WHITE);

        printGaris();

        System.out.println(BLUE + "Prisma Segitiga Sama Kaki" + WHITE);

        printGaris();

        System.out.print("Isikan alas    : ");
        double alas = scan.nextDouble();
        System.out.print("Isikan kaki    : ");
        double kaki = scan.nextDouble();
        System.out.print("Isikan tinggi  : ");
        double tinggiPrisma = scan.nextDouble();

        printGaris();

        PrismaSegitigaSamaKaki prisma = new PrismaSegitigaSamaKaki(alas, kaki, tinggiPrisma);
        prisma.setNama("Prisma Segitiga Sama Kaki");
        prisma.printInfo();
        System.out.printf("""
                Tinggi Alas     : %f
                Luas Alas       : %f
                Keliling        : %f
                """, prisma.getTinggiAlas(), prisma.getLuasAlas(), prisma.getKeliling());

        printGaris();

        System.out.println(BLUE + "Limas Persegi" + WHITE);

        printGaris();

        System.out.print("Isikan sisi    : ");
        double sisi = scan.nextDouble();
        System.out.print("Isikan tinggi  : ");
        double tinggiLimas = scan.nextDouble();

        printGaris();

        LimasPersegi limasPersegi = new LimasPersegi(sisi, tinggiLimas);
        limasPersegi.setNama("Limas Persegi");

        printGaris();

        limasPersegi.printInfo();
        System.out.printf("""
                Tinggi Segitiga : %f
                Luas Segitiga   : %f
                Luas Alas       : %f
                """, limasPersegi.getTinggiSegitiga(), limasPersegi.getLuasSegitiga(), limasPersegi.getLuasAlas());
        printGaris();

        System.out.println(BLUE + "Tabung" + WHITE);

        printGaris();

        System.out.print("Isikan radius    : ");
        double radius = scan.nextDouble();
        System.out.print("Isikan tinggi    : ");
        double tinggiTabung = scan.nextDouble();

        printGaris();

        Tabung tabung = new Tabung();
        tabung.setNama("Tabung");
        tabung.setRadius(radius);
        tabung.setTinggi(tinggiTabung);
        tabung.printInfo();
        System.out.printf("""
                Luas Alas       : %f
                Keliling        : %f
                """, tabung.getLuasAlas(), tabung.getKeliling());
        printGaris();
    }
}

package praktic.geometry.mains;

import praktic.geometry.shapes.Circle;

import java.util.Scanner;

public class Main {
    public static String WHITE = "\u001B[0m";
    public static String GREEN = "\u001B[32m";
    public static String YELLOW = "\u001B[33m";
    public static String BLUE ="\u001B[94m";
    public static void printGaris() {
        System.out.println(GREEN + "=================================");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Circle lingkarang = new Circle();

        printGaris();
        System.out.println(GREEN + "Nama : " + WHITE + "Alvianto Hery Sarborn");
        System.out.println(GREEN + "NIM : " + WHITE + "245150700111022");
        printGaris();
        System.out.println(YELLOW + "Circe");
        printGaris();
        System.out.print(BLUE + "Isikan ID     : "); lingkarang.setId(scan.nextInt());
        System.out.print(BLUE + "Isikan Radius : "); lingkarang.setRadius(scan.nextDouble());
        printGaris();
        lingkarang.printDeskripsi();
        printGaris();
    }
}

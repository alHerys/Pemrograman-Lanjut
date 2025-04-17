package praktic.geometry.mains;

/* Alvianto Hery Sarborn - 245150700111022
##     ## ######## ########  ##    ##
##     ## ##       ##     ##  ##  ##
##     ## ##       ##     ##   ####
######### ######   ########     ##
##     ## ##       ##   ##      ##
##     ## ##       ##    ##     ##
##     ## ######## ##     ##    ##
 */

import praktic.geometry.bases.CircularShape;
import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;
import praktic.geometry.shapes.Circle;
import praktic.geometry.shapes.Cube;
import praktic.geometry.shapes.Sphere;
import praktic.geometry.shapes.Square;

import java.util.Scanner;

/**
 * Program utama untuk menghitung berbagai properti geometri.
 */
public class ShapeCalculator {
    public static void main(String[] args) {

        // Membuat scanner untuk input pengguna
        Scanner scan = new Scanner(System.in);

        // Warna untuk output terminal
        String green = "\u001B[32m";
        String white = "\u001B[0m";
        String yellow = "\u001B[33m";
        String blue = "\u001B[94m";

        // Menampilkan header program
        System.out.printf("""
                    %s======================================
                    %sShape Calculator
                    %sAlvianto Hery Sarborn
                    245150700111022%s
                    """, green, yellow, blue, white);

        // Menampilkan informasi lingkaran 2D
        System.out.printf("""
                %s======================================
                %s2D Circle
                %s======================================%s
                """, green, yellow, green, white);

        CircularShape circle = new Circle(); // Membuat objek lingkaran
        System.out.printf("%s======================================%s\n", green, white);
        circle.printInfo(); // Menampilkan informasi lingkaran

        // Menampilkan informasi persegi 2D
        System.out.printf("""
                %s======================================
                %s2D Square
                %s======================================%s
                """, green, yellow, green, white);

        Shape square = new Square(); // Membuat objek persegi
        System.out.printf("%s======================================%s\n", green, white);
        square.printInfo(); // Menampilkan informasi persegi

        // Menampilkan informasi kubus 3D
        System.out.printf("""
                %s======================================
                %s3D Weightable Cube
                %s======================================%s
                """, green, yellow, green, white);

        Shape cube = new Cube(); // Membuat objek kubus
        System.out.printf("%s======================================%s\n", green, white);
        cube.printInfo(); // Menampilkan informasi kubus

        // Menampilkan informasi bola 3D
        System.out.printf("""
                %s======================================
                %s3D Weightable Sphere
                %s======================================%s
                """, green, yellow, green, white);

        CircularShape sphere = new Sphere(); // Membuat objek bola
        System.out.printf("%s======================================%s\n", green, white);
        sphere.printInfo(); // Menampilkan informasi bola

        // Menampilkan perhitungan volume menggunakan polimorfisme
        System.out.printf("""
                %s======================================
                %sVolume of Cube and Sphere
                POLYMORPHISM: INTERFACE
                %s======================================%s
                """, green, yellow, green, white);

        // Input untuk sisi, radius, dan massa
        double edge, radius, mass;
        System.out.print("Enter edge      : ");
        edge = scan.nextDouble();
        System.out.print("Enter radius    : ");
        radius = scan.nextDouble();
        System.out.print("Enter mass      : ");
        mass = scan.nextDouble();

        // Menggunakan polimorfisme untuk menghitung volume dan berat
        ThreeDimensional cube2 = new Cube(edge, mass);
        ThreeDimensional sphere2 = new Sphere(radius, mass);
        Weightable cubeWeight = new Cube(edge, mass);

        // Menampilkan hasil perhitungan
        System.out.printf("""
                %s======================================%s
                Cube’s volume   : %.1f
                Sphere’s volume : %.1f
                Weight          : %.1f
                %s======================================%s
                """, green, white, cube2.getVolume(), sphere2.getVolume(), cubeWeight.getWeight(), green, white);
    }
}
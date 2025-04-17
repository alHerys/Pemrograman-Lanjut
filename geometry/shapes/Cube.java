package praktic.geometry.shapes;

import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;

import java.util.Scanner;

/**
 * Representasi kubus 3D. Mengimplementasikan interface Weightable dan ThreeDimensional.
 */
public class Cube extends Shape implements Weightable, ThreeDimensional {
    private double edge; // Panjang sisi kubus
    private double mass; // Massa kubus

    /** Konstruktor dengan input sisi dan massa melalui scanner */
    public Cube() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter edge      : ");
        double edge = scan.nextDouble();
        System.out.print("Enter mass      : ");
        double mass = scan.nextDouble();
        this(edge, mass);
    }

    /**
     * Konstruktor dengan parameter sisi dan massa.
     * @param edge Panjang sisi kubus.
     * @param mass Massa kubus.
     */
    public Cube(double edge, double mass) {
        setName("Cube");
        this.edge = edge;
        this.mass = mass;
    }

    /**
     * Menghitung luas permukaan kubus.
     * @return Luas permukaan kubus.
     */
    public double getSurfaceArea() {
        return 6 * Math.pow(edge, 2);
    }

    /**
     * Menghitung volume kubus.
     * @return Volume kubus.
     */
    public double getVolume() {
        return Math.pow(edge, 3);
    }

    /**
     * Menghitung berat kubus.
     * @return Berat kubus.
     */
    @Override
    public double getWeight() {
        return mass * g;
    }

    /** Mencetak informasi kubus. */
    @Override
    public void printInfo() {
        System.out.printf("""
                Name            : %s
                Surface area    : %.1f
                Volume          : %.1f
                Weight          : %.1f
                """, getName(), getSurfaceArea(), getVolume(), getWeight());
    }
}
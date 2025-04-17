package praktic.geometry.shapes;

import praktic.geometry.bases.CircularShape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;

import java.util.Scanner;

/**
 * Representasi bola 3D. Mengimplementasikan interface Weightable dan ThreeDimensional.
 */
public class Sphere extends CircularShape implements ThreeDimensional, Weightable {
    private double mass; // Massa bola

    /** Konstruktor dengan input radius dan massa melalui scanner */
    public Sphere() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius    : ");
        double radius = scan.nextDouble();
        System.out.print("Enter mass      : ");
        double mass = scan.nextDouble();
        this(radius, mass);
    }

    /**
     * Konstruktor dengan parameter radius dan massa.
     * @param radius Radius bola.
     * @param mass Massa bola.
     */
    public Sphere(double radius, double mass) {
        setName("Sphere");
        setRadius(radius);
        this.mass = mass;
    }

    /**
     * Menghitung luas permukaan bola.
     * @return Luas permukaan bola.
     */
    @Override
    public double getSurfaceArea() {
        return 4 * ((double) PI_NUMERATOR / PI_DENOMINATOR) * Math.pow(getRadius(), 2);
    }

    /**
     * Menghitung volume bola.
     * @return Volume bola.
     */
    @Override
    public double getVolume() {
        return ((double) 4 / 3) * ((double) PI_NUMERATOR / PI_DENOMINATOR) * Math.pow(getRadius(), 3);
    }

    /**
     * Menghitung berat bola.
     * @return Berat bola.
     */
    @Override
    public double getWeight() {
        return g * mass;
    }

    /** Mencetak informasi bola. */
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
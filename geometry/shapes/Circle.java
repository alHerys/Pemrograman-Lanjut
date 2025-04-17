package praktic.geometry.shapes;

import praktic.geometry.bases.CircularShape;
import praktic.geometry.interfaces.TwoDimensional;

import java.util.Scanner;

/**
 * Representasi lingkaran 2D. Mengimplementasikan interface TwoDimensional.
 */
public class Circle extends CircularShape implements TwoDimensional {

    /** Konstruktor dengan input radius melalui scanner */
    public Circle() {
        System.out.print("Enter radius    : ");
        this(new Scanner(System.in).nextDouble());
    }

    /**
     * Konstruktor dengan parameter radius.
     * @param radius Nilai radius lingkaran.
     */
    public Circle(double radius) {
        setName("Circle");
        setRadius(radius);
    }

    /**
     * Menghitung luas lingkaran menggunakan rumus πr².
     * @return Luas lingkaran.
     */
    @Override
    public double getArea() {
        return ((double) PI_NUMERATOR / PI_DENOMINATOR) * Math.pow(getRadius(), 2);
    }

    /**
     * Menghitung keliling lingkaran menggunakan rumus 2πr.
     * @return Keliling lingkaran.
     */
    @Override
    public double getPerimeter() {
        return 2 * ((double) PI_NUMERATOR / PI_DENOMINATOR) * getRadius();
    }

    /** Mencetak informasi lingkaran. */
    @Override
    public void printInfo() {
        System.out.printf("""
                Name            : %s
                Area            : %.1f
                Perimeter       : %.1f
                """, getName(), getArea(), getPerimeter());
    }
}
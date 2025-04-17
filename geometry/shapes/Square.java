package praktic.geometry.shapes;

import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.TwoDimensional;

import java.util.Scanner;

/**
 * Representasi persegi 2D. Mengimplementasikan interface TwoDimensional.
 */
public class Square extends Shape implements TwoDimensional {
    private double side; // Panjang sisi persegi

    /** Konstruktor dengan input sisi melalui scanner */
    public Square() {
        System.out.print("Enter side      : ");
        this(new Scanner(System.in).nextDouble());
    }

    /**
     * Konstruktor dengan parameter sisi.
     * @param side Panjang sisi persegi.
     */
    public Square(double side) {
        this.side = side;
        setName("Square");
    }

    /**
     * Menghitung luas persegi.
     * @return Luas persegi.
     */
    @Override
    public double getArea() {
        return side * side;
    }

    /**
     * Menghitung keliling persegi.
     * @return Keliling persegi.
     */
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    /** Mencetak informasi persegi. */
    @Override
    public void printInfo() {
        System.out.printf("""
                Name            : %s
                Area            : %.1f
                Perimeter       : %.1f
                """, getName(), getArea(), getPerimeter());
    }
}
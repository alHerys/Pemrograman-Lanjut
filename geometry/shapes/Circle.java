package praktic.geometry.shapes;

import praktic.geometry.mains.Main;

public class Circle {

//    Field
    private int id;
    private double radius;
    private final int pembilang = 22;
    private final int penyebut = 7;

//  Constructor
    public Circle() {}

//    Method
    public void setId(int id) {
        this.id = id;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getKeliling() {
        return 2 * radius * ((double) pembilang /penyebut);
    }
    public double getLuas() {
        return ((double) pembilang /penyebut) * Math.pow(radius,2);
    }
    public void printDeskripsi() {
        System.out.println(Main.YELLOW + "Deskripsi Lingkaran:");
        System.out.printf("""
                ID       = %d
                Radius   = %.0f
                Keliling = %f
                Luas     = %f
                """, id, radius, getKeliling(), getLuas());


    }
}

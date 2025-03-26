package praktic.inheritance.transportation;

/**
 * Merupakan class extends dari class {@link #Vehicle} dengan nama {@code Taxi}
 */
public class Taxi extends Vehicle {
    private static final int FARE_PER_KM = 5_000; // Tarif per km taksi yang dibayarkan oleh penumpang

    /**
     * Merupakan konstruktor class {@code Taxi} dengan parameter String {@code name}.
     * Seperti class {@link Bus} dan class {@link Train}, konstruktor ini juga berisi {@code super} yang merujuk kepada
     * konstruktor class {@link #Vehicle}.
     * @param name
     */
    public Taxi(String name) {
        super(
            "Taksi %s".formatted(name), // Melalukan format agar semua variabel nama yang diinputkan diawali dengan kata Taksi
            4,
            "Bandara - Hotel"
        );
    }

    /**
     * Merupakan method yang berfungsi untuk menampilkan total jarak rute {@code distance}, tarif per km {@link #FARE_PER_KM},
     * dan total tarif perjalanan taksi {@link #FARE_PER_KM} dikalikan dengan {@code distance}.
     * @param distance
     */
    public void calculateFare(int distance) {
        calculateFare();
        System.out.printf("""
                Total jarak rute: %d km
                Tarif per km: Rp %d
                Total tarif perjalanan taksi: Rp %d
                """, distance, FARE_PER_KM, FARE_PER_KM * distance
        );
    }
}

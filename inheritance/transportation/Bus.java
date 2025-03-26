package praktic.inheritance.transportation;

/**
 * Ini merupakan class extends dari {@link #Vehicle} dengan nama {@code Bus}
 */
public class Bus extends Vehicle {
    private static final int FARE_PER_STOP = 2_000; // Tarif per stop yang harus dibayarkan setiap penumpang.

    /**
     * Merupakan konstruktor class {@code Bus} dengan satu parameter bertipe String dengan nama {@code name}.
     * Berisi {@code super} yang merujuk kepada konstruktor class {@link #Vehicle}
     * @param name
     */
    public Bus(String name) {
        super(
            "Bus %s".formatted(name), // Melalukan format agar semua variabel nama yang diinputkan diawali dengan kata Bus
            50,
            "Terminal A - Terminal B"
        );
    }

    /**
     * Merupakan method yang berfungsi untuk menampilkan total pemberhentian {@code stops}, tarif per halte {@link #FARE_PER_STOP},
     * dan total tarif perjalanan bus {@link #FARE_PER_STOP} * {@link #getCurrentPessangers()} * {@code stops}.
     * @param stops
     */
    public void calculateFare(int stops) {
        super.calculateFare(); // Memanggil method calculateFare() pada parent class Vehicle.
        System.out.printf("""
                Total pemberhentian: %d
                Tarif per halte: Rp %d
                Total tarif perjalanan bus: Rp %d
                """, stops, FARE_PER_STOP, getCurrentPessangers() * stops * FARE_PER_STOP
        );
    }
}
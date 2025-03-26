package praktic.inheritance.transportation;

/**
 * Merupakan extend class dari class {@link #Vehicle} dengan nama Train.
 */
public class Train extends Vehicle {
    private static final int FIXED_FARE = 10_000; // Tarif tetap kereta

    /**
     * Konstruktor untuk class Train.
     * Konstruktor ini juga berisi super yang merupakan konstruktor parent class {@link #Train} yakni {@link #Vehicle}
     * @param name
     */
    public Train(String name) {
        super(
            "Kereta %s".formatted(name), // Melalukan format agar semua variabel nama yang diinputkan diawali dengan kata Kereta
            200,
            "Stasiun Kota - Stasiun Pusat"
        );
    }

    /**
     * Ini adalah method overriden dari method {@link #calculateFare()} di class {@link #Vehicle}.
     * Akan tetapi, dalam method ini juga terdapat pemanggilan method {@link #calculateFare()} yang di class {@link #Vehicle}.
     * Selain itu, dalam method ini terdapat pemanggilan output printf yang berfungsi untuk mencetak tarif tetap per penumpang ({@link #FIXED_FARE}) dan
     * Total tarif perjalanan kereta (hasil kali antara {@link #getCurrentPessangers()} dengan {@link #FIXED_FARE}.
     */
    public void calculateFare() {
        super.calculateFare(); // Memanggil method calculateFare() yang ada pada parent class Vehicle
        System.out.printf("""
                Tarif tetap per penumpang: Rp %d
                Total tarif perjalanan kereta: Rp %d
                """, FIXED_FARE, getCurrentPessangers() * FIXED_FARE
        );
    }
}

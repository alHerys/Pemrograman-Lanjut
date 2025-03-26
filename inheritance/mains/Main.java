package praktic.inheritance.mains;

// Import class Bus, Taxi, dan Train.
// Import perlu dilakukan karena class tersebut berada di package lain.
import praktic.inheritance.transportation.Bus;
import praktic.inheritance.transportation.Taxi;
import praktic.inheritance.transportation.Train;

/**
 * Merupakan class yang bernama {@code Main} yang berisi static method {@link #garis()} dan method {@link #main(String[])}
 */
public class Main {

    /**
     * Merupakan method static yang berfungsi untuk memberikan output garis
     */
    static void garis() {
        System.out.print("""
                
                ---------------------------------------------
                
                """);
    }

    /**
     * Method main yang merupakan awalan dari sistem
     */
    public static void main(String[] args) {

// Instansiasi object bernama transjakarta dari class Bus.
        Bus transjakarta = new Bus("Transjakarta"); // Setelah objek dibuat, maka method startJourney() akan dipanggil.
        transjakarta.boardPassengers(30); // Menambahkan 30 penumpang ke dalam bus.
        transjakarta.boardPassengers(20); // Menambahkan 20 penumpang ke dalam bus.
        transjakarta.calculateFare(5); // Menghitung tarif dengan 5 pemberhentian.
        transjakarta.stopJourney(); // Bus tiba di tujuan dan menurunkan seluruh penumpang.

        garis(); // Memanggil method static garis() untuk memberikan garis pada output.

// Instansiasi object commuterLine dari class Train.
        Train commuterLine = new Train("Commuter Line"); // Setelah objek dibuat, maka method startJourney() akan dipanggil.
        commuterLine.boardPassengers(150); // Menambahkan 150 penumpang ke dalam kereta.
        commuterLine.calculateFare(); // Menghitung tarif perjalanan.
        commuterLine.stopJourney(); // Kereta tiba di tujuan dan menurunkan seluruh penumpang.

        garis(); // Memanggil method static garis() untuk memberikan garis pada output.

// Instansiasi object blueBird dari class Taxi.
        Taxi blueBird = new Taxi("BlueBird"); // Setelah objek dibuat, maka method startJourney() akan dipanggil.
        blueBird.boardPassengers(3); // Menambahkan 3 penumpang ke dalam taksi.
        blueBird.calculateFare(10); // Menghitung tarif dengan jarak 10 km.
        blueBird.stopJourney(); // Taksi tiba di tujuan dan menurunkan seluruh penumpang.

        garis(); // Memanggil method static garis() untuk memberikan garis pada output.

// Instansiasi object transjava dari class Bus.
        Bus transjava = new Bus("Transjava"); // Setelah objek dibuat, maka method startJourney() akan dipanggil.
        transjava.boardPassengers(50); // Menambahkan 50 penumpang ke dalam bus.
        transjava.boardPassengers(1); // Menambahkan 1 penumpang lagi ke dalam bus tapi tidak bisa karena taksi penuh..
        transjava.calculateFare(5); // Menghitung tarif dengan 5 pemberhentian.
        transjava.stopJourney(); // Bus tiba di tujuan dan menurunkan seluruh penumpang.
        transjava.dropPassengers(10); // Mengurangi 10 penumpang dari bus tapi tidak bisa karena tidak ada penumpang.

        garis(); // Memanggil method static garis() untuk memberikan garis pada output.

// Instansiasi object whoosh dari class Train.
        Train whoosh = new Train("Whoosh"); // Setelah objek dibuat, maka method startJourney() akan dipanggil.
        whoosh.boardPassengers(200); // Menambahkan 200 penumpang ke dalam kereta.
        whoosh.boardPassengers(1); // Menambahkan 1 penumpang lagi ke dalam kereta.
        whoosh.calculateFare(); // Menghitung tarif perjalanan.
        whoosh.stopJourney(); // Kereta tiba di tujuan dan menurunkan seluruh penumpang.
        whoosh.dropPassengers(5); // Mengurangi 5 penumpang dari kereta tapi tidak bisa karena tidak ada penumpang.

        garis(); // Memanggil method static garis() untuk memberikan garis pada output.

// Instansiasi object xanh dari class Taxi.
        Taxi xanh = new Taxi("Xanh SM"); // Setelah objek dibuat, maka method startJourney() akan dipanggil.
        xanh.boardPassengers(4); // Menambahkan 4 penumpang ke dalam taksi.
        xanh.boardPassengers(1); // Menambahkan 1 penumpang lagi ke dalam taksi tapi tidak bisa karena taksi penuh.
        xanh.calculateFare(10); // Menghitung tarif dengan jarak 10 km.
        xanh.stopJourney(); // Taksi tiba di tujuan dan menurunkan seluruh penumpang.
        xanh.dropPassengers(10); // Mengurangi 10 penumpang dari taksi tapi tidak bisa karena tidak ada penumpang.
    }
}
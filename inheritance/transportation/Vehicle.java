package praktic.inheritance.transportation;

/**
 * Merupakan class yang menjadi parent bagi class Bus, Taxi, dan Train. Berisi 4 field, 6 Method, dan 1 konstruktor
 */
public class Vehicle {

//    Field class Vehicle
    private String name;
    private int capacity;
    private String route;
    private int currentPessangers;

    /**
     * Konstructor class Vehicle dengan 3 parameter.
     * Setiap kali konstructor dibuat pada object maka method startJourney() akan dipanggil
     * @param name -> Jenis dan nama kendaraan
     * @param capacity -> Kapasitas kendaraan
     * @param route -> Rute kendaraan
     */
    public Vehicle(
            String name,
            int capacity,
            String route
    ){
        this.name = name;
        this.capacity = capacity;
        this.route = route;
        this.currentPessangers = 0;
        startJourney();
    }

//    Method

    /**
     * Berfungsi untuk menaikkan penumpang ke dalam kendaraan.
     * Selama jumlah penumpang mencukupi kapasitas kendaraan, maka ia dapat naik.
     * @param count -> Jumlah penumpang yang hendak naik
     */
    public void boardPassengers(int count) {
        if (count <= (capacity - currentPessangers)) {
            currentPessangers += count;
            System.out.printf("%d penumpang naik ke dalam %s\n",count, name);
        } else {
            System.out.printf("Kapasitas penuh! Tidak dapat menaikkan %d penumpang\n", count);
        }

    }

    /**
     * Berfungsi untuk menurunkan penumpang dari kendaraan.
     * Penumpang dapat turun selama jumlah penumpang yang hendak turun tidak
     * melebihi jumlah penumpang
     * @param count -> Jumlah penumpang yang hendak diturunkan
     */
    public void dropPassengers(int count) {
        if (count <= currentPessangers) {
            currentPessangers -= count; // Mengurangi jumlah penumpang saat ini.
            System.out.printf("%d penumpang turun dari %s\n",count, name);
        } else {
            System.out.println("Tidak ada cukup penumpang untuk turun");
        }
    }

    /**
     * Berfungsi untuk memulai perjalanan. Otomatis dipanggil apabila terjadi instansiasi objek.
     */
    public void startJourney() {
        System.out.printf("%s memulai perjalanan di %s\n", name, route);
    }

    /**
     * Berfungsi untuk menghentikan perjalanan.
     * Setelah itu, seluruh penumpang akan diturunkan dengan method dropPassengers()
     */
    public void stopJourney() {
        System.out.printf("%s mencapai tujuan akhir dan berhenti\n", name);
        dropPassengers(currentPessangers);
    }

    /**
     * Berfungsi untuk menampilkan jumlah penumpang.
     * Method ini digunakan di child class.
     */
    public void calculateFare() {
        System.out.printf("Total Penumpang: %d\n", currentPessangers);
    }

    /**
     * Sebagai getter untuk attribut {@code currentPassengers}
     * @return {@code currentPassengers}
     */
    public int getCurrentPessangers() {
        return currentPessangers;
    }
}
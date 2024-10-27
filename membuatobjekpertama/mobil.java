package membuatobjekpertama;

public class mobil {
    String warna;
    String merek;
    int kecepatanMaks;

    public mobil(String warna, String merek, int kecepatanMaks) {
        this.warna = warna;
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void printOutApaSaja() {
        System.out.println("Mobil Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan Maks: " + kecepatanMaks); // Menambahkan satuan kecepatan
    }

    public void berjalan() {
        System.out.println("Mobil " + merek + " sedang berjalan"); // Menambahkan spasi agar rapi
    }

    // Method untuk menghentikan mobil
    public void berhenti() {
        System.out.println("Mobil " + merek + " sedang berhenti"); // Menambahkan spasi agar rapi
    }
}

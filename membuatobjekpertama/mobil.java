package membuatobjekpertama;

// Mengubah nama kelas dari 'mobil' menjadi 'Mobil'
public class Mobil {
    String warna;
    String merek;
    int kecepatanMaks;

    public Mobil(String warna, String merek, int kecepatanMaks) {
        this.warna = warna;
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }

    // Method untuk menampilkan informasi mobil
    public void tampilkanInfo() {
        System.out.println("Mobil Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan Maks: " + kecepatanMaks + " km/jam"); // Menambahkan satuan kecepatan
    }

    // Method untuk menjalankan mobil
    public void berjalan() {
        System.out.println("Mobil " + merek + " sedang berjalan"); // Menambahkan spasi agar rapi
    }

    // Method untuk menghentikan mobil
    public void berhenti() {
        System.out.println("Mobil " + merek + " sedang berhenti"); // Menambahkan spasi agar rapi
    }
}

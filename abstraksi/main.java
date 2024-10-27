package abstraksi;

public class main {
    public static void main(String[] args) {
    Mobil mobil = new Mobil("merah");
    Perahu perahu = new Perahu("Biru");

    Mobil.info();
    Mobil.bergerak();

    Perahu.info();
    Perahu.bergerak();
    }
}

package abstraksi;

public class main {
    public static void main(String[] args) {
    mobil mobil = new mobil("merah");
    perahu perahu = new perahu("Biru");

    mobil.info();
    mobil.bergerak();

    perahu.info();
    perahu.bergerak();
    }
}

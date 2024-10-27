package polymorfisme;

public class main {
    public static void main(String[] args) {
        BangunDatar bangunDatar;

        bangunDatar = new persegi(5);
        System.out.println("Luas Persegi: " + bangunDatar.luas());
        System.out.println("Luas Persegi: " + bangunDatar.keliling());

        bangunDatar = new lingkaran(7);
        System.out.println("Luas Lingkaran: " + bangunDatar.luas());
        System.out.println("Keliling Lingkaran: " + bangunDatar.keliling());

        bangunDatar = new segitigaSamaSisi(5, 8);
        System.out.println("Luas Segitiga Sama Sisi: " + bangunDatar.luas());
        System.out.println("Keliling Segitiga Sama Sisi: " + bangunDatar.keliling());

    }
}

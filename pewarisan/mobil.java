package pewarisan;

public class mobil extends kendaraan {
    private int jumlahPintu;
    private String jenisBahanBakar;

    public mobil (final String merek, final String model, final int tahunProduksi, final int jumlahPintu, final String jenisBahanBakar){
        super(merek, model, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }
    public void infoMobil() {
        infoKendaraan();
        System.out.println("jumlah pintu: " + jumlahPintu);
        System.out.println("Jenis Bahan Bakar" + jenisBahanBakar);
    }
}

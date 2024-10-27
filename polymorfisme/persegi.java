package polymorfisme;

public class persegi extends BangunDatar {
    private double sisi;

    public persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double keliling(){
        return 4 * this.sisi;
    }
    @Override
    public double luas(){
        return this.sisi * this.sisi;
    }
}

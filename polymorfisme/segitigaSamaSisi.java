package polymorfisme;

public class segitigaSamaSisi extends BangunDatar{
    private double sisi;
    private double tinggi;

    @Override
    public double luas(){
        return 0.5 * sisi * tinggi;
    }
    @Override
    public double keliling() {
        return 3 * sisi;
    }
}

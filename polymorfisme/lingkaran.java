package polymorfisme;

public class lingkaran extends BangunDatar{
    private double jarijar;

    public lingkaran(final double jarijari){
        this.jarijari = jarijari;
    }

    @Override
    public double luas() {
        return Math.PI * jarijari * jarijari;
    }
    @Override
    public double keliling(){
        return Math.PI * jarijari;
    }
}

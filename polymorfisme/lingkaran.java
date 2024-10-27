package polymorfisme;

public class lingkaran extends BangunDatar{
    private double jariJari;

    public lingkaran(final double jarijari){
        this.jariJari = jarijari;
    }

    @Override
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }
    @Override
    public double keliling(){
        return Math.PI * jariJari;
    }
}

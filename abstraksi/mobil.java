package abstraksi;

public class mobil {
    public class mobil extends kendaraan {
        super(warna);
    }
    @Override
    void bergerak(){
        System.out.println("mobil bergerak dijalan.");
    }
}

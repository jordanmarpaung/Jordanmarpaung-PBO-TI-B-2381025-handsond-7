package abstraksi;

    public class mobil extends kendaraan {
        public mobil(final String warna) {
        super(warna);
    }
    @Override
    void bergerak(){
        System.out.println("mobil bergerak dijalan.");
    }
}

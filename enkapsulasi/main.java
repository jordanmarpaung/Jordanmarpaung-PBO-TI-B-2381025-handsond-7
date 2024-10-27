package enkapsulasi;

public class main {
    public static void main(String[] args) {
        BankAccount jordanmarpaung = new BankAccount(100);
        jordanmarpaung.deposit(10);
        System.out.println(jordanmarpaung.getSaldo());
    }
}

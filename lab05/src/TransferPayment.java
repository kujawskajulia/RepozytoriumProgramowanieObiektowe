public class TransferPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Przelew: " + amount);
    }
}
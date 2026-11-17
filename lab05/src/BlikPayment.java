public class BlikPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Płatność BLIK: " + amount);
    }
}
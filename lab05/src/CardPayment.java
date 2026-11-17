public class CardPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Płatność kartą: " + amount);
    }
}
public class CardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Płatność kartą na kwotę: " + amount + " zł");
    }
}
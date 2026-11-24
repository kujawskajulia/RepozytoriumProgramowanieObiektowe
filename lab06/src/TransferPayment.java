public class TransferPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Płatność przelewem na kwotę: " + amount + " zł");
    }
}
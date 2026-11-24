public class OrderService {
    private final PaymentMethod paymentMethod;
    public OrderService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void checkout(double amount) {
        System.out.println("Rozpoczynanie realizacji zamówienia...");
        this.paymentMethod.pay(amount);
        System.out.println("Zamówienie opłacone\n");
    }
}
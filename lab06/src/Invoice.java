public class Invoice implements Printable {
    private String invoiceNumber;
    private double amount;
    public Invoice(String invoiceNumber, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
    }
    @Override
    public void printHeader() {
        System.out.println("FAKTURA VAT");
    }
    @Override
    public void print() {
        System.out.println("Faktura nr: " + invoiceNumber + "\nKwota: " + amount + " zł");
    }
}
public class Ticket implements Printable {
    private String eventName;
    private int seatNumber;
    public Ticket(String eventName, int seatNumber) {
        this.eventName = eventName;
        this.seatNumber = seatNumber;
    }
    @Override
    public void print() {
        System.out.println("Bilet na: " + eventName + "\nMiejsce: " + seatNumber);
    }
}
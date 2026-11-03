public class Computer extends Device{
    private int ramGb;
    public Computer(String manufacturer, int ramGb) {
        super(manufacturer);
        this.ramGb = ramGb;
    }
    public int getRamGb() {
        return ramGb;
    }
    public void amountRam() {
        System.out.println("Komputer wykorzystuje " + ramGb + " GB pamięci RAM.");
    }
}

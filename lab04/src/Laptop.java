public class Laptop extends Computer{
    private int batteryCapacityWh;
    public Laptop(String manufacturer, int ramGb, int batteryCapacityWh) {
        super(manufacturer, ramGb);
        this.batteryCapacityWh = batteryCapacityWh;
    }
    public void checkBattery() {
        System.out.println("Laptop posiada pojemność akumulatora: " + batteryCapacityWh + " Wh.");
    }
}

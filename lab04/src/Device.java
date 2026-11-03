public class Device {
    private String manufacturer;
    public Device(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void turnOn() {
        System.out.println("Urządzenie marki " + manufacturer + " uruchomione.");
    }
}

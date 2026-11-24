public class Car {
    private final Engine engine;
    private final Gearbox gearbox;
    public Car() {
        this.engine = new Engine();
        this.gearbox = new Gearbox();
    }
    public void start() {
        this.engine.ignite();
        this.gearbox.shiftToFirstGear();
        System.out.println("Samochód gotowy.");
    }
}
//Samochód ma silnik i skrzynię biegów, a nie jest silnikiem ani skrzynią biegów. Dziedziczenie sugerowałoby, że auto jest rodzajem silnika.
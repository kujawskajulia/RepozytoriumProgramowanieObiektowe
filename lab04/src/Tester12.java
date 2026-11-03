public class Tester12 extends Employee12{
    private boolean automated;
    public Tester12(String name, double baseSalary, boolean automated) {
        super(name, baseSalary);
        this.automated = automated;
    }
    @Override
    public void work() {
        if (automated) {
            System.out.println(getName() + " przeprowadza testy automatyczne.");
        } else {
            System.out.println(getName() + " przeprowadza testy manualne.");
        }
    }
}

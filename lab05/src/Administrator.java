public class Administrator extends Employee{
    private double baseSalary;
    private double specialDayRate;
    private int specialDays;
    public Administrator(String name, double baseSalary, double specialDayRate, int specialDays) {
        super(name);
        this.baseSalary = baseSalary;
        this.specialDayRate = specialDayRate;
        this.specialDays = specialDays;
    }
    @Override
    public double calculateSalary() {
        return this.baseSalary + (this.specialDayRate * this.specialDays);
    }
}

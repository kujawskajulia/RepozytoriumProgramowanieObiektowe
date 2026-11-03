public class Manager12 extends Employee12{
    private double bonus;
    public Manager12(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() {
        return this.getBaseSalary()
                + this.bonus;
    }
    @Override
    public String toString() {
        return "Manager{name='%s', salary=%.2f}"
                .formatted(
                        this.getName(),
                        this.calculateSalary()
                );
    }
}

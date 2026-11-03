public class Employee12 {
    private String name;
    private double baseSalary;
    public Employee12(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    protected String getName() {
        return this.name;
    }
    protected double getBaseSalary() {
        return this.baseSalary;
    }
    public double calculateSalary() {
        return this.baseSalary;
    }
    public void work() {
        System.out.println(name + " pracuje.");
    }
}

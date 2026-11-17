public class Developer extends Employee{
    private double salary;
    public Developer(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    @Override
    public double calculateSalary() {
        return this.salary;
    }
}

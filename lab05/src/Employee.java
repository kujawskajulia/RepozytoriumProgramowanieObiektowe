public class Employee {
    private String name;
    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double calculateSalary() {
        return 0.0;
    }
    public void showInformation() {
        System.out.printf(
                "%s: %.2f zł%n",
                this.name,
                this.calculateSalary()
        );
    }
}

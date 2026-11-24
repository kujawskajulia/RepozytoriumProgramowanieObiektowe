public class Salesperson extends Employee {
    private double totalSales;
    private double commissionRate;
    public Salesperson(String name, double baseSalary, double totalSales, double commissionRate) {
        super(name, baseSalary);
        this.totalSales = totalSales;
        this.commissionRate = commissionRate;
    }
    @Override
    public double calculateSalary() {
        return baseSalary + (totalSales * commissionRate);
    }
}
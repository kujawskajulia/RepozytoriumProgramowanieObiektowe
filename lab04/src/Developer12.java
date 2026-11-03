public class Developer12 extends Employee12{
    private String Language;
    public Developer12(String name, double baseSalary, String Language) {
        super(name, baseSalary);
        this.Language = Language;
    }
    @Override
    public void work() {
        System.out.println(getName() + " pisze kod w języku " + Language);
    }
}

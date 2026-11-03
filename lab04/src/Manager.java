public class Manager extends Employee2{
    private String department;

    public Manager(String firstName, String lastName, String department) {
        super(firstName, lastName);
        this.department = department;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Zarządzany dział: " + department);
    }
}

public class Employee2 {
    private String firstName;
    private String lastName;

    public Employee2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void showInformation() {
        System.out.println("Pracownik: " + firstName + " " + lastName);
    }
}

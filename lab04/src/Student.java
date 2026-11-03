public class Student extends Personzad11 {

    private int albumNumber;

    public Student(String name, int albumNumber) {
        super(name);
        this.albumNumber = albumNumber;
    }
    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println(
                name + ", " + albumNumber
        );
    }
}

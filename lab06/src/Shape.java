public abstract class Shape {
    private String name;
    protected Shape(String name) {
        System.out.println(
                "Konstruktor Shape"
        );
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public abstract double area();
    public void printInformation() {
        System.out.printf(
                "%s: %.2f%n",
                this.name,
                this.area()
        );
    }
}

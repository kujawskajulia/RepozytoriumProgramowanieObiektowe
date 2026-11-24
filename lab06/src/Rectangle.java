public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        super("Prostokąt");
        System.out.println(
                "Konstruktor Rectangle"
        );
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return width * height;
    }
}
public class Circle extends Shape{
    private double promien;
    public Circle(double promien) {
        this.promien = promien;
    }
    @Override
    public double area() {
        return Math.PI * promien * promien;
    }
    @Override
    public String getName() {
        return "Koło";
    }
}

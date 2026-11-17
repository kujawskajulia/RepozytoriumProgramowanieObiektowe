public class Triangle extends Shape{
    private double podstawa;
    private double wysokosc;
    public Triangle(double podstawa, double wysokosc) {
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
    }
    @Override
    public double area() {
        return 0.5 * podstawa * wysokosc;
    }
    @Override
    public String getName() {
        return "Trójkąt";
    }
}

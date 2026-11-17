public class Rectangle extends Shape{
    private double szerokosc;
    private double wysokosc;
    public Rectangle(double szerokosc, double wysokosc) {
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }
    @Override
    public double area() {
        return szerokosc * wysokosc;
    }
    @Override
    public String getName() {
        return "Prostokąt";
    }
}

public class Point {
    int x;
    int y;
    public Point(int x,
                 int y){
        this.x = x;
        this.y = y;
    }
    public double distance(double x, double y){
        double wynik = Math.sqrt(Math.pow(this.x - x, 2)+ Math.pow(this.y-y,2));
        return wynik;
    }
}


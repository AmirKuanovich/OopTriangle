public class Triangle {
    double a;
    double b;
    double c;

    public double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = p * (p - a) * (p - b) * (p - c);
        double sqrt = Math.sqrt(s);
        long round = Math.round(sqrt);
        return round;
    }

}

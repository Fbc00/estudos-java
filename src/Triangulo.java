public class Triangulo {
    double a, b, c;
    public double area() {
        double p = (a + b + c ) / 2.0;
        double areaTri = Math.sqrt(p * (p-a) + (p-b) * (p-c));
        return areaTri;
    }
}

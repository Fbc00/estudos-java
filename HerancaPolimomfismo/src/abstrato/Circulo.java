package abstrato;

public class Circulo extends Item{
    private Double radiu;
    public Circulo (Color color, Double radius) {
        super(color);
        this.radiu = radius;
    }
    @Override
    public Double area() {
        return Math.PI * Math.pow(this.radiu, 2);

    }

}


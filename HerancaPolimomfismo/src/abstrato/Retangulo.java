package abstrato;

public class Retangulo extends Item {
    private Double largura;
    private Double Altura;
    public Retangulo(Color color, Double Altura, Double Largura) {

        super(color);
        this.largura = Largura;
        this.Altura = Altura;
    }

    @Override
    public Double area() {
        return this.largura * Altura;
    }
}

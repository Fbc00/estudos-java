package exercicio;

public class Terceirizado extends  Employee{
    Double adicional;
    public  Terceirizado (String name, Integer hours, Double valerPerHour, Double adicional) {
        super(name, hours, valerPerHour);
        this.adicional = adicional;
    }
    @Override
    public Double payment() {
        return (1.10 * this.adicional) + super.payment();
    }
}

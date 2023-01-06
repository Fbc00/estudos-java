package entities;

public final class Poupanca  extends  Account{ // final evita que a classe seja herdada
    private double taxaJuros;
    public Poupanca(Integer number, String holder, Double balance, Double taxaJuros) {
        super(number, holder, balance);
        this.taxaJuros = taxaJuros;
    }
    public void updateBalance() {
        this.balance += this.balance * taxaJuros;
    }


    @Override
    public final void withdraw(double amount) { // final evita que o metodo seja sobrescrito e evita soreescrita multipla
        balance -= amount;
    }
}

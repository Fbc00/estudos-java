public class Conta {
    private double saldo;
    private Integer id;

    String nameUser;
    final double TAXA_SAQUE = 5.00;

    public Conta(String nameUser, Integer id) {
        this.nameUser = nameUser;
        this.id = id;

    }

    public double getSaldo() {
        return saldo;
    }
    public void deposito(Double valor) {
        this.saldo += valor;
        System.out.println(this);
    }
    public  void  saque(Double valor) {
        this.saldo = (this.saldo -  valor) - this.TAXA_SAQUE;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Conta: " +
                "saldo=" + saldo +
                ", id=" + id;
    }
}

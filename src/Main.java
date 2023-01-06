import java.util.*;


public class Main {
    public static void main(String[] args) {
//        //BrincadeiraInicial.brinca();
//        EntradaDeDados.lerEntrada();
//        MatematicaJava.seiLa(3, 3, '+');
//        MatematicaJava.libMath();
//        CondicionalExerc.CalculaHoras();
       // StringBrincs.brincandoComString();
//        Product product = new Product("algo", 20);
//        product.quantity = 5;
//        System.out.println(product.to_dict_json().get("name"));
//        System.out.println(product.toString())

//        Locale.setDefault(Locale.US);
//        System.out.println("digite o valor do raio: ");
//        double raio = sc.nextDouble();
//
//        double c  = MembrosEstaticos.calculaCircunferencia(raio);
//        double v = MembrosEstaticos.calculaVolume(raio);
//        System.out.printf("Circunferencia: %.2f%n", c);
//        System.out.printf("Volume: %.2f%n", v);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = sc.nextLine();


        System.out.println("digite o id da sua conta: ");
        Integer numberCont = sc.nextInt();
        Conta cont = new Conta(name, numberCont);

        System.out.println("Deseja fazer um deposito inicial ? S/N");
        String res = sc.next();
        Double valor;
        if (res.equals("S")) {
            System.out.println("digite o valor do deposito: ");
            valor = sc.nextDouble();
            cont.deposito(valor);
        }
        sc.close();



    }

}
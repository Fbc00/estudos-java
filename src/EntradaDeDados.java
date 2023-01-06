
import java.util.Scanner;

public class EntradaDeDados {
    static String b;
    static void lerEntrada() {
        Scanner sc = new Scanner(System.in);
        b = sc.next();
        while (!b.equals("sim")) {
            System.out.println("você digitou: " + b);
            b = sc.nextLine(); // ler até apertar enter
            // b = sc.next() // ler string
           // b = sc.nextInt() // ler inteiro
            // b = sc.next().charAt(0) ler caracte

        }
        sc.close();
    }


    public void rutunAlgo() {

    }
}

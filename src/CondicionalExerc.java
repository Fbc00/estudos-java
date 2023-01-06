import java.util.Scanner;

public class CondicionalExerc {

   static void CalculaHoras(){
        int value;
        int BASE_VALUE = 100;
        int BASE_VALUE_EXCEDENTE = 2;
        int VALUE_PAYMENT = 50;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de horas");
        value = sc.nextInt();
        sc.close();

        if (!(value > BASE_VALUE)){
            System.out.println("seu valor a pagar é: $" + VALUE_PAYMENT);
        } else  {
            VALUE_PAYMENT = VALUE_PAYMENT + (value - BASE_VALUE) * BASE_VALUE_EXCEDENTE;
            System.out.println("seu valor a pagar é: $" + VALUE_PAYMENT);
        }
    }
}

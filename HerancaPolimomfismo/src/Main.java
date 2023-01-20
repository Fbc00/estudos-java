import entities.Account;
import entities.BusinessAccount;
import entities.Poupanca;
import exercicio.Employee;
import exercicio.Terceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Account acc = new Account(1001, "Alex", 1000.0);
//        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 1000.0, 500.0);
//        Account poupanca = new Poupanca(1003, "Bob", 1000.0, 0.01);
//
//        poupanca.withdraw(10.0);
//        acc.withdraw(10.0);
//        bacc.withdraw(10.0);
//        System.out.println(poupanca.getBalance());
//        System.out.println(acc.getBalance());
//        System.out.println(bacc.getBalance());
        // UPCASTING
//        Account acc1 = bacc;
//        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
//        Account acc3 = new Poupanca(1004, "Anna", 0.0, 0.01);
//
//        // DOWNCASTING
//        BusinessAccount acc4 =  (BusinessAccount) acc2;
//        if(acc3 instanceof BusinessAccount) {
//            BusinessAccount acc5 = (BusinessAccount) acc3;
//            acc5.loan(100.0);
//            System.out.println("Loan!");
//        } if(acc3 instanceof Poupanca) {
//            Poupanca acc5 = (Poupanca) acc3;
//            acc5.updateBalance();
//            System.out.println("Update!");
//        }
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> funcionarios = new ArrayList<>();
        System.out.print(" Qual é o numero de funcionarios: ");
        int nf = sc.nextInt();

        for (int i = 0; i < nf; i++) {
            System.out.println("é terceirizado ?(y/n)");
            String terceirazado = sc.next();


            System.out.print("name:" );
            String name = sc.next();
            System.out.print("hours:" );
            int hours = sc.nextInt();
            System.out.print("value por hours:" );
            double valuePorhour = sc.nextDouble();
                if (terceirazado.equals("y")) {
                    System.out.print("value adicional:" );
                    double Adicional = sc.nextDouble();
                    Employee funcionario =  new Terceirizado(name, hours, valuePorhour, Adicional);
                    funcionarios.add(funcionario);

                } else {
                    Employee funcionario =  new Employee(name, hours, valuePorhour);
                    funcionarios.add(funcionario);
                }
        }
        sc.close();
        System.out.println("PAYMENT");
        for (Employee e: funcionarios) {
            System.out.println(e.getName() + ": " + e.payment());

        }


    }
}
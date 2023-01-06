
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
//        Timer t = new Timer();
//        MyTask task = new MyTask();
//        t.scheduleAtFixedRate(task, 0, 10000);
//        Pedido pedido = new Pedido(1080, LocalDateTime.now(), OrderStatus.PAGAMENTO_PENDENTE);
//        OrderStatus os1 = OrderStatus.ENTREGUE;
//        OrderStatus os2 = OrderStatus.valueOf("ENTREGUE"); // recebe o valor em formato de string e devolve eu enum
//
//        System.out.println(pedido);

//        System.out.println("Qual é o departamento: ");
//        String departamento = sc.nextLine();
//        System.out.println("enter worker data: ");
//        System.out.println("Name: ");
//        String name = sc.nextLine();
//        System.out.println("Level: ");
//        String level = sc.nextLine();
//        System.out.println("Base salary: ");
//        double baseSalary = sc.nextDouble();
//        Worker worker = new Worker(name, Senioridade.valueOf(level), baseSalary, new Departamento(departamento));
//
//        System.out.println("How many contracts to this worker? ");
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter contract #" + (i + 1) + " data: ");
//            System.out.println("Date (DD/MM/YYYY): ");
//            String date = sc.next();
//            System.out.println("Value per hour: ");
//            double valuePerHour = sc.nextDouble();
//            System.out.println("Duration (hours): ");
//            int hours = sc.nextInt();
//            horasContrato contract = new horasContrato(date, valuePerHour, hours);
//            worker.addContract(contract);
//
//        }
//
//        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
//        String monthAndYear = sc.next();
//        int month = Integer.parseInt(monthAndYear.substring(0, 2));
//        int year = Integer.parseInt(monthAndYear.substring(3));
//        System.out.println("Name: " + worker.name);
//        System.out.println("Department: " + worker.department.name);
//        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.quantoGanhou(month, year)));
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        sc.close();
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p2 = new Post(
                LocalDate.now(),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);
        p2.addComent(c1);
        p2.addComent(c2);
        System.out.println(p2);
    }
}
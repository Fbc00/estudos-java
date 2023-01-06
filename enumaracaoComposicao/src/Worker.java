import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    String name;
    Senioridade workLevel;
    Double BaseSalary;

    List<horasContrato> contracts = new ArrayList<>();
     Departamento department;

    public Worker(String name, Senioridade workLevel, Double baseSalary, Departamento department) {
        this.name = name;
        this.workLevel = workLevel;
        this.BaseSalary = baseSalary;
        this.department = department;
    }

    public void addContract (horasContrato contract) {
        this.contracts.add(contract);
    }

    public void removeContract (horasContrato contract) {
       this.contracts.remove(contract);
    }

    public  double quantoGanhou (Integer month , Integer year) {

        double soma = BaseSalary;
        for (horasContrato c : contracts) {
            if (c.date.getYear() == year && c.date.getMonthValue() == month) {
                soma += c.totalValue();
            }
        }
        return soma;
    }

    public void addDepartment (Departamento department) {
        this.department = department;
    }
}

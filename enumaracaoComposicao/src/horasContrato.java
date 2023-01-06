import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class horasContrato {
    LocalDate date;
    Double valorPorHora;
    Integer horas;

    public horasContrato (String date, Double valorPorHora, Integer horas) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy");
        this.horas = horas;
        this.date = LocalDate.parse(date, fmt);
        this.valorPorHora = valorPorHora;

    }
    public double totalValue() {
        return this.horas * this.valorPorHora;
    }
}

package exercicio;

public class Employee {
    private String name;
    private Integer hours;
    private Double valerPerHour;

    public Employee(String name, Integer hours, Double valerPerHour) {
        this.name = name;
        this.hours = hours;
        this.valerPerHour = valerPerHour;
    }

    public String getName() {
        return name;
    }


    public Integer getHours() {
        return hours;
    }

    public Double getValerPerHour() {
        return valerPerHour;
    }

    public  Double payment() {
        return this.valerPerHour * this.hours;
    }
}

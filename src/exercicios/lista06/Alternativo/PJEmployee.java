package exercicios.lista06.Alternativo;

public class PJEmployee extends Employee{
    private int workedHours;
    private double salaryPerHour;

    public PJEmployee(int workedHours, double salaryPerHour) {
        this.workedHours = workedHours;
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public double paySalary() {
        return workedHours*salaryPerHour;
    }
}

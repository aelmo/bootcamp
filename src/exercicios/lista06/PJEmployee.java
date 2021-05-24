package exercicios.lista06;

public class PJEmployee extends Employee{
    int workedHours;
    double salaryPerHour;

    public PJEmployee(String name, int workedHours, double salaryPerHour) {
        super(name);
        this.workedHours = workedHours;
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public double calculatePaycheck() {
        return workedHours*salaryPerHour;
    }
}

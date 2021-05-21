package exercicios.lista06;

public class PJEmployee extends Employee{
    int workedHours;
    double salaryPerHour;

    public PJEmployee(int workedHours, double salaryPerHour) {
        this.workedHours = workedHours;
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public double calculatePaycheck() {
        return workedHours*salaryPerHour;
    }
}

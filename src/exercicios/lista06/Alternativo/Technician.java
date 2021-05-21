package exercicios.lista06.Alternativo;

public class Technician extends CLTEmployee{
    private int qtyAchievedGoal;
    private double baseSalary = 3200;

    public Technician(String name, int qtyAchievedGoal) {
        super(name);
        this.qtyAchievedGoal = qtyAchievedGoal;
    }

    @Override
    public double paySalary() {
        return baseSalary + 0.05*qtyAchievedGoal*baseSalary;
    }
}

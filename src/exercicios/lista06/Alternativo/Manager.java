package exercicios.lista06.Alternativo;

public class Manager extends CLTEmployee{
    private int qtyAchievedGoal;
    private double baseSalary = 6000;

    public Manager(String name, int qtyAchievedGoal) {
        super(name);
        this.qtyAchievedGoal = qtyAchievedGoal;
    }

    @Override
    public double paySalary() {
        return baseSalary + 0.08*qtyAchievedGoal*baseSalary;
    }
}

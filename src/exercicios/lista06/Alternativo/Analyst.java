package exercicios.lista06.Alternativo;

public class Analyst extends CLTEmployee{
    private int qtyAchievedGoal;
    private double baseSalary = 4000;

    public Analyst(String name, int qtyAchievedGoal) {
        super(name);
        this.qtyAchievedGoal = qtyAchievedGoal;
    }

    public int getQtyAchievedGoal() {
        return qtyAchievedGoal;
    }

    public void setQtyAchievedGoal(int qtyAchievedGoal) {
        this.qtyAchievedGoal = qtyAchievedGoal;
    }

    @Override
    public double paySalary() {
        return baseSalary + 0.08*qtyAchievedGoal*baseSalary;
    }
}

package exercicios.lista06.Alternativo;

public class Director extends CLTEmployee{
    private double companyProfit;
    private double baseSalary = 15000;

    public Director(String name, double companyProfit) {
        super(name);
        this.companyProfit = companyProfit;
    }

    @Override
    public double paySalary() {
        return baseSalary + 0.03*companyProfit;
    }
}

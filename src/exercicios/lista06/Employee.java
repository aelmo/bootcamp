package exercicios.lista06;

public abstract class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calculatePaycheck() {
        return 0D;
    };

    public double calculatePaycheck(double bonus) {
        return 0D;
    };
}

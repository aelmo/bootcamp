package exercicios.lista06.Alternativo;

public class Main {
    public static void main(String[] args) {
        CLTEmployee analyst = new Analyst("Joao",1);
        CLTEmployee technician = new Technician("Pedro",2);
        CLTEmployee manager = new Manager("Marcela",1);
        CLTEmployee director = new Director("Hupert",10000);

        PJEmployee pj = new PJEmployee(40,50);

        System.out.println(analyst.paySalary());
        System.out.println(technician.paySalary());
        System.out.println(manager.paySalary());
        System.out.println(director.paySalary());
        System.out.println(pj.paySalary());
    }
}

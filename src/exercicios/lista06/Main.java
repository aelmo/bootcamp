package exercicios.lista06;

public class Main {
    public static void main(String[] args) {
        PJEmployee pjEmployee = new PJEmployee("Carlos", 100, 20);

        CLTEmployee cltEmployee = new CLTEmployee("Joana", RolesEnum.TECHNICIAN);
        CLTEmployee cltEmployee1 = new CLTEmployee("Joao", RolesEnum.MANAGER);
        CLTEmployee cltEmployee2 = new CLTEmployee("Maria", RolesEnum.DIRECTOR);
        CLTEmployee cltEmployee3 = new CLTEmployee("Jose", RolesEnum.ANALYST);

        System.out.println(pjEmployee.calculatePaycheck());
        System.out.println(cltEmployee.calculatePaycheck(2));
        System.out.println(cltEmployee1.calculatePaycheck(2));
        System.out.println(cltEmployee2.calculatePaycheck(2));
        System.out.println(cltEmployee3.calculatePaycheck(2));
    }
}

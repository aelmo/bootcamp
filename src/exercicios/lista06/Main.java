package exercicios.lista06;

public class Main {
    public static void main(String[] args) {
        PJEmployee pjEmployee = new PJEmployee(100, 20);

        CLTEmployee cltEmployee = new CLTEmployee(RolesEnum.TECHNICIAN);
        CLTEmployee cltEmployee1 = new CLTEmployee(RolesEnum.MANAGER);
        CLTEmployee cltEmployee2 = new CLTEmployee(RolesEnum.DIRECTOR);
        CLTEmployee cltEmployee3 = new CLTEmployee(RolesEnum.ANALYST);

        System.out.println(pjEmployee.calculatePaycheck());
        System.out.println(cltEmployee.calculatePaycheck(2000));
        System.out.println(cltEmployee1.calculatePaycheck(2000));
        System.out.println(cltEmployee2.calculatePaycheck(2000));
        System.out.println(cltEmployee3.calculatePaycheck(2000));
    }
}

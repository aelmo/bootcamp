package exercicios.lista06;

public class CLTEmployee extends Employee {
    RolesEnum role;

    public CLTEmployee(RolesEnum role) {
        this.role = role;
    }

    @Override
    public double calculatePaycheck(double bonus) {
        if(this.role == RolesEnum.TECHNICIAN) {
            return 3200 + 0.05*bonus*3200;
        }

        if(this.role == RolesEnum.ANALYST) {
            return 4000 + 0.08*bonus*4000;
        }

        if(this.role == RolesEnum.MANAGER) {
            return 6000 + 0.08*bonus*6000;
        }

        if(this.role == RolesEnum.DIRECTOR) {
            return 15000 * 0.03*bonus;
        }

        return 0.0;
    }
}

enum RolesEnum  {
    TECHNICIAN,
    ANALYST,
    MANAGER,
    DIRECTOR
}
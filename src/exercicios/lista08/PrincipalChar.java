package exercicios.lista08;

public class PrincipalChar {
    private String name;
    private String role;
    private int level = 0;
    private Weapon weapon;

    public PrincipalChar(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        this.weapon.attack();
    }
}

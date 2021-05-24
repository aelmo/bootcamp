package exercicios.lista08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        PrincipalChar char1 = new PrincipalChar("Guilherme", "Mage");

        Weapon staff = new Staff();
        Weapon blade = new Blade();
        Weapon spear = new Spear();

        char1.setWeapon(staff);
        char1.attack();

        char1.setWeapon(blade);
        char1.attack();

        char1.setWeapon(spear);
        char1.attack();

        ArrayList<Weapon> weapons = new ArrayList<>();

        weapons.add(spear);
        weapons.add(staff);
        weapons.add(blade);

        System.out.println(weapons);
        Collections.sort(weapons, Comparator.comparing(weapon -> weapon.getClass().getName()));
        System.out.println(weapons);
    }
}

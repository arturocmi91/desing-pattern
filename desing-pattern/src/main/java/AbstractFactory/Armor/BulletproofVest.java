package AbstractFactory.Armor;

import AbstractFactory.Armor.Armor;

public class BulletproofVest implements Armor {
    @Override
    public void protect() {
        System.out.println("El chaleco antibalas proteje");
    }
}

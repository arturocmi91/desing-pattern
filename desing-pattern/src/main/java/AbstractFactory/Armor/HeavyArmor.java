package AbstractFactory.Armor;

import AbstractFactory.Armor.Armor;

public class HeavyArmor implements Armor {
    @Override
    public void protect() {
        System.out.println("Armadura pesada proteje");
    }
}

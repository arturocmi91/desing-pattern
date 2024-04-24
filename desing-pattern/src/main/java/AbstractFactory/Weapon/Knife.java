package AbstractFactory.Weapon;

import AbstractFactory.Weapon.Weapon;

public class Knife implements Weapon {
    @Override
    public void damage() {
        System.out.println("Daño por cuchillo");
    }
}

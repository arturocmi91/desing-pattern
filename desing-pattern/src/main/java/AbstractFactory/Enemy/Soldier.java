package AbstractFactory.Enemy;

import AbstractFactory.Enemy.Enemy;

public class Soldier implements Enemy {
    @Override
    public void attack() {
        System.out.println("El soldado ataca ");
    }
}

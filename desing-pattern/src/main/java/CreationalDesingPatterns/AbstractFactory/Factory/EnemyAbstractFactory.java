package CreationalDesingPatterns.AbstractFactory.Factory;


import CreationalDesingPatterns.AbstractFactory.Armor.Armor;
import CreationalDesingPatterns.AbstractFactory.Enemy.Enemy;
import CreationalDesingPatterns.AbstractFactory.Weapon.Weapon;

public abstract class EnemyAbstractFactory {

    // Clase padre que obtiene cada una de las interfaces que las relacionan
    public abstract Enemy createEnemy();

    public abstract Armor createArmor();

    public abstract Weapon createWeapon();


}


package CreationalDesingPatterns.AbstractFactory.Factory;

import CreationalDesingPatterns.AbstractFactory.Armor.Armor;
import CreationalDesingPatterns.AbstractFactory.Armor.HeavyArmor;
import CreationalDesingPatterns.AbstractFactory.Enemy.Enemy;
import CreationalDesingPatterns.AbstractFactory.Enemy.Soldier;
import CreationalDesingPatterns.AbstractFactory.Weapon.Rifle;
import CreationalDesingPatterns.AbstractFactory.Weapon.Weapon;

public class SoldierFactory extends  EnemyAbstractFactory {

    // //Clase hija que sobreescribe el metodo abstracto
    // del padre pero la amolda a su caracteristica,en este caso:
    //Guerrillero( Crea un Enemigo Soldier, Amor HeavyArmor y Weapon Rifle)
    @Override
    public Enemy createEnemy() {
        return new Soldier();
    }

    @Override
    public Armor createArmor() {
        return new HeavyArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new Rifle();
    }
}

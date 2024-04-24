package AbstractFactory.Factory;

import AbstractFactory.Armor.Armor;
import AbstractFactory.Armor.HeavyArmor;
import AbstractFactory.Enemy.Enemy;
import AbstractFactory.Enemy.Soldier;
import AbstractFactory.Weapon.Rifle;
import AbstractFactory.Weapon.Weapon;

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

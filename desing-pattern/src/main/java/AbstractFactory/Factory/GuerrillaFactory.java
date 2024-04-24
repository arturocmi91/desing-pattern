package AbstractFactory.Factory;

import AbstractFactory.Armor.Armor;
import AbstractFactory.Armor.BulletproofVest;
import AbstractFactory.Enemy.Enemy;
import AbstractFactory.Enemy.Guerrilla;
import AbstractFactory.Weapon.Knife;
import AbstractFactory.Weapon.Weapon;

public class GuerrillaFactory extends EnemyAbstractFactory {

    // //Clase hija que sobreescribe el metodo abstracto
    // del padre pero la amolda a su caracteristica,en este caso:
    //Guerrillero( Crea un Enemigo Guerrilla, Amor bulletVest y Weapon Knife)
    @Override
    public Enemy createEnemy() {
        return new Guerrilla();
    }

    @Override
    public Armor createArmor() {
        return new BulletproofVest();
    }

    @Override
    public Weapon createWeapon() {
        return new Knife();
    }
}

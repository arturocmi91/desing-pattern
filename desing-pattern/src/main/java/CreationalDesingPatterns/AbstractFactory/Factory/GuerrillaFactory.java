package CreationalDesingPatterns.AbstractFactory.Factory;

import CreationalDesingPatterns.AbstractFactory.Armor.Armor;
import CreationalDesingPatterns.AbstractFactory.Armor.BulletproofVest;
import CreationalDesingPatterns.AbstractFactory.Enemy.Enemy;
import CreationalDesingPatterns.AbstractFactory.Enemy.Guerrilla;
import CreationalDesingPatterns.AbstractFactory.Weapon.Knife;
import CreationalDesingPatterns.AbstractFactory.Weapon.Weapon;

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

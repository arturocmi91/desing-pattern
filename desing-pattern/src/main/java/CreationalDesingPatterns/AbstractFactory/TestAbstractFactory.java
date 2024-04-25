package CreationalDesingPatterns.AbstractFactory;

import CreationalDesingPatterns.AbstractFactory.Armor.Armor;
import CreationalDesingPatterns.AbstractFactory.Enemy.Enemy;
import CreationalDesingPatterns.AbstractFactory.Factory.EnemyAbstractFactory;
import CreationalDesingPatterns.AbstractFactory.Factory.GuerrillaFactory;
import CreationalDesingPatterns.AbstractFactory.Factory.SoldierFactory;
import CreationalDesingPatterns.AbstractFactory.Weapon.Weapon;

public class TestAbstractFactory {
    public static void main(String[] args0){

        // //Encargada de hacer el test de fabricacion del Objeto:

        //----Guerrillero----
        //Inicializa un factory tipo EnemyAbstractFactory
        EnemyAbstractFactory factory=new GuerrillaFactory();
        //Se definen sus caracteristicas ya preestablecidas por el objeto
        Enemy guerrillero= factory.createEnemy();
        Armor chaleco = factory.createArmor();
        Weapon cuchillo= factory.createWeapon();

        //Se realiza la accion  de cada objeto dado por su metodo sobreescrito de la intefaz implementada
        guerrillero.attack();
        chaleco.protect();
        cuchillo.damage();

        //----Soldado----

        factory= new SoldierFactory();
        Enemy soldado= factory.createEnemy();
        Armor armaduraPesada= factory.createArmor();
        Weapon rifle= factory.createWeapon();

        soldado.attack();
        armaduraPesada.protect();
        rifle.damage();




    }
}

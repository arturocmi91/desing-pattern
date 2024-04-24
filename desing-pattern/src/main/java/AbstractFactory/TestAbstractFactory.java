package AbstractFactory;

import AbstractFactory.Armor.Armor;
import AbstractFactory.Enemy.Enemy;
import AbstractFactory.Factory.EnemyAbstractFactory;
import AbstractFactory.Factory.GuerrillaFactory;
import AbstractFactory.Factory.SoldierFactory;
import AbstractFactory.Weapon.Weapon;

public class TestAbstractFactroy {
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

package CreationalDesingPatterns.AbstractFactory.Armor;

public class BulletproofVest implements Armor {
    @Override
    public void protect() {
        System.out.println("El chaleco antibalas proteje");
    }
}

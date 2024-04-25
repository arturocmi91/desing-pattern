package CreationalDesingPatterns.AbstractFactory.Armor;

public class HeavyArmor implements Armor {
    @Override
    public void protect() {
        System.out.println("Armadura pesada proteje");
    }
}

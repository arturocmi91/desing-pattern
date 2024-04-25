package CreationalDesingPatterns.AbstractFactory.Weapon;

public class Rifle implements Weapon {
    @Override
    public void damage() {
        System.out.println("Daño por Rilfe ");
    }
}

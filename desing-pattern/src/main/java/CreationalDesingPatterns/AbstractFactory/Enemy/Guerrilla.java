package CreationalDesingPatterns.AbstractFactory.Enemy;

public class Guerrilla implements Enemy {
    @Override
    public void attack() {
        System.out.println("El guerrillero ataca ");
    }
}

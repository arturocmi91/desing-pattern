package CreationalDesingPatterns.AbstractFactory.Factory;

public class Animal implements Thing {
    @Override
    public void run() {
        System.out.println("El animal Corre");

    }

    @Override
    public void jump() {
        System.out.println("El animal Salta");

    }
}

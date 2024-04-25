package CreationalDesingPatterns.AbstractFactory.FactoryMethod;

public class Helicopter implements AirThing {


    @Override
    public void fly() {
        System.out.println("El helicoptero vuela");
    }

    @Override
    public void landing() {
        System.out.println("El helicoptero aterriza");

    }
}

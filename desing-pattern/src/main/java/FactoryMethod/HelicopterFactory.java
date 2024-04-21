package FactoryMethod;

public class HelicopterFactory extends ThingFactory {


    @Override
    public AirThing createdThing() {
        return new Helicopter();
    }
}

package CreationalDesingPatterns.FactoryMethod;

public class PlaneFactory extends ThingFactory {


    @Override
    public AirThing createdThing() {

        return new Plane();
    }
}

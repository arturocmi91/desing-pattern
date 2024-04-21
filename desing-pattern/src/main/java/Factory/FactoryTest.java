package Factory;

public class FactoryTest {
    public static void main(String[] args) {
        ThingFactory thingFactory= new ThingFactory();

        Thing animal= thingFactory.createdThing("Animal");
        Thing human = thingFactory.createdThing("Human");

        animal.jump();
        animal.run();

        human.jump();
        human.jump();

    }

}
package Factory;

public class TestFactory {
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
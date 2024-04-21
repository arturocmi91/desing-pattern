package FactoryMethod;

import Factory.Thing;

public class Plane implements AirThing {


    @Override
    public void fly() {
        System.out.println("El avion vuela");
    }

    @Override
    public void landing() {
        System.out.println("El avion aterriza");

    }
}

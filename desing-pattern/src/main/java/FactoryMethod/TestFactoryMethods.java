package FactoryMethod;



public  class TestFactoryMethods {
    public static void main(String[] args) {

      AirThing plane= new  PlaneFactory().createdThing();
      AirThing helicoptero=  new HelicopterFactory().createdThing();

      plane.fly();
      helicoptero.landing();









    }

}
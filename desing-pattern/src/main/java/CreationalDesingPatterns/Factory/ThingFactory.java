package CreationalDesingPatterns.Factory;

public class ThingFactory {
//Metodo encargado de crear las cosas
    public Thing createdThing(String type){

        if (type.equalsIgnoreCase("Animal")){


            return new Animal();


        } else if (type.equalsIgnoreCase("Human")) {
            return new Human();
        }else {
            return null;
        }

    }
}
